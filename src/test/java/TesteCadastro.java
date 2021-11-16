import br.com.academia.Aluno;
import br.com.academia.Sexo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TesteCadastro {


    static Aluno fabricar() {
        return new Aluno(LocalDate.now(), "Igor", 28, "Luiz vieira Sagrilo", 28, "casa3",
                "086845158", Sexo.MASCULINO);
    }

    Aluno aluno = new Aluno();

    @DisplayName("Campo nome não pode ser vazio")
    @Test
    void naoDeveCadastrarIdadeNula() {
        String nome = "Igor";
        if (nome.isEmpty()) {
            System.out.println(" Nome não pode ser vazio");
        }
    }

    @DisplayName("Campo idade não pode ser menor que 0")
    @Test
    void naoDeveCadastrarMenorDeIdade() {
        try {
            int idade = 18;
            Assertions.assertTrue(idade > 0, "Deve retornar idade");
        } catch (Exception e) {
            Assertions.fail("Idade não deveria ser menor que 0");
        }
    }

    @DisplayName(" CPF não pode estar em branco")
    @Test
    void naoDeveCadastrarCpfVazio() {
        String cpf = "086648484";
        if (cpf.isEmpty()) {
            System.out.println(" CPF não pode estar vazio");
        }
    }
}
