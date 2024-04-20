/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialpoo_aguilarrosales_00174323;

/**
 *
 * @author armando
 */
import Dispositivos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimerParcialPOO_AguilarRosales_00174323 {
    
    private static List<DIspositivo> dispositivos;
    
    public static void main(String[] args) {
        dispositivos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Bienvenido al sistema de inventariado ElectroMart, elije una de estas opciones: \n"
                    + "1. Agregar un dispositivo. \n"
                    + "2. Modificar un dispositivo. \n"
                    + "3. Eliminar un dispositivo. \n"
                    + "4. Buscar un dispositivo. \n"
                    + "5. Mostrar todo el inventario \n"
                    + "6. Salir del sistema");
            opc = sc.nextInt();
            switch(opc){
                case 1: {
                    System.out.println("Tipo de dispositivo: \n"
                            + "1. Movil\n"
                            + "2. Laptop\n"
                            + "3. Volver al menu");
                    opc = sc.nextInt();
                    if (opc == 1) {
                        sc.nextLine();
                        Movil cel = new Movil();
                        System.out.println("Ingrese el nombre:");
                        cel.setNombre(sc.nextLine());
                        System.out.println("Ingrese el modelo:");
                        cel.setModelo(sc.nextLine());
                        System.out.println("Ingrese el precio:");
                        cel.setPrecio(sc.nextFloat());
                        sc.nextLine();
                        System.out.println("Ingrese la descripcion:");
                        cel.setDescripcion(sc.nextLine());
                        System.out.println("Ingrese la conectividad en G: ");
                        cel.setConectividadG(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Ingrese la telefonia: ");
                        cel.setTelefonia(sc.nextLine());
                        dispositivos.add(cel);
                        System.out.println("Dispositivo agregado exitosamente!!!");
                    }else if(opc == 2){
                        sc.nextLine();
                        Laptop laptop = new Laptop();
                        System.out.println("Ingrese el nombre:");
                        laptop.setNombre(sc.nextLine());
                        System.out.println("Ingrese el modelo:");
                        laptop.setModelo(sc.nextLine());
                        System.out.println("Ingrese el precio:");
                        laptop.setPrecio(sc.nextFloat());
                        sc.nextLine();
                        System.out.println("Ingrese la descripcion:");
                        laptop.setDescripcion(sc.nextLine());
                        System.out.println("Ingrese el almacenamiento: ");
                        laptop.setAlmacenamiento(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Ingrese la telefonia: ");
                        laptop.setOS(sc.nextLine());
                        dispositivos.add(laptop);
                        System.out.println("Dispositivo agregado exitosamente!!!");
                    }
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.println("Ingresa el modelo del dispositivo a buscar");
                    String modelo = sc.nextLine();
                    DIspositivo dispo = buscardispo(modelo);
                    if (dispo != null) {
                        System.out.println("Ingrese el nuevo precio");
                        dispo.setPrecio(sc.nextFloat());
                    }
                    break;
                }
                case 3: {
                    sc.nextLine();
                    System.out.println("Ingresa el modelo del dispositivo a eliminar");
                    String modelo = sc.nextLine();
                    for (DIspositivo dispositivo : dispositivos) {
                        if (dispositivo.getModelo().equals(modelo)) {
                            dispositivos.remove(dispositivo);
                        }
                    }
                    break;
                    
                }
                case 4: {
                    sc.nextLine();
                    int contador = 0;
                    System.out.println("Ingresa el modelo del dispositivo a buscar");
                    String modelo = sc.nextLine();
                    for (DIspositivo dispositivo : dispositivos ) {
                        if (dispositivo.getModelo().equals(modelo)) {
                            System.out.println("P1");
                        dispositivos.remove(contador);
                        System.out.println("\nEmpleado eliminado exitosamente...\n");
                        break;
                        }
                        contador++;
                    }
                    break;
                }                                      
                case 5: {
                    mostrar();
                    break;
                }
                case 6:{
                    break;
                }
                        
            }
        } while (opc != 6);
        
    }
    
    public static DIspositivo buscardispo(String modelo) {
        for (DIspositivo dispositivo : dispositivos) {
            if (dispositivo.getModelo().equals(modelo)) {
                return dispositivo;
                }  
            }
            return null;
        }


    public static void mostrar(){
        System.out.println("-----------Dispositivos-----------");
        for (DIspositivo dispositivo : dispositivos) {
            System.out.println("Nombre: " + dispositivo.getNombre());
            System.out.println("Modelo " + dispositivo.getModelo());
            System.out.println("Descriocion " + dispositivo.getDescripcion());
            System.out.println("Precio: $" + dispositivo.getPrecio());
        }
    }
}

    

