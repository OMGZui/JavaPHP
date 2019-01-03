package com.example.omgzui.service;

import com.example.omgzui.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;
}
