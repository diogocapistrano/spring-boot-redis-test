package labs.td.repository;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;

@RedisHash("user")
public class User {
    @Id
    String id;
    String name;
}