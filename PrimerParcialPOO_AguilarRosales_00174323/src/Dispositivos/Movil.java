/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispositivos;

/**
 *
 * @author armando
 */
public class Movil extends DIspositivo implements ObtenerInfo{
    
    private String telefonia;
    private float conectividadG;

    public Movil(String telefonia, float conectividadG) {
        this.telefonia = telefonia;
        this.conectividadG = conectividadG;
    }
    
     public Movil() {
        
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public float getConectividadG() {
        return conectividadG;
    }

    public void setConectividadG(float conectividadG) {
        this.conectividadG = conectividadG;
    }
    

    @Override
    public void obtenerInfo() {
        System.out.println("Nombre del movil: " + getNombre());
        System.out.println("Modelo del movil " + getModelo());
        System.out.println("Descriocion del movil " + getDescripcion());
        System.out.println("Conectividad: " + getConectividadG() + "G");
        System.out.println("Telefonia: " + getTelefonia());
        System.out.println("Precio del  :" + getPrecio());
    }

    
    
}
