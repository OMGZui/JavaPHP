package com.example.omgzui.repository;

import com.example.omgzui.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 原生sql
    @Query(value = "select * from girl where cup_size = ?1", nativeQuery = true)
    List<Girl> getCup(String cupSize);

    // 原生sql绑定
    @Query(value = "select * from girl where age = :age", nativeQuery = true)
    List<Girl> getAge(@Param("age") Integer age);

    // 方法名自动查询
    List<Girl> findByMoney(Double money);
}
