import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("catWrld");
        Cat beanCat1 = (Cat) applicationContext.getBean("catWrld");
        System.out.println(beanCat.getMessage());
        System.out.println(bean == bean1);
        System.out.println(beanCat == beanCat1);
        System.out.println(beanCat1.getMessage());
    }
}