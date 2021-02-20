package labs.td.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TheController {

//    @ResponseBody
//    @RequestMapping(value = "/test2")
//    public String handle2(WebRequest swr) {
//
//        if (swr.checkNotModified(getResourceLastModified(swr), getETag(swr))) {
//            //it will return 304 with empty body
//            return notModified(swr);
//            // returning null would have worked but spring-security resets cache headers, return notModified(swr)
//        }
//
//        return response("<p>Last modified epoch: " + getResourceLastModified(swr) +
//                "</p><a href='test2'>test2</a>", swr);
//    }
//
//    private <T, R> ResponseEntity<R> response(T entity, WebRequest swr) {
//        /*If 'Cache-Control:max-age: x' where x >0, we have to do hard refresh to see the changes until browser expires the cache in x seconds. max-age:0 solves this problem by making browsers always re-validate with server before using the cache*/
//
//        return ofNullable(entity)
//                .map(e -> ok()
//                        .cacheControl(CacheControl.maxAge(0, TimeUnit.SECONDS).cachePrivate().mustRevalidate())
//                        .eTag(getETag(swr))
//                        .lastModified(getResourceLastModified(swr))
//                        .body(e)
//                )
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    private <T> ResponseEntity<T> notModified(WebRequest swr) {
//        return ResponseEntity.status(HttpStatus.NOT_MODIFIED)
//                .cacheControl(CacheControl.maxAge(0, TimeUnit.SECONDS).cachePrivate().mustRevalidate())
//                .lastModified(getResourceLastModified(swr))
//                .eTag(getETag(swr))
//                .build();
//    }
//
//    private String getEtag(WebRequest swr) { ... // you can use sessionId swr.resolveReference("session") }
//
//        private long getResourceLastModified (WebRequest swr)
//        {  // access api request params, to determine last-modified}
//
//            @ResponseBody
//            @RequestMapping(value = "/test3")
//            public ResponseEntity<String> handle3 (WebRequest swr){
//
//            String testBody = "<p>Response time: " + LocalDateTime.now() +
//                    "</p><a href='test3'>test3</a>";
//
//            //returning ResponseEntity with lastModified, HttpEntityMethodProcessor will
//            //take care of populating/processing the required headers.
//            //As the body can be replaced with empty one and 304 status can be send back,
//            // this approach should be avoided if preparing the response body is very expensive.
//            return ResponseEntity.ok()
//                    .cacheControl(CacheControl.maxAge(0, TimeUnit.SECONDS).cachePrivate().mustRevalidate())
//                    .eTag(getETag(swr))
//                    .lastModified(getResourceLastModified(swr))
//                    .body(testBody)
//        }
//        }
//    }
}