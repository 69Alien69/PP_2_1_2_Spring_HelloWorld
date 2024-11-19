import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld pea =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(pea.getMessage());

        Cat siberian = (Cat) applicationContext.getBean("cat");
        System.out.println(siberian.getName());
        Cat sphinx = (Cat) applicationContext.getBean("cat");
        System.out.println(sphinx.getName());

        System.out.println(bean == pea);
        System.out.println(siberian == sphinx);
    }
}