package br.com.academia;


import javax.persistence.*;
import java.time.LocalDate;

/**
 * Centralizador de entidades.
 * @author Igor Romão santos
 * @version 1.0 - 16/11/21
 * @since 16/11/21
 */



@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data")
    private LocalDate localDateTime = LocalDate.now();

    @SuppressWarnings("nome")
    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "complemento")
    private String completo;

    @Column(name = "cpf")
    private String CPF;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;

    public Aluno(LocalDate localDateTime, String nome, Integer idade, String endereco, Integer numero, String completo, String CPF, Sexo sexo) {

        this.localDateTime = localDateTime;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.numero = numero;
        this.completo = completo;
        this.CPF = CPF;
        this.sexo = sexo;
    }

    public Aluno() {

    }

    public void validacao(String nome) throws Exception {
        if (this.nome.equals(null) & this.nome.isEmpty()) {
            throw new Exception(" nome não pode ser nulo ou vazio");
        }
        if (idade == null) {
            throw new Exception(" idade não pode ser nula");
        }
        if (endereco.equals(null) & endereco.isEmpty()) {
            throw new Exception(" endereco não pode ser nulo ou vazio");
        }
        if (numero == null) {
            throw new Exception(" numero não pode ser vazio");
        }
        if (CPF.isEmpty()) {
            throw new Exception(" CPF não pode ser vazio");
        }
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNome(String s) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade(int i) {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCompleto() {
        return completo;
    }

    public void setCompleto(String completo) {
        this.completo = completo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
