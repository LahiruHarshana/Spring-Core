package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    private String name;

    public SpringBean1(String name) {

        System.out.println("SpringBean1 Instantiated....");
    }
}
