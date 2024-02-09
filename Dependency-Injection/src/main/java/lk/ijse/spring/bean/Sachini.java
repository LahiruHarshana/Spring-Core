package lk.ijse.spring.bean;


import org.springframework.stereotype.Component;

@Component
public class Sachini implements GoodGirl{
    public Sachini() {
        System.out.println("sachini - Constructor");
    }

    @Override
    public void love() {

    }
}
