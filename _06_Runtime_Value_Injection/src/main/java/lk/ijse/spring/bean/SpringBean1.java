package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    private String name;

    public SpringBean1() {
        System.out.println("SpringBean1 Instantiated....");
    }
}
