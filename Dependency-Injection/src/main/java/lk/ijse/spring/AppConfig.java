package lk.ijse.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public String myString1(){
        return "Hello Spring1";
    }

    @Bean
    public String myString2() {
        return "Hello Spring2";
    }
}
