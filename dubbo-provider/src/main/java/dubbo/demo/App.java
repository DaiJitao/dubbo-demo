package dubbo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main1( String[] args )
    {
        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        System.out.println( "Hello World!" );
        Demo demo = (Demo)ctx.getBean("demo");
        demo.test();
    }
}
