
package Punto3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

public class L {
    private Robot Walle;
    
public L(City ciudad, int a, int b){
  
    this.Walle = new Robot(ciudad, a, b, Direction.SOUTH, 7);
}
public void DibujarL(Color color){
        Walle.setColor(color);
        Walle.putThing();
        this.avanzar5(Walle);
        Walle.turnLeft();
        this.avanzaryp2(Walle);
        this.salirdeescena();
    }
private void avanzar5(Robot robot){
    for(int i=0; i<4; i++){
        robot.move();
        robot.putThing();
    }
}
private void avanzaryp2(Robot robot){
    for(int i=0; i<2; i++ ) {   
        robot.move();
        robot.putThing();
    }}
private void salirdeescena(){
        this.turnRight(Walle);
        Walle.move();
}
private void turnRight(Robot robot){
    for (int i = 0; i < 3; i++) {
        robot.turnLeft();  
    }}
}