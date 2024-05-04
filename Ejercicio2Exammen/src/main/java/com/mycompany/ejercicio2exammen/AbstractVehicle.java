/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2exammen;

/**
 *
 * @author nalar
 */
public abstract class AbstractVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the vehicle...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the vehicle...");
    }
}
