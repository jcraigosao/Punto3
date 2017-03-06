/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import becker.robots.City;
import becker.robots.Thing;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.red;

/**
 *
 * @author i7hpinñi
 */
public class Main {
    public static void main(String[] args) {
        City NY= new City();
        H robot1= new H(NY);
        E robot2= new E(NY);
        L robot3= new L(NY, 1, 9);
        L robot4= new L(NY, 1, 13);
        O robot5= new O(NY);
        robot1.DibujarH();
        robot2.DibujarE();
        robot3.DibujarL(black);
        robot4.DibujarL(red);
        robot5.DibujarO();
    }
}
