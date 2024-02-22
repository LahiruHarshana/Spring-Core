package lk.ijse.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public String name(){
        return "SpringBean1";
    }
}
