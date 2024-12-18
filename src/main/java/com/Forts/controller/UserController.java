package com.Forts.controller;
import com.Forts.entity.User;
import com.Forts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String landingPage() {
        return "index";
    }

    @GetMapping("/signin")
    public String signInPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public String signIn(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.authenticateUser(username, password);
        if (user != null) {
            return "redirect:/home";
        }
        model.addAttribute("error", "Invalid credentials");
        return "signin";
    }

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(User user) {
        userService.registerUser(user);
        return "redirect:/signin";
    }

    @GetMapping("/home")
    public String successPage() {
        return "home";
    }
}
