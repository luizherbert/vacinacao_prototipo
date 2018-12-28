package com.prototipo.vacinacaoweb.controllers;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login.html")
    public String login() {
        return "login.html";
    }

    @RequestMapping("/login-erro.html")
    public String loginErro(Model model) {
        model.addAttribute("loginErro", true);
        return "login.html";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        new SecurityContextLogoutHandler().logout(request, null, null);
        return "login.html";
    }
}
