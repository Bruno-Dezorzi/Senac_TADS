package vetores;

public class VetString {
    private String[] valores;
    private int quantidade = 0;

    public String[] getVetString() {
        return valores;
    }

    public void setVetString(String[] valores) {
        this.valores = valores;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public VetString(int quantidade) {

        valores = new String[quantidade];
    }


    // métodos

    public void adiciona(String valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == null) {
                valores[i] = valor;
                break;
            }


        }
        this.quantidade = quantidade++;

    }

    public void addPosicao(String valor, int posicao) {
        valores[posicao] = valor;
    }

    public int contElementos() {
        int quantidadeElementos = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == null) {
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

            String[] valoresMaior = new String[novaCapacidade];

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

    public int buscaValor(String valor){
        int resultado = 0;
        for(int i = 0; i < valores.length; i++){
            if (valores[i] == valor){
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public String busca(int posicao){

        return valores[posicao];
    }

    public void adicionarPosicao(int posicao, String valor){
       if (posicao >= 0 || posicao <= valores.length) {
           if(valores[posicao] != null) {
               for (int i = contElementos(); i > posicao; i--) {
                   valores[i + 1] = valores[i];
               }
               valores[posicao] = valor;
           }
       }


    }
}
