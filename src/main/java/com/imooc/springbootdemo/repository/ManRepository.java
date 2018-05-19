package com.imooc.springbootdemo.repository;

import com.imooc.springbootdemo.domain.Man;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManRepository extends JpaRepository<Man, Integer> {
    // 通过年龄来查询man
    List<Man> findByAge(Integer age);
}
