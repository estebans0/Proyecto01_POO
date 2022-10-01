package proyecto01.modelo.Elementos;

import java.util.ArrayList;

public class ListaComponentes {
    private ArrayList<ComponenteElemento> lista;
    
    public ListaComponentes(){
        lista = new ArrayList<ComponenteElemento>();
    }
    
    public boolean consultarComponente(String codigo){
        for (ComponenteElemento componente : lista){
            if (componente.getCodigo().equalsIgnoreCase(codigo)){
                return true;
            }  
        }
        return false;  
    }
    
    public boolean agregarComponente(ComponenteElemento unComponente){
        if (!consultarComponente(unComponente.getCodigo())){
            lista.add(unComponente);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String comps ="";
        for (ComponenteElemento unComponente: lista){
            comps += "  Codigo: "+unComponente.getCodigo()+"\n"
                    + "  Descripcion: "+ unComponente.getDescripcion()+"\n"
                    + "  Ubicacion General: "+ unComponente.getUbicacion()+"\n"
                    +"\n";
        }    
        return comps;
    }
    
}

