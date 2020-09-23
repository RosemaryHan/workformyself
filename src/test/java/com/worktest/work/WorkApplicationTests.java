package com.worktest.work;

import com.worktest.work.aop.dao.AOPTeatDao;
import com.worktest.work.aop.config.Appconfig;
import com.worktest.work.bean.service.BeanTestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class WorkApplicationTests {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(ac.getBean("beanTestService"));
    }
    @Test
    void contextLoads() {
    }

}
