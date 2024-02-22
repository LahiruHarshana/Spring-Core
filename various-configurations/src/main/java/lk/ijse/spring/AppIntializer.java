package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppIntializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.register(Config1.class);
        ctx.register(Config2.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
