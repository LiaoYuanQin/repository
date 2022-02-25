

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simple.springboot.config.DiConfig;
import com.simple.springboot.service.UseFunctionService;

public class MainTest {

    public static void main(String[] args) {
        //1.使用AnnotationConfigApplicationContext最为spring容器，接受一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //2.获得声明配置的UseFunctionService 的bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        //3.调用bean的方法
        System.out.println(useFunctionService.sayHello("world"));
        context.close();
    }

}