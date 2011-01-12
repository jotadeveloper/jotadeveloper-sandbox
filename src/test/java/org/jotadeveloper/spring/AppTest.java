package org.jotadeveloper.spring;

import junit.framework.Assert;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base {

    @Autowired
    private JuanSpring juanSpring;

    /**
     * @return the suite of tests being tested
     */
    @org.junit.Test
    public void testApp() {
        Assert.assertTrue(true);
        Assert.assertNotNull(getJuanSpring());
    }

    /**
     * @return the juanSpring
     */
    public JuanSpring getJuanSpring() {
        return juanSpring;
    }

    /**
     * @param juanSpring the juanSpring to set
     */
    public void setJuanSpring(JuanSpring juanSpring) {
        this.juanSpring = juanSpring;
    }


}
