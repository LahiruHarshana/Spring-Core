package lk.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
