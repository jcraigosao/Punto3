package Punto6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

//Para organizar de forma triangular la cantidad de objetos
//debe ser inferior a 55;
//de lo contrario lo organiza de forma lineal

public class Acciones {
    private Robot Antuan;
    private Thing X1;
    private Thing X2;
    
    public Acciones(City ciudad, int cantidad){
        this.Antuan=new Robot(ciudad, 10,0,Direction.EAST);
        this.X2=new Thing(ciudad, 3,3);
        X2.setColor(Color.black);
    }
       
    public void mover(City ciudad){
        this.crearcosas(ciudad);
        for(int z=0; z<10; z++){
            for(int w=0; w<11; w++){
            if(Antuan.canPickThing()==true){
                Antuan.pickThing();
                Antuan.move();
            }else{
                Antuan.move();
            }      }
        if(z%2==0){
        Antuan.turnLeft();
        Antuan.move();
        Antuan.turnLeft();
        } else {
        this.turnRight();
        Antuan.move();
        this.turnRight();
        }   }
        
        this.returninicio();
        
        if(Antuan.countThingsInBackpack()<=55){
        for(int h=0, n=10; h<10 && n>0; h++, n--){
            for(int t=n; t>0; t--){
            if(Antuan.countThingsInBackpack()>0){
                Antuan.putThing();
                Antuan.move();
            }    }
            if(h%2==0){
            Antuan.turnLeft();
            Antuan.move();
            Antuan.turnLeft();
            Antuan.move();
            } else {
            this.turnRight();
            Antuan.move();
            this.turnRight();
            Antuan.move();
            Antuan.move();
            }        }
        }else{
        for(int h=0; h<10; h++){
            for(int t=0; t<10; t++){
            if(Antuan.countThingsInBackpack()>0){
            Antuan.putThing();
            Antuan.move();
            }   }
            if(h%2==0){
            Antuan.turnLeft();
            Antuan.move();
            Antuan.turnLeft();
            Antuan.move();

            } else {
            this.turnRight();
            Antuan.move();
            this.turnRight();
            Antuan.move();
            }
        }}
    }
    
    public void crearcosas(City ciudad){
        //el valor hasta donde va a es la cantidad de espacios vacios en Y
        //para cumplir la condicion este valor debe variar entre 0 y 9
        for(int a=10; a>4 ; a--){
            //el valor hasta donde va b es la cantidad-1 de espacios llenos en x
            //para cumplir la condicion este valor debe ser 11
            for(int b=1; b<10; b++){
            this.X1= new Thing(ciudad,a,b);
            X1.setColor(Color.black);
        }
        }
    }
   
    public void turnRight(){
        for(int x=0; x<3; x++){
            Antuan.turnLeft();
        }
    }
    public void salirdeescena(){
        for(int v=0; v<1; v++){
            Antuan.move();
        }
    }
    public void returninicio(){
        this.turnRight();
        for(int k=0; k<10; k++){
        Antuan.move();
        }
        Antuan.turnLeft();
        Antuan.move();
    }
}