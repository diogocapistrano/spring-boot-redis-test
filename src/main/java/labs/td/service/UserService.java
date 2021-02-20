package labs.td.service;

import labs.td.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(cacheNames = "users", key = "#root.method.name")
    public String get() {
        return userRepository.get();
    }

}