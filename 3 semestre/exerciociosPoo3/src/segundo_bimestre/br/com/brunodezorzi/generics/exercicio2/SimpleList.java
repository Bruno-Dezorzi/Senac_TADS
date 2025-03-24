/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.generics.exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP Victus
 */
public class SimpleList<T> {
    private List<T> lista;

    
    public SimpleList() {
        lista = new ArrayList<>(); // Inicializa a lista
    }
    
    public void add(T item){
        lista.add(item);
    }
    
    public T get(int index){
        return lista.get(index);
    }
    
    public int size(){
        return lista.size();
    }
}
