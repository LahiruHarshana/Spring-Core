package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {


    @Bean
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }
}