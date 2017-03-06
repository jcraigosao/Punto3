
package Punto3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;


public class O {
    private Robot Eva;
    
public O(City ciudad){
    this.Eva = new Robot(ciudad, 1, 17, Direction.SOUTH, 12);
}
public void DibujarO(){
    Eva.setColor(Color.black);
    Eva.putThing();
    this.avanzar5(Eva);
    Eva.turnLeft();
    this.avanzaryp2(Eva);
    Eva.turnLeft();
    this.avanzar5(Eva);
    Eva.turnLeft();
    Eva.move();
    Eva.putThing();
    this.salirdeescena(Eva);
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
private void salirdeescena(Robot robot){
    robot.turnLeft();
    this.avanzar5v();
}

private void avanzar5v(){
    Eva.move();
    Eva.move();
    Eva.move();
    Eva.move();
    Eva.move();
}
}
