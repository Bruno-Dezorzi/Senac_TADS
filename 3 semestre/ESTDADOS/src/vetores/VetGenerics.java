package vetores;

public class VetGenerics<T> {
    private T[] elementos;

    public VetGenerics(){

    }

    public VetGenerics(int quantidade, Class<T> tipoClasse){
        elementos = (T[])new Object[quantidade];

    }

    public void adicionar(T elemento){
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionar(T elemento, int posicao){
            if (posicao >= 0 && posicao <= (elementos.length - 1)) {
           if(elementos[posicao] != null) {
               for (int i = contElementos() + 1; i >= posicao; i--) {
                   elementos[i + 1] = elementos[i];
               }
               elementos[posicao] = elemento;
           } else{
               elementos[posicao] = elemento;
           }
       }
    }

    public int contElementos(){
        int contador = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] != null){
                contador++;
            }
        }
        return contador;
    }

    public void mostrarQuantidade() {
        System.out.println(contElementos());
        ;
    }

    public void mostrarVetor() {
        if (contElementos() > 0) {
            System.out.print("[" + elementos[0]);
            for (int i = 1; i < contElementos(); i++) {
                System.out.print("," + elementos[i]);
            }
            System.out.print("]");
        } else {
            System.out.print("[]");
        }
    }


    public void removerValor(int posicao) {
       for(int i = posicao;  i < contElementos(); i++ ){
           elementos[i] = elementos[i + 1];
       }

    }

    public void aumentarCapacidade(int novaCapacidade){
        if (novaCapacidade > elementos.length){

            T[] valoresMaior = (T[])new Object[novaCapacidade];

            for(int i = 0; i < elementos.length; i++){
                valoresMaior[i] = elementos[i];
            }
            this.elementos = valoresMaior;
           // this.quantidade = valoresMaior.length;
        }


    }

    public int getCapacidade(){

        return elementos.length;
    }

    public int buscaValor(T elemento){
        int resultado = 0;
        for(int i = 0; i < elementos.length; i++){
            if (elementos[i] == elemento){
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public T busca(int posicao){

        return elementos[posicao];
    }



}
