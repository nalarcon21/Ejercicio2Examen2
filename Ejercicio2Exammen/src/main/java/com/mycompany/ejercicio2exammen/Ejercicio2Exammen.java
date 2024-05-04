/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2exammen;

/**
 *
 * @author nalar
 */
public class Ejercicio2Exammen {

    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        //mando a instanciar el nuevo vehiculo
        Bus bus = new Bus();

        startAndStopVehicle(car);
        startAndStopVehicle(motorcycle);
        
        //utilizando el metodo para el nueve vehiculo agregado
        startAndStopVehicle(bus);
    }  
    //usamos los metodos compratidos por todos los vehiculos
    private static void startAndStopVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
  
}
