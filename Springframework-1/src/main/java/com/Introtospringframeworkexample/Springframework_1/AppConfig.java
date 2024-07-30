
package com.Introtospringframeworkexample.Springframework_1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
//    @Scope("prototype")
    @Scope("singleton")
    Apple getApple(){
        return new Apple();
    }

}
