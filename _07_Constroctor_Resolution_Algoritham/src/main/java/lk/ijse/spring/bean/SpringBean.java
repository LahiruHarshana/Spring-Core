package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    String name;
    int age;
    boolean isMale;

    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("isMale : " + isMale);
    }
}
