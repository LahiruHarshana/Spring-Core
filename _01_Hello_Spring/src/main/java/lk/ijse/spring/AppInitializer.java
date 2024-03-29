package lk.ijse.spring;
import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        boolean javaBean = ctx.containsBeanDefinition("getJavaBean");
        System.out.println(javaBean);
        ctx.close();
    }
}
 