package com.Ihnsod.spring.controller.transactional;


import com.Ihnsod.common.result.BaseResult;
import com.Ihnsod.spring.pojo.transactional.Student;
import com.Ihnsod.spring.service.transactional.TransactionalServiceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Ihnsod
 * @create: 2019/01/02 22:27
 **/
@RestController
@RequestMapping("transactional")
public class TransactionalController {

    @Autowired
    private TransactionalServiceOne transactionalServiceOne;

    @RequestMapping("/demo1")
    public BaseResult transactionalDemo1() {

        transactionalServiceOne.transactionalOne();

        return BaseResult.successPojo(null);
    }


    @RequestMapping("/demo2")
    public BaseResult transactionalDemo2() {

        transactionalServiceOne.transactionalTwo();

        return BaseResult.successPojo(null);
    }

    @RequestMapping("/demo3")
    public BaseResult transactionalDemo3() {

        transactionalServiceOne.transactionalTwo();

        return BaseResult.successPojo(null);
    }

    @RequestMapping("/demo8")
    public BaseResult transactionalDemo4() {

        transactionalServiceOne.transactionalTwo();

        return BaseResult.successPojo(null);
    }

    @PostMapping("/student")
    public BaseResult opDemo(Student student) {
        System.err.println(student.toString());
        return BaseResult.successPojo(student);
    }
}
