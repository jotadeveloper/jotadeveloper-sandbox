package org.jotadeveloper.spring;

import junit.framework.Assert;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base {


    /**
     * @return the suite of tests being tested
     */
    @org.junit.Test
    public void testApp() {
        Assert.assertTrue(true);
        //Assert.assertNotNull(getJuanSpring());
        Assert.assertNotNull(FactoryJuan.myStaticMethod("hello"));
        Assert.assertNotNull(FactoryJuan.myStaticMethod("hello"));
        final AbstractJota d = FactoryJuan.myStaticMethod("hello");
        System.out.println(d.getName());
        final AbstractJota d2 = FactoryJuan.myStaticMethod("hello2");
        System.out.println(d.getName());
    }


}
