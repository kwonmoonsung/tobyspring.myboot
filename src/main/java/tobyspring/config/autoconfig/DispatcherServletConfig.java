package tobyspring.config.autoconfig;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
public class DispatcherServletConfig {



    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

}
