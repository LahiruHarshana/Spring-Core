package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Map<String, String> getenv = System.getenv();

        for (Map.Entry<String, String> entry : getenv.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        System.getProperties().forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
