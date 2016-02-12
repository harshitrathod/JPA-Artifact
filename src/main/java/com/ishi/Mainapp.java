package com.ishi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by harshit.rathod on 12/2/16.
 */
public class Mainapp {

    public static void main(String[] asd) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        BlogRepository repository = context.getBean(BlogRepository.class);
        repository.save(new Blog("121sasasas","212","1212"));
        System.out.print(repository.findOne(6).getUsername());
    }
}
