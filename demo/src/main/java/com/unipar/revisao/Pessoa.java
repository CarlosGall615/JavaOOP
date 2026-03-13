package com.unipar.revisao;

import java.util.Date;

// Classe é um mapa de como o Objeto Pessoa será

public class Pessoa {

    // Atributos da classe Pessoa, sempre devem ser privados, para que não sejam acessados diretamente, e sim por meio de métodos públicos (getters e setters)

    private String nome;
    private Date dataNascimento;
    private char sexo;
    private String cpf;



    // Construtor da classe Pessoa, é um método especial que é chamado quando um objeto é criado, ele tem o mesmo nome da classe e não tem retorno, ele é usado para inicializar os atributos da classe
    public Pessoa () { }



    // Métodos getters e setters, são métodos públicos que permitem acessar e modificar os atributos privados da classe, os getters retornam o valor do atributo, e os setters recebem um parâmetro e atribuem esse valor ao atributo
    // Método getter "Pega" o valor do atributo, e manda para quem está solicitando
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public String getCpf() {
        return cpf;
    }

    // Método setter "Insere" o valor do atributo, e recebe o valor que deve ser atribuído ao atributo
    // O void indica que o método não retorna nenhum valor, ele apenas executa uma ação, nesse caso, atribuir um valor ao atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    





}
