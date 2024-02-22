package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBean2;
import lk.ijse.spring.bean.SpringBean4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public SpringBean2 springBean2(){
        springBean4();
        springBean4();
        springBean4();
        springBean4();
        return new SpringBean2(springBean4());
    }

    @Scope("prototype")
    @Bean
    public SpringBean4 springBean4(){
        return new SpringBean4();
    }

    public String myName(){
        System.out.println("My Name Method Called...");
        return "Amal Perera";
    }
}