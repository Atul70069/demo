package com.lcwd.withoutboot.Config;

import com.lcwd.withoutboot.web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {


    @Bean
    public HomeController homeController()
    {
        return new HomeController();
    }

}
