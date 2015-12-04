/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slick;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author mattische
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AppGameContainer appgc;
         
        try {
             appgc = new AppGameContainer(new slick.SetupClass("Splattersnake 1!"));
             appgc.setDisplayMode(1800, 900, false);
             appgc.setAlwaysRender(true);
             appgc.setVSync(true);
             appgc.setShowFPS(true);
             appgc.setTargetFrameRate(60);
             appgc.start();
        
         } catch (SlickException ex) {
             Logger.getLogger(slick.SetupClass.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
