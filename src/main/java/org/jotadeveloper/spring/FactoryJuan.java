package org.jotadeveloper.spring;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class FactoryJuan implements ApplicationContextAware {

    private static ApplicationContext ctx = null;


    public static AbstractJota myStaticMethod(final String bean){
        System.out.println("JUANN");
        System.out.println(ctx);
        System.out.println(ctx.getBean("hello2"));
        return (AbstractJota) ctx.getBean(bean);
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        this.ctx = ctx;
    }


}
