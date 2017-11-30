package com.javasampleapproach.log4j2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
public class SimpleController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
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
       // return "Done1";
    }

    @RequestMapping("/112")
    String hello1(){
        return "/11retwwer2";
        // return "Done1";
    }

    @GetMapping("{id}")
    public String getInt(@PathVariable(name = "id") int id) {

        return String.valueOf(id);
    }

   /* @GetMapping("")
    public String getString(@PathVariable(name = "id") String id) {

        return "erwtwetew";
    }*/
    private static final String PATH = "/error";

   /* @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }*/
}