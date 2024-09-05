package com.scaler.demo.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/name")
    public @ResponseBody String getName(){
        StringBuilder sb = new StringBuilder("Java");
        String string = """
                My name is "%s" """.formatted(sb);
        List<Integer> nos = new ArrayList<>();
        nos.add(10);
        nos.add(14);
        for(Object o : nos){
            System.out.print(o +",");
        }
        int i=0,j=0;
        try {
            System.out.print(i / j);
        }catch (RuntimeException e){
            System.out.print(-1);
        }
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        d.poll();
        System.out.print(d);
        return string;
    }
}
