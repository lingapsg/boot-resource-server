package se.tre.oauth.controller;

import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.tre.oauth.domain.User;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserApi.class);

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResponseEntity getUserDetails(Principal user) {
        if (user != null) {
            LOGGER.info("user :"+user.getName());
            User userDetails = new User(user.getName());
            return ResponseEntity.ok(ImmutableMap.of("user", userDetails));
        }
        return ResponseEntity.ok().build();
    }
}
