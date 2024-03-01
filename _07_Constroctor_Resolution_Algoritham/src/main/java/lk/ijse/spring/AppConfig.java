package lk.ijse.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated via Spring");
    }

    @Bean
    public String name(){
        return "SpringBean1";
    }

    @Bean
    public int age(){
        return 10;
    }
}
