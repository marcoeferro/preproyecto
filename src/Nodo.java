import java.util.ArrayList;

public class Nodo {
    
    private String valor;
    private String id;
    private ArrayList<Nodo> hijos;

    public Nodo(String valor){
        this.valor = valor;
        this.hijos = new ArrayList<>();
        this.id = "0";
    }

    //getters

    public String getValor(){
        return valor;
    }

    public String getId(){
        return id;
    }
    public ArrayList<Nodo> getHijos(){
        return hijos;
    }

    //agregar hijos

    public void addHijo(Nodo hijo){
        hijos.add(hijo);
    }


}
