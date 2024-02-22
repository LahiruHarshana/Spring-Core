package lk.ijse.spring;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public String name(){
        return "SpringBean1";
    }
}
