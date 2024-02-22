package lk.ijse.spring.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 {
    @Autowired
    private Environment environment;
    public SpringBean3() {
        System.out.println("SpringBean3 Instantiated via Spring");
    }

    @PostConstruct
    public void init(){
        System.out.println("SpringBean3 Initialized....");
        String name = environment.getProperty("app.env1");
        System.out.println(name);
    }
}
