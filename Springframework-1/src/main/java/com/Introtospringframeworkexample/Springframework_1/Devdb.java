package com.Introtospringframeworkexample.Springframework_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue = "development")
public class Devdb implements DB{

    public String getdata(){
        return " Devdb Data";
    }
}
