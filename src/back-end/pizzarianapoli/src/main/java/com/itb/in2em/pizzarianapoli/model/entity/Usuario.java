package com.itb.in2em.pizzarianapoli.model.entity;

public class Usuario {

    private long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String sexo;
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private String codStatus;
    private String tipoStatus; // Admin, cliente ou Funcionario
    private String uf;

    //Setter's | Getter's
public void setId(Long id) {
   this.id = id;
}

public long getId() {
   return id;
}

public void setNome(String nome) {
   this.nome = nome;
}

public String getNome(){
    return nome;
}

public void setCpf(String cpf) {
   this.cpf = cpf;
}

public String getCpf(){
    return cpf;
}


public void setEmail(String email) {
   this.email = email;
}

public String getEmail(){
    return email;
}

public void setSenha(String senha) {
   this.senha = senha;
}

public String getSenha(){
    return senha;
}

public void setSexo(String sexo) {
   this.sexo = sexo;
}

public String getSexo(){
    return sexo;
}

public void setLogradouro(String logradouro) {
   this.logradouro = logradouro;
}

public String getLogradouro(){
    return logradouro;
}

public void setCep(String cep) {
   this.cep = cep;
}

public String getCep(){
    return cep;
}

public void setBairro(String bairro) {
   this.bairro = bairro;
}

public String getBairro(){
    return bairro;
}

public void setCidade(String cidade) {
   this.cidade = cidade;
}

public String getCidade(){
    return cidade;
}

public void setCodStatus(String codStatus) {
   this.codStatus = codStatus;
}

public String getCodStatus(){
    return codStatus;
}

public void setTipoStatus(String tipoStatus) {
   this.tipoStatus = tipoStatus;
}

public String getTipoStatus(){
    return tipoStatus;
}

public void setUf(String uf) {
   this.uf = uf;
}

public String getUf(){
    return uf;
}















}
