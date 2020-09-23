package com.worktest.work.bean.service;

import com.worktest.work.bean.domain.BeanTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class BeanTestService {


    String beanName;

//    @Override
//    public void setBeanName(String name) {
//        this.beanName = name;
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
////进行相关属性操作 这个是在初始化之后的。运用的话看，可以在新建啥的自动赋值
//    }


}
