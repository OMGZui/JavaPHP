package com.example.omgzui.controller;

import com.example.omgzui.model.Girl;
import com.example.omgzui.repository.GirlRepository;
import com.example.omgzui.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    // 列表
    @GetMapping(value = "/list")
    public List<Girl> index() {
        return girlRepository.findAll();
    }

    // 详情
    @GetMapping(value = "/detail/{id}")
    public Optional<Girl> detail(@PathVariable("id") Integer id) {
        return girlRepository.findById(id);
    }

    //新增
    @PostMapping(value = "/add")
    public Girl add(@RequestParam("cupSize") String cupSize,
                    @RequestParam("age") Integer age,
                    @RequestParam("money") Double money) {

        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setMoney(money);

        return girlRepository.save(girl);
    }

    // 修改
    @PutMapping(value = "/update/{id}")
    public Girl update(@PathVariable("id") Integer id,
                       @RequestParam("cupSize") String cupSize,
                       @RequestParam("age") Integer age,
                       @RequestParam("money") Double money) {

        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setMoney(money);

        return girlRepository.save(girl);
    }

    // 删除
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }

    // 尺寸为xx的女生
    @GetMapping(value = "cup/{cupSize}")
    public List<Girl> getCup(@PathVariable("cupSize") String cupSize){
        return girlRepository.getCup(cupSize);
    }

    // 价格为xx的女生
    @GetMapping(value = "money/{money}")
    public List<Girl> getMoney(@PathVariable("money") Double money){
        return girlRepository.findByMoney(money);
    }

    // 年龄为xx的女生
    @GetMapping(value = "age/{age}")
    public List<Girl> getAge(@PathVariable("age") Integer age){
        return girlRepository.getAge(age);
    }

}
