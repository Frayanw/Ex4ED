
package entidades;

public class Pessoa {
            /*Fa�a um programa de consulta de telefones a partir de um nome informado como uma chave de
        dados. O programa deve:
        ? Conter uma classe Pessoa com os atributos nome, telefone e e-mail;
        ? Permitir a entrada de nomes de pessoas com seus respectivos telefones e e-mails, sendo a
        quantidade determinada pelo usu�rio, e armazen�-los em um vetor de objetos pessoas;
        ? Permitir ao usu�rio inserir qual o nome que ele deseja consultar o telefone. Ap�s a consulta,
        exiba o telefone da pessoa procurada. Informe tamb�m se o nome � inexistente no vetor de
        pessoas.*/
    
    //Atributos
    private String nome = "";
    private Integer telefone = 0;
    private String email = "";
    
    //Construtores

    public Pessoa() {
    }
    
    public Pessoa(String nome, Integer telefone, String email){
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
