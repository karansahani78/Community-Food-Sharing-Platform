package com.karan.Community.Food.Sharing.Platform.Controllers;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karan.Community.Food.Sharing.Platform.Entities.User;
import com.karan.Community.Food.Sharing.Platform.Repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Endpoint to get all registered users
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Endpoint to get user by specific id
    @GetMapping("/getUserById/{id}")
    private User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(
                "User not found for id: " + id));
    }

    // To update user
    @PutMapping("/update/{id}")
    private User updateUser(@PathVariable Long id, @RequestBody User UserDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found for id " + id));
        user.setName(UserDetails.getName());
        user.setAddress(UserDetails.getAddress());
        user.setEmail(UserDetails.getEmail());
        user.setUserID(UserDetails.getUserID());
        user.setPassword(UserDetails.getPassword());
        return userRepository.save(user);
    }

    // To delete user
    @DeleteMapping("/deleteuser/{id}")
    private void deleteUserById(@PathVariable Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found for id " + id));
        userRepository.delete(user);
    }

    // Login method
    @PostMapping("/login")
    public User loginUser(@RequestBody User loginUser) {
        User user = userRepository.findByEmail(loginUser.getEmail());
        if (user != null && user.getPassword().equals(loginUser.getPassword())) {
            return user;
        } else {
            throw new EntityNotFoundException("Invalid email or password");
        }
    }
}
