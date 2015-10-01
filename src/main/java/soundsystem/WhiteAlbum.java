/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundsystem;
import org.springframework.stereotype.Component;

/**
 *
 * @author pabernathy
 */
@Component
public class WhiteAlbum implements CompactDisc {
    
    private String title = "White Album";
    
    public void play() {
    
    }
    
    public String getTitle() {
        return this.title;
    }
}
