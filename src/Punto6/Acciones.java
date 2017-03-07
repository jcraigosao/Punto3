package Punto6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


public class Acciones {
    private Robot Antuan;
    private Thing []obj;
    private Thing a;
    private Thing e;
    private Thing i;
    private Thing o;
    private Thing u;
    
    
    public Acciones(City ciudad, int cantidad){
        
        this.Antuan=new Robot(ciudad, 10,0,Direction.EAST);
        this.obj=new Thing[cantidad];
        
    
     /* public void mover(City ciudad){
        for(int i=0; i<10; i++){
            int h=0;
            obj[i]= new Thing(ciudad, i, 1);
    
        }        */
        this.crearcosas(ciudad, 10, 0);
        for(int z=0; z<10; z++){
        for(int a=0; a<10; a++){
        if(Antuan.canPickThing()){
            Antuan.pickThing();
            Antuan.move();
        }else{
            Antuan.move();
        }
            
        }
        if(z%2==0){
            Antuan.turnLeft();
            Antuan.move();
            Antuan.turnLeft();
        } else {
            this.turnRight();
            Antuan.move();
            this.turnRight();
            }
    }
    }
    public void crearcosas(City ciudad, int a, int b){
        this.a= new Thing(ciudad,a,b);
        this.e= new Thing(ciudad,a, b+1);
        this.i= new Thing(ciudad,a, b+2);
        this.o= new Thing(ciudad,a, b+3);
        this.u= new Thing(ciudad,a, b+4);
        
    }
    public void turnRight(){
        for(int i=0; i<3; i++){
            Antuan.turnLeft();
        }
    }
}
