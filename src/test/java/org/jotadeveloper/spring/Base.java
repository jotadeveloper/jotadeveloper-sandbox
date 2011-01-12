package org.jotadeveloper.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Scope;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Abstract Junit Configuration File.
 * @author Picado, Juan juanATencuestame.org
 * @since Oct 1, 2010 11:28:12 AM
 * @version $Id:$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Scope("singleton")
@ContextConfiguration(locations = {
        "classpath:application-context.xml"
         })
public class Base extends AbstractDependencyInjectionSpringContextTests{

    public Log log = LogFactory.getLog(this.getClass());

}
