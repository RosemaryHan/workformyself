package com.worktest.work.bean.util;

import com.worktest.work.bean.domain.BeanTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class LubanBeanFactoryPost implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        GenericBeanDefinition beanTestService = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition("beanTestService");
        System.out.println(beanTestService.getBeanClass());
        beanTestService.setBeanClass(BeanTest.class);
    }
}
