package br.com.bruno_dezorzi.estruturais.composite;

public class Principal {
    public static void main(String[] args) {
        // Criando arquivos
        Arquivo file1 = new Arquivo_Definitivo("arquivo1.txt", 2.5);
        Arquivo file2 = new Arquivo_Definitivo("arquivo2.pdf", 3.0);
        Arquivo file3 = new Arquivo_Definitivo("arquivo3.docx", 1.2);

        // Criando diretórios
        Diretorio pasta1 = new Diretorio("Pasta1");
        Diretorio pasta2 = new Diretorio("Pasta2");
        Diretorio raiz = new Diretorio("Raiz");

        // Adicionando arquivos às pastas
        pasta1.adicionarItem(file1);
        pasta1.adicionarItem(file2);

        pasta2.adicionarItem(file3);

        // Adicionando pastas dentro da raiz
        raiz.adicionarItem(pasta1);
        raiz.adicionarItem(pasta2);

        // Testando a listagem e o tamanho total
        raiz.listarArquivos();
        System.out.println("Tamanho total da raiz: " + raiz.getTamanho() + " MB");
    }
}
