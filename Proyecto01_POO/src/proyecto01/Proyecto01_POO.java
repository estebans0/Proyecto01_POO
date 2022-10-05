/*
 * Programación Oreintada a Objectos, Grupo 40
 * Actividad 04 - Ejercicio práctico sobre el caso de la Lista de Estudiantes -Programación en Java
 * Esteban Josué Solano Araya - Carné 2021579468
 */
package proyecto01;

import proyecto01.modelo.Usuarios.Usuario;
import proyecto01.control.ListaUsuarios;
import proyecto01.modelo.Areas.NivelPiso;
import proyecto01.modelo.Elementos.ComponenteElemento;
import proyecto01.modelo.Elementos.Elemento;
import proyecto01.modelo.Elementos.EstadoElemento;
import proyecto01.modelo.Elementos.ListaComponentes;
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
        
/*         //Creando y poblando una lista de usuarios
        for (int i = 1; i <= 10; i++) {
            String nombre = generarNombres();
            control.agregarUsuario(i*10, nombre, nombre+"@gmail.com", "CONTRASEÑA"); //Estaba en rojo y ya vi cual era el erro
        }
        ListaUsuarios listaUsuarios = control.getUsuarios(); // Creando la lista de usuarios
        System.out.println("Lista de usuarios generada: \n"+listaUsuarios.mostrarUsuarios()); // Mostrando el contenido de la lista */
        


        control.agregarArea("AP", "AreaPruba", "Esta es una area de prueba", NivelPiso.Primer);
        ComponenteElemento c = new ComponenteElemento("Componente Elemento prueba", "CEA", "ubicado en areaPrueba");
        ListaComponentes lc = new ListaComponentes();
        lc.agregarComponente(c);
        control.agregarElementoArea("AP",new Elemento("ApE", "ElementPrueba", "Elemento de prueba",EstadoElemento.Aceptable,lc, "Ubicado en AreaPrueba") );
        
         //System.out.println(control.mostrarAreas());
         System.out.println(control.mostrarElementos());

        // Prueba de usuarios
        control.agregarSU();
        control.agregarUsuario("AD0", "Melissa", "meli@gmail.com", "123456", "La admin");
        control.agregarUsuario("EI0", "Esteban", "esteban@gmail.com", "2345", "El interno");
        control.agregarUsuario("EE0", "Jocelyn", "joss@gmail.com", "6789", "La externa");
        
        ListaUsuarios listaUsuarios = control.getUsuarios(); // Creando la lista de usuarios
        
        System.out.println("Lista de usuarios generada: \n"+listaUsuarios.mostrarUsuarios()); // Mostrando el contenido de la lista
                
        System.out.println("Voy a consultar a los usuarios de tipo empleados internos: ");
        System.out.println(control.mostrarEmpleadosTipo(0)); // 0=EI, 1=EE, 2=Todos los empleados
        
        Usuario EI = control.consultarUsuario("EI0");
        System.out.println("Este es mi empleado antes de modificarlo: ");
        System.out.println(EI);
        
        System.out.println("Voy a modificar a mi empleado EI0: ");
        control.modificarUsuario(EI.getId(), "12345678"); // Modifico a mi empleado
        System.out.println(EI);
        
        System.out.println("\nVoy a ingresar con mi SuperUsuario:");
        System.out.println("Resultado de mi logIn: " + control.logInAdministracion("SU0", "1234"));
    }
}
