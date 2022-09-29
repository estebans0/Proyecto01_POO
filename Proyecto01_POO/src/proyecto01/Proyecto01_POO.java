/*
 * Programación Oreintada a Objectos, Grupo 40
 * Actividad 04 - Ejercicio práctico sobre el caso de la Lista de Estudiantes -Programación en Java
 * Esteban Josué Solano Araya - Carné 2021579468
 */
package proyecto01;

import proyecto01.control.ListaUsuarios;
import proyecto01.modelo.Usuario;
import proyecto01.control.Controlador;
import java.util.Random;

public class Proyecto01_POO {
    private static Controlador control;
    
    private static String generarNombres(){
        Random rand = new Random();
        String libreriaNombres[] = {"Sophia", "Angie", "Lara", "Ariana", "Melissa", 
            "Jocelyn", "Mariana", "Merilyn", "Josue", "Deikel", "Daniel", "Tabata", 
            "Lisa", "Camila", "Raquel", "Yazmin", "Shania", "Esteban", "Danny", "Ezekiel"};
        int numRand = rand.nextInt(libreriaNombres.length);
        return libreriaNombres[numRand];
    }
    
    public static void main(String[] args) {
        System.out.println("*****************************************************************************************\n"
                + "Programación Orientada a Objetos - Proyecto 01\n"
                + "*****************************************************************************************\n");
        
        // Definiendo el controlador
        control = new Controlador();
        
        //Creando y poblando una lista de usuarios
        for (int i = 1; i <= 10; i++) {
            String nombre = generarNombres();
            control.agregarUsuario(i*10, nombre, nombre+"@gmail.com");
        }
        ListaUsuarios listaUsuarios = control.getUsuarios(); // Creando la lista de usuarios
        System.out.println("Lista de usuarios generada: \n"+listaUsuarios.mostrarUsuarios()); // Mostrando el contenido de la lista
        
    }
}
