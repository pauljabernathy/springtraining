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
//Can't use @Component on more than one CD with autodetect?
@Component
public class Revolver implements CompactDisc {
    
    private String title = "Revolver";
    
    public void play() {
        System.out.println("playing " + this.title);
    }
    
    public String getTitle() {
        return this.title;
    }
}
