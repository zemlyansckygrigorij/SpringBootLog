package com.javasampleapproach.log4j2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.javasampleapproach.log4j2.domain.NewClass;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
@Slf4j
public class NewClassService{
    private NewClass newClass=new NewClass();

    public List<String> getList(){
        return newClass.getList();
    }
}
