/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slick; //<-

//mport java.util.logging.Logger;
//import java.util.logging.Level;
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;



/**
 *
 * @author eyerash-zen
 */
public class SetupClass extends StateBasedGame{

    /**
     * @param args the command line argume++nts
     */
     public SetupClass(String name) {
        super(name);
    }
 
    @Override
    public void initStatesList(GameContainer gc) throws SlickException { //U need to add
        //All the states u wish to use. Or else you won't find your indexes.
       // this.addState(new GameState());
        //this.addState(new GameOverState());
    }
    
}
