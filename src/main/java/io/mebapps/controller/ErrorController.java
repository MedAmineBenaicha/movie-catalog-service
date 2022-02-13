package io.mebapps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("/error")
    public String ShowError(){
        return "This page for Error";
    }
}
