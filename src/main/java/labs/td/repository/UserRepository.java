package labs.td.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String get() {
        return "Diogo";
    }
}