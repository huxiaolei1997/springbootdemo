package com.imooc.springbootdemo.service;

import com.imooc.springbootdemo.repository.ManRepository;
import com.imooc.springbootdemo.domain.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManService {
    @Autowired
    private ManRepository manRepository;

    @Transactional
    // 这里需要注意的是如果建表时使用的引擎是MyISAM，那么是不支持事务回滚的，需要改为 InnoDB
    public void insertTwo() {
        Man manA = new Man();
        manA.setName("Tony");
        manA.setAge(21);
        manRepository.save(manA);

        Man manB = new Man();
        manB.setName("Tony2Tony2Tony2Tony2Tony2Tony2");
        manB.setAge(23);
        manRepository.save(manB);
    }
}
