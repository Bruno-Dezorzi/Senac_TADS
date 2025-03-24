package vetores;

public class Vetor {
    private int[] valores;
    private int quantidade = 0;

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Vetor(int quantidade) {

        valores = new int[quantidade];
    }


    // métodos

    public void adiciona(int valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
                valores[i] = valor;
                break;
            }


        }
        this.quantidade = quantidade++;

    }

    public void addPosicao(int valor, int posicao) {
        valores[posicao] = valor;
    }

    public int contElementos() {
        int quantidadeElementos = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
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
            System.out.print("[" + valores[0]);
            for (int i = 1; i < contElementos(); i++) {
                System.out.print("," + valores[i]);
            }
            System.out.print("]");
        } else {
            System.out.print("[]");
        }
    }


    public void removerValor(int posicao) {
       for(int i = posicao;  i < contElementos(); i++ ){
           valores[i] = valores[i + 1];
       }

    }

    public void aumentarCapacidade(int novaCapacidade){
        if (novaCapacidade > valores.length){

            int[] valoresMaior = new int[novaCapacidade];

            for(int i = 0; i < valores.length; i++){
                valoresMaior[i] = valores[i];
            }
            this.valores = valoresMaior;
            this.quantidade = valoresMaior.length;
        }


    }

    public int getCapacidade(){

        return valores.length;
    }

    public int buscaValor(int valor){
        int resultado = 0;
        for(int i = 0; i < valores.length; i++){
            if (valores[i] == valor){
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public int busca(int posicao){

        return valores[posicao];
    }

    public void adicionarPosicao(int posicao, int valor){
       if (posicao >= 0 && posicao <= (valores.length - 1) && (contElementos() + 1 <= valores.length)) {
           if(valores[posicao] != 0) {
               for (int i = contElementos() + 1; i >= posicao; i--) {
                   valores[i + 1] = valores[i];
               }
               valores[posicao] = valor;
           } else{
               valores[posicao] = valor;
           }
       }
    }

    public void ordernarbOlha(){
        int aux;
        int qtd = contElementos();
        for(int i = 0; i < qtd; i++){
            qtd--;
            for (int j = 0; j < qtd-1; j++){
                if (valores[j] > valores[j + 1]){
                    aux = valores[j + 1];
                    valores[j + 1] = valores[j];
                    valores[j] = aux;
                }

            }
        }
    }






}



