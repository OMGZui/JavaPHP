package com.example.omgzui.controller;

import com.example.omgzui.model.Girl;
import com.example.omgzui.repository.GirlRepository;
import com.example.omgzui.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "")
    public List<Girl> index(){
        return girlRepository.findAll();
    }
}
