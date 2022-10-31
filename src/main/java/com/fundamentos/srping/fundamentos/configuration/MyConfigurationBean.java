package com.fundamentos.srping.fundamentos.configuration;

import com.fundamentos.srping.fundamentos.component.bean.MyBean;
import com.fundamentos.srping.fundamentos.component.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean BeanOperation(){
        return new MyBeanImplement();
    }
}
