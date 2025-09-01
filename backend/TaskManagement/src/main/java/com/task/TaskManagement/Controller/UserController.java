package com.task.TaskManagement.Controller;

import com.task.TaskManagement.Model.UserModel;
import com.task.TaskManagement.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<UserModel> login(@RequestParam String username,@RequestParam String password)
    {
        UserModel user = userService.userLogin(username,password);
        return user!=null ? ResponseEntity.ok(user) : ResponseEntity.ok(null);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody UserModel user)
    {
        System.out.println(user.toString());
        boolean isValid = userService.createUser(user);
        return isValid ? ResponseEntity.ok("User Created") : ResponseEntity.ok("Username already exists");
    }
}
