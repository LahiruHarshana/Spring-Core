package lk.ijse.spring.config;

import com.edu.ijse.javaBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.JavaBean;

@Configuration
//@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
//@ComponentScan(basePackageClasses = {PojoOne.class, Bean.class})
@ComponentScan
public class AppConfig {


    @Bean
    public javaBean getJavaBean() {

        javaBean javaBean = new javaBean();
        return javaBean;
    }

}
