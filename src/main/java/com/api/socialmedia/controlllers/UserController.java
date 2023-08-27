package com.api.socialmedia.controlllers;

import com.api.socialmedia.UserService;
import dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody @Valid UserDto userDto){

        userService.registerUser(userDto);
        return ResponseEntity.ok("Successfully registered user");

    }

}
