package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam(value = "name", defaultValue = "zui") String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
        }
        return list;
    }

}
