package lk.ijse.spring.bean;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    String name;
    int age;
    boolean isMale;

    float height;
//    public SpringBean(String name, int age, boolean isMale) {
//        this.name = name;
//        this.age = age;
//        this.isMale = isMale;
//        System.out.println("SpringBean Instantiated via Spring");
//        System.out.printf("Name: %s, Age: %d, IsMale: %b\n", name, age, isMale);
//    }



    public SpringBean(String name, int age, boolean isMale,@Nullable float height) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s, Age: %d, IsMale: %b, Height: %f\n", name, age, isMale, height);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s, Age: %d, IsMale: %b\n", name, age, isMale);
    }


    @Autowired(required = false)
    public SpringBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s, Age: %d\n", name, age);
    }

    public SpringBean(String name) {
        this.name = name;
        System.out.println("SpringBean Instantiated via Spring");
        System.out.printf("Name: %s\n", name);
    }

    public SpringBean() {
        System.out.println("SpringBean Instantiated via Spring");
    }
}
