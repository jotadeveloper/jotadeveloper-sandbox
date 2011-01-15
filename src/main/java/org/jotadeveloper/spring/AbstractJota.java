package org.jotadeveloper.spring;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractJota {

     private String name = "YOOOOOOOOO";

     @Autowired
     private JuanSpring juanSpring;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
