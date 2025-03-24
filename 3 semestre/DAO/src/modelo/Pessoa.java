/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP Victus
 */
public class Pessoa {
    private String id ;
    private String nome;
    private String id_endereco;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String id_endereco) {
        this.id = id;
        this.nome = nome;
        this.id_endereco = id_endereco;
    }

    public Pessoa(String nome, String id_endereco) {
        this.nome = nome;
        this.id_endereco = id_endereco;
    }
    
    

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(String id_endereco) {
        this.id_endereco = id_endereco;
    }

    
    
    
    
}


