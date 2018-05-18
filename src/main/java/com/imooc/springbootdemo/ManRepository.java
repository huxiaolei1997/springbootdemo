package com.imooc.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManRepository extends JpaRepository<Man, Integer> {
    // 通过年龄来查询man
    List<Man> findByAge(Integer age);
}
