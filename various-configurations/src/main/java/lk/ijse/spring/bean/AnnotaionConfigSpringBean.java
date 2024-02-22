package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class AnnotaionConfigSpringBean {
    public AnnotaionConfigSpringBean() {
        System.out.println("Annotaion Config Spring Bean Instantiated...");
    }

    public void setName(String name) {
        System.out.println("Name : " + name);
    }
}
