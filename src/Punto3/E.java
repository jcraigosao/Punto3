
package Punto3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import javafx.scene.paint.Color;


public class E {
    private Robot Karl;
    
public E(City ciudad){
    this.Karl = new Robot(ciudad, 1, 5, Direction.EAST, 11);
}
public void DibujarE(){
    Karl.setColor(java.awt.Color.red);
    Karl.putThing();
    this.avanzaryp2();
    this.retroceder();
    this.avanzar5();
    Karl.turnLeft();
    this.avanzaryp2();
    Karl.turnLeft();
    this.avanza2();
    Karl.turnLeft();
    Karl.putThing();
    Karl.move();
    Karl.putThing();
    this.salirdeescena();
}

private void avanzaryp2(){
    for(int i=0; i<2; i++ ) {   
        Karl.move();
        Karl.putThing();
    }}
private void retroceder(){
    for (int i = 0; i < 2; i++) {
        Karl.turnLeft(); 
    }
    this.avanza2();
    Karl.turnLeft();
}
private void avanzar5(){
    for(int i=0; i<4; i++){
        Karl.move();
        Karl.putThing();
    }
}
private void avanza2(){
        Karl.move();
        Karl.move();
}
private void salirdeescena(){
    Karl.turnLeft();
    this.avanza2();
    Karl.move();
}
}
    
