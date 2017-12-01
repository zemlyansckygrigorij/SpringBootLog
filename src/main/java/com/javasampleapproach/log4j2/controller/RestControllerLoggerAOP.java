package com.javasampleapproach.log4j2.controller;

import com.javasampleapproach.log4j2.service.NewClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RestControllerLoggerAOP{
    @Autowired
    private NewClassService newClassService;

    /**
     * @return
     */
    @GetMapping(value = "/getList")
    public ResponseEntity<List<String>> getStringList(){
        return new ResponseEntity<List<String>>(newClassService.getList(), HttpStatus.OK);
    }

}
