package com.example.versiondisplay.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VersionController {

    @GetMapping("/")
    public String getVersions(Model model) {
        model.addAttribute("javaVersion", System.getProperty("java.version"));
        model.addAttribute("springBootVersion", SpringBootVersion.getVersion());
        model.addAttribute("springFrameworkVersion", SpringVersion.getVersion());
        
        return "index";
    }
}