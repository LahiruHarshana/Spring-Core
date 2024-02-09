package lk.ijse.spring.config;


import com.edu.ijse.Bean;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.JavaBean;

@Configuration
//@ComponentScan(basePackages = {"lk.ijse.spring","com.edu.ijse"})
@ComponentScan(basePackageClasses = {PojoOne.class, Bean.class})
public class AppConfig {
//

    public JavaBean getJavaBean(){
        return new JavaBean();
    }
}
