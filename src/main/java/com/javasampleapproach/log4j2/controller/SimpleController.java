package com.javasampleapproach.log4j2.controller;

import com.javasampleapproach.log4j2.domain.NewClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

@ControllerAdvice
@RestController
public class SimpleController  implements ErrorController{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String PATH = "/error";
    @RequestMapping("/")
    String hello(){
        NewClass newClass = new NewClass();
        ArrayList<String> list =newClass.getList();

        String message = String.join("",list.stream().map(x->x+"<br/>").collect(Collectors.toList()));

        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");

        return message;

    }

    @RequestMapping("/112")
    String hello1(){
        return "/11retwwer2";

    }

    @GetMapping("{id}")
    public String getInt(@PathVariable(name = "id") int id) {

        return String.valueOf(id);
    }


    @RequestMapping(value = PATH)
    public String error() {

        /*PageNotFoundException ex =new PageNotFoundException();
        throw   ex;*/
        return  "Страница не найдена";
    }

    @Override
    public String getErrorPath() {
        return "asdfasd";
    }


}