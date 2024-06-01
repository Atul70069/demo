package com.lcwd.withoutboot;

import com.lcwd.withoutboot.Config.AppConfig;
import com.lcwd.withoutboot.beans.CartService;
import com.lcwd.withoutboot.beans.OrderServices;
import com.lcwd.withoutboot.beans.UserService;
import com.lcwd.withoutboot.web.AuthController;
import com.lcwd.withoutboot.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("************Application  started ........." );


        //We have to create OBJECT of application CONTEXT................

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
       CartService cartService= context.getBean("cartService1", CartService.class);
       cartService.craeteCart();
        OrderServices orderServices=context.getBean("OrderServices1", OrderServices.class);
        orderServices.OrderServices();

        UserService userService = context.getBean(UserService.class);
        userService.saveUsers();

        UserService bean1 = context.getBean(UserService.class);
        bean1.saveUsers();

        HomeController ho = context.getBean(HomeController.class);
        ho.HomePage();
        AuthController Au = context.getBean(AuthController.class);
        Au.login();


    }
}
