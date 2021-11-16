package br.com.academia;

public enum Sexo {
     MASCULINO("M") ,
     FEMININO("F");

     private final String descricao;

     Sexo(String descricao) {
          this.descricao = descricao;
     }

     public String GetDescricao() {
          return descricao;
     }
}
