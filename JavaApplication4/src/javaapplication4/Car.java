/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author drake
 */
public class Car {
    private final int fuel;
    private final String type;
    
    public Car(String type, int fuel){
    this.fuel = fuel;
    this.type = type;
}
    
    public void test(){
        System.out.println("Car is a " + type + " with " + fuel + " fuel.");
    }
}
