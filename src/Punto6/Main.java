
package Punto6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.*;



public class Main {
    public static void main(String[] args) {
    City NY= new City();
    Acciones robot1= new Acciones(NY, 5);
    robot1.mover(NY);
    }
}
