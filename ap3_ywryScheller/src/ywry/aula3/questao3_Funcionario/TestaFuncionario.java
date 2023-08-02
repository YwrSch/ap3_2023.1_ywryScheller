// Código secreto: 10092781470
package ywry.aula3.questao3_Funcionario;

import java.util.HashMap;

public class TestaFuncionario {
    public static void main(String[] args) {
        HashMap<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();
        for (int i = 0; i < 14; i++) {
            Funcionario f = new Funcionario();
            f.setNome("Funcionario_" + Integer.toString(i + 1));
            if (i < 2) {
                f.setCargo("Gerente");
                f.setSalario(5000.0);
            } else {
                f.setCargo("Empregado");
                f.setSalario(3000.0);
            }
            funcionarios.put(f.getNome(), f);
        }
        System.out.println(funcionarios);
    }
}
