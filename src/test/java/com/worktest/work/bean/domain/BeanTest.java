package com.worktest.work.bean.domain;


import com.worktest.work.bean.service.BeanTestService;
import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class BeanTest  {
    private String name;

}
