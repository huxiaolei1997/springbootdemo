package com.imooc.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManController {

    @Autowired
    private ManRepository manRepository;

    @Autowired
    private ManService manService;
    /**
     * 查询所有的manList
     * @return
     */
    @GetMapping(value = "/man")
    public List<Man> manList() {
        return manRepository.findAll();
    }

    /**
     * 添加一个 man
     * @param age
     * @param name
     * @return
     */
    @PostMapping(value = "/man")
    public Man manAdd(@RequestParam("age") Integer age, @RequestParam("name") String name) {
        Man man = new Man();
        man.setAge(age);
        man.setName(name);

        return manRepository.save(man);
    }

    // 查询一个man（通过 id 来查询）
//    @GetMapping(value = "/man/{id}")
//    public Man manFindOne(@PathVariable("id") Integer id) {
//        // 不能按照下面这么写，如果是2.0以上的版本
//        //return manRepository.findOne(id);
//        // 可以这么写
//        return manRepository.findById(id).orElse(null);
//    }
    // 根据年龄来查询man，查询到的可能是一个集合
    @GetMapping(value = "/man/{age}")
    public List<Man> manListFindByAge(@PathVariable("age") Integer age) {
        // 不能按照下面这么写，如果是2.0以上的版本
        //return manRepository.findOne(id);
        // 可以这么写
        return manRepository.findByAge(age);
    }

    // 更新
    @PutMapping(value = "/man/{id}")
    public Man manUpdate(@PathVariable("id") Integer id, @RequestParam("age") Integer age, @RequestParam("name") String name) {
        Man man = new Man();
        man.setId(id);
        man.setAge(age);
        man.setName(name);

        return manRepository.save(man);
    }

    // 删除
    @DeleteMapping(value = "/man/{id}")
    public void manDelete(@PathVariable("id") Integer id) {
        manRepository.deleteById(id);
    }

    @PostMapping(value = "/man/two")
    public void manTwo() {
        manService.insertTwo();
    }
}
