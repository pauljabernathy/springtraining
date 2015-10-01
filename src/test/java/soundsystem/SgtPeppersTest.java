/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author pabernathy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class SgtPeppersTest {
    
    //@Autowired
    //CompactDisc cd;
    
    @Autowired
    SgtPeppers sgtPeppers;
    
    public SgtPeppersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**@Test
    public void cdShouldNotBeNull() {
        System.out.println("\ncdShouldNotBeNull()");
        assertNotNull(cd);
    }/**/
    
    @Test
    public void sgtPeppersShouldNotBeNull() {
        System.out.println("\nsgtPeppersShouldNotBeNull()");
        assertNotNull(sgtPeppers);
    }

    /**
    
    @Test
    public void testCDPlay() {
        System.out.println("\ntestCDPlay()");
        cd.play();
    }/**/

    /**
     * Test of play method, of sgtPeppers.
     */
    @Test
    public void testsgtPeppersPlay() {
        System.out.println("\ntestsgtPeppersPlay()");
        sgtPeppers.play();
    }
    
    /**
    @Test
    public void testCDGetTitle() {
        System.out.println("getTitle");
        String expResult = "Sgt. Peppers Lonely Hearts Club Band";
        String result = cd.getTitle();
        assertEquals(expResult, result);
    }/**/
    
    @Test
    public void testSgtPeppersGetTitle() {
        System.out.println("getTitle");
        SgtPeppers instance = new SgtPeppers();
        String expResult = "Sgt. Peppers Lonely Hearts Club Band";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        assertEquals("Sgt. Peppers Lonely Hearts Club Band", sgtPeppers.getTitle());
    }
    
}
