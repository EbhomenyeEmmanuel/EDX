/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edxProjects;

/**
 *
 * @author DELL INSPIRON
 */
public class Truck extends Car {
     public void m1(){
        System.out.println("Truck 1");
    }
     public void m2(){
        super.m1();
    }
     public String toString(){
      return super.toString() + super.toString();
    }


}
