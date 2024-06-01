package config.xml.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext context= new ClassPathXmlApplicationContext("config/config.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.syaHello();
    }
}
