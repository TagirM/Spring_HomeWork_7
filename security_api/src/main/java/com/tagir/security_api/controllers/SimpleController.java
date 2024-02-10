package com.tagir.security_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    /**
     * Страница доступная с ролью admin
     * @return
     */

    @GetMapping("/private-data")
    public String privateHello(){
        return "private-data";
    }

    /**
     * Страница доступная с ролью user
     * @return
     */

    @GetMapping("/public-data")
    public String publicHello(){
        return "public-data";
    }

    /**
     * Страница логирования
     * @return
     */

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * Общедоступная первоначальная страница
     * @return
     */
    @GetMapping("/")
    public String startPage(){
        return "index";
    }
}
