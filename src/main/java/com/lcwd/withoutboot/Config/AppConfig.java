package com.lcwd.withoutboot.Config;


import com.lcwd.withoutboot.beans.CartService;
import com.lcwd.withoutboot.beans.OrderServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.lcwd.withoutboot"})
public class AppConfig {
    //Bean for cart services..............

    @Bean("cartService1")
    public CartService cartService()
    {
        return  new CartService();
    }

    @Bean("OrderServices1")
    public OrderServices orderServices()
    {
        return new OrderServices();
    }

}
