/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispositivos;

/**
 *
 * @author armando
 */
public class Laptop extends DIspositivo implements ObtenerInfo{
    
    private float almacenamiento;
    private String OS;

    public Laptop(int almacenamiento, String OS) {
        this.almacenamiento = almacenamiento;
        this.OS = OS;
    }
    public Laptop() {
        
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Nombre de la laptop: " + getNombre());
        System.out.println("Modelo de la laptop: " + getModelo());
        System.out.println("Descriocion de la laptop: " + getDescripcion());
        System.out.println("Almacenamiento de la laptop: " + getAlmacenamiento());
        System.out.println("Sistema operativo: " + getOS());
        System.out.println("Precio de la laptop: " + getPrecio());    
    }
}
