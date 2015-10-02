/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundsystem;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pabernathy
 */
public class CDPlayerMain {

    public static void main(String[] args) {
        AbstractXmlApplicationContext context = null;
        context = new FileSystemXmlApplicationContext("beans.xml");
        //context = new ClassPathXmlApplicationContext("beans.xml");
        
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
