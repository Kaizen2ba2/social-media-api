package com.api.socialmedia;

import com.api.socialmedia.models.User;
import com.api.socialmedia.repositories.UserRepository;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(UserDto userDto){

       try{

           if(userRepository.findByUsername(userDto.username()) != null){
               throw new IllegalArgumentException("Username already exists");
           }
           if(userRepository.findByEmail(userDto.email()) != null){
               throw new IllegalArgumentException("This email is already linked to another account");
           }

           User newUser = new User();
           newUser.setUsername(userDto.username());
           newUser.setEmail(userDto.email());
           newUser.setPassword(userDto.password());

           userRepository.save(newUser);

       }catch (IllegalArgumentException e){
           throw new RuntimeException("Error registering user" + e.getMessage(), e);
       }

    }

}
