package se.tre.oauth.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.tre.oauth.domain.User;

import java.security.Principal;

@RestController
public class UserApi {

    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    public ResponseEntity getUserDetails(Principal user) {
        if (user != null) {
            User userDetails = new User(user.getName());
            return ResponseEntity.ok(ImmutableMap.of("user", userDetails));
        }
        return ResponseEntity.ok().build();
    }
}
