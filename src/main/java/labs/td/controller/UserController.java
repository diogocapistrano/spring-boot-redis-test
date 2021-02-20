package labs.td.controller;

import labs.td.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<String> get(WebRequest request, @RequestHeader Map<String, String> headers) {
        CacheControl cacheControl = CacheControl.maxAge(30, TimeUnit.SECONDS)
                .cachePublic();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 30);
        if(request.checkNotModified("teste", calendar.getTimeInMillis())) {
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED)
                    .cacheControl(cacheControl)
//                    .lastModified(LocalDate.now().toEpochDay())
                    .eTag("test")
                    .build();
        }
        System.out.println("teste");

        return ResponseEntity.ok()
                .cacheControl(cacheControl)
                .eTag("teste")
                .lastModified(new Date().getTime())
                .body(userRepository.get());
    }

}