package labs.td;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
@EnableRedisRepositories
public class App {
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}