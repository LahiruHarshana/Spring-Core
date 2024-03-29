package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        Object springBean = ctx.getBean("springBean");
        System.out.println(springBean);


        Object springBean1 = ctx.getBean("springBean");
        System.out.println(springBean1);


    }
}
