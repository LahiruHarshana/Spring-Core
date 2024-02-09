package lk.ijse.spring;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        boolean javaBean =
                ctx.containsBeanDefinition("javaBean");
        boolean pojoOne =
                ctx.containsBeanDefinition("pojoOne");
        System.out.println("JavaBean : " + javaBean);
        System.out.println("PojoOne : " + pojoOne);
        ctx.close();
    }
}
 