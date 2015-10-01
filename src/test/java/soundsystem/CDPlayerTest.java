package soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
//@ContextConfiguration("beans.xml")
//@ContextConfiguration("/Users/pabernathy/pworkspace/springtraining/beans.xml")
@ContextConfiguration(locations = {"classpath:soundsystem/beans.xml"})
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;
    //private SgtPeppers cd;
    
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdHereShouldNotBeNull() {
        System.out.println("\ncdShouldNotBeNull()");
        assertNotNull(cd);
    }
    
    @Test
    public void CDPlayerShouldNotBeNull() {
        System.out.println("\ncdPlayerShouldNotBeNull()");
        assertNotNull(cdPlayer);
    }
    
    @Test
    public void CDPlayerHasaCD() {
        System.out.println("\nCDPlayerHasaCD()");
        assertNotNull(cdPlayer.getCD());
        System.out.println(cdPlayer.getCD().getTitle());
        //assertEquals("Sgt. Peppers Lonely Hearts Club Band", cdPlayer.getCD().getTitle());
    }
    
    @Test
    public void testPlay() {
        System.out.println("\ntestPlay()");
        cdPlayer.play();
    }
}
