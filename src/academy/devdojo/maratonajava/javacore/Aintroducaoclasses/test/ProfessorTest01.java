package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " que tem a idade de " + professor.idade + " e que é do sexo " + professor.sexo);



    }
}
