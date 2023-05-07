package com.develhope.Deploy1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameDevController {

    @Autowired
    private Environment environment;

    @GetMapping("/aa")
    public String devName(){
        String var= environment.getProperty("myCustomVarTree.mycustomvar");
        return var;
    }

}
