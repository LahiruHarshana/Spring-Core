package lk.ijse.spring.bean;


import org.springframework.stereotype.Component;

@Component
public class Tharushi implements GoodGirl{
    public Tharushi() {
        System.out.println("Tharushi - Constructor");
    }
    @Override
    public void love() {

    }
}
