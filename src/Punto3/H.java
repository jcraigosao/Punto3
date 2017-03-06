
package Punto3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;


public class H {
    
    private Robot R2D2;
    
public H(City ciudad){
   
    this.R2D2 = new Robot(ciudad, 1, 1, Direction.SOUTH, 11);
}
public void DibujarH(){
    R2D2.setColor(Color.black);
    this.R2D2.putThing();
    this.avanzar5(R2D2);
    this.R2D2.turnLeft();
    this.avanza2(R2D2);
    this.R2D2.turnLeft();
    this.R2D2.putThing();
    this.avanzaryp2(R2D2);
    this.R2D2.turnLeft();
    this.R2D2.move();
    this.R2D2.putThing();
    this.retroceder(R2D2);
    this.avanzaryp2(R2D2);
    this.soloretro();
}

private void avanzar5(Robot robot){
    for(int i=0; i<4; i++){
        robot.move();
        robot.putThing();
    }
}

private void avanza2(Robot robot){
        robot.move();
        robot.move();
}

private void avanzaryp2(Robot robot){
    for(int i=0; i<2; i++ ) {   
        robot.move();
        robot.putThing();
    }}
private void retroceder(Robot robot){
    for (int i = 0; i < 2; i++) {
        robot.turnLeft(); 
    }
    robot.move();
    robot.turnLeft();

}
private void soloretro(){
    for (int i = 0; i < 2; i++) {
        R2D2.turnLeft(); 
    }
    R2D2.move();
    R2D2.move();
    R2D2.move();
    R2D2.move();
    R2D2.move();
}

}
