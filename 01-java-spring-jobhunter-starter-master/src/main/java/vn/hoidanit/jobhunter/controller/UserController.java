package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/create")
    public String createUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("bvsbd@gmai.com");
        user.setPassword("password123");
        userService.handleCreateUser(user);
        return "Create user";
    }

    
}
