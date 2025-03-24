package vetores;

public class VetorObject {
    private Object[] elementos;

    public VetorObject(int quantidade) {

        elementos = new Object[quantidade];
    }


    // métodos

    public void adiciona(Object elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }


        }


    }

    public void addPosicao(Object elemento, int posicao) {
        elementos[posicao] = elemento;
    }

    public int contElementos() {
        int quantidadeElementos = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                quantidadeElementos += 0;
            } else {
                quantidadeElementos += 1;
            }
        }
        return quantidadeElementos;
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

            Object[] valoresMaior = new Object[novaCapacidade];

            for(int i = 0; i < elementos.length; i++){
                valoresMaior[i] = elementos[i];
            }
            this.elementos = valoresMaior;
        }


    }

    public int getCapacidade(){

        return elementos.length;
    }

    public int buscaValor(Object elemento){
        int resultado = 0;
        for(int i = 0; i < elementos.length; i++){
            if (elementos[i] == elemento){
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public Object busca(int posicao){

        return elementos[posicao];
    }

    public void adicionarPosicao(int posicao, Object elemento){
       if (posicao >= 0 || posicao <= elementos.length) {
           if(elementos[posicao] != null) {
               for (int i = contElementos(); i > posicao; i--) {
                   elementos[i + 1] = elementos[i];
               }
               elementos[posicao] = elemento;
           }
       }


    }



}



