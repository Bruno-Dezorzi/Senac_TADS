/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP Victus
 */
public class Pessoa_Fisica {
    private String id;
    private String id_pessoa;
    private String cpf;

    public Pessoa_Fisica() {
    }

    public Pessoa_Fisica(String id, String id_pessoa, String cpf) {
        this.id = id;
        this.id_pessoa = id_pessoa;
        this.cpf = cpf;
    }

    public Pessoa_Fisica(String id_pessoa, String cpf) {
        this.id_pessoa = id_pessoa;
        this.cpf = cpf;
    }

    public Pessoa_Fisica(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(String id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
