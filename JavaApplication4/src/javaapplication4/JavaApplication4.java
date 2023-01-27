/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author drake
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car("Buggati", 100);
      car1.test();
      
      System.out.println(" ");
       
      Car[] CarList = new Car[5];
      CarList[0] = new Car("Audi", 15);
      CarList[1] = new Car("BMW", 4);
      CarList[2] = new Car("Jeep", 22);
      CarList[3] = new Car("Tesla", 0);
      CarList[4] = new Car("Range Rover", 30);
      
        for (Car CarList1 : CarList) {
            CarList1.test();
        }
    }
    
}
