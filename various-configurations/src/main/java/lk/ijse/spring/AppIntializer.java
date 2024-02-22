package lk.ijse.spring;

import lk.ijse.spring.dao.DaoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppIntializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.register(DaoConfig.class);
        ctx.register(BOConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
