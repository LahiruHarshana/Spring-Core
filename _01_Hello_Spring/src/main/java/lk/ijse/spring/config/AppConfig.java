package lk.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
@ComponentScan(basePackageClasses = {lk.ijse.spring.pojo.PojoOne.class, com.edu.ijse.Bean.class})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
