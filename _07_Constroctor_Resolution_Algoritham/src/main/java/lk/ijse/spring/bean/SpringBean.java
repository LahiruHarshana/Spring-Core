package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    String name;
    int age;
    boolean isMale;

    float height;
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s, Age: %d, IsMale: %b\n", name, age, isMale);
    }

    public SpringBean(String name, int age, boolean isMale, float height) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s, Age: %d, IsMale: %b, Height: %f\n", name, age, isMale, height);
    }
}
