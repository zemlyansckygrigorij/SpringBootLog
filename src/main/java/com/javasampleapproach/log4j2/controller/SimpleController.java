package com.javasampleapproach.log4j2.controller;

import com.javasampleapproach.log4j2.domain.NewClass;
import com.javasampleapproach.log4j2.service.NewClassService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@RestController
public class SimpleController  {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String PATH = "/error";
    @Autowired
    private NewClassService newClassService;

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


//    @RequestMapping(value = PATH)
//    public String error() {
//
//
//
//        return  "Страница не найдена";
//    }



/*
    @GetMapping(value = "/getList")
    public ResponseEntity<List<String>> getStringList(){
        return new ResponseEntity<List<String>>(newClassService.getList(), HttpStatus.OK);
    }
*/
}