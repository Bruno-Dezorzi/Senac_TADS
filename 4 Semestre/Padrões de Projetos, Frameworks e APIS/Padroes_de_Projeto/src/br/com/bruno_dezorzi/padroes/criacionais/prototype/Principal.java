package br.com.bruno_dezorzi.padroes.criacionais.prototype;

public class Principal {
    public static void main(String[] args) {
        Documento documentoOriginal = new Documento("Relatório", "Relatório de TI 1");
        System.out.println("Documento Original" + documentoOriginal);

        Documento documentoClone = documentoOriginal.clone();
        documentoClone.setTitulo("Clone");
        documentoClone.setConteudo("Relatório Clones");

        System.out.println("Documento Clone" + documentoClone);
        System.out.println("Documento Original" + documentoOriginal);
    }
}
