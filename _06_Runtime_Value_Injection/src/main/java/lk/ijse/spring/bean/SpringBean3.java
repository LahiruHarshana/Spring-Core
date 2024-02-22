package lk.ijse.spring.bean;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 {
    private Environment environment;
    public SpringBean3() {
        System.out.println("SpringBean3 Instantiated via Spring");
    }
}
