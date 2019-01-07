package com.example.omgzui.service;

import com.example.omgzui.enums.ResultEnum;
import com.example.omgzui.exception.GirlException;
import com.example.omgzui.model.Girl;
import com.example.omgzui.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public void getAgeById(Integer id) throws GirlException {
        Optional<Girl> girl = girlRepository.findById(id);
        if (girl.isPresent()) {
            Integer age = girl.get().getAge();
            if (age < 10) {
                throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
            } else if (age > 10 && age < 16) {
                throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
            } else {
                throw new GirlException(ResultEnum.SUCCESS);
            }

        } else {
            throw new GirlException(ResultEnum.UNKNOWN_ERROR);
        }
    }
}
