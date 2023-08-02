// Código secreto: 10092781470
package ywry.aula3.questao1_Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ywry");
        p1.setIdade(17);
        p1.setAltura(1.79);
        System.out.println(p1);
        System.out.println(p1.ehMaiorDeIdade()?"Maior de idade":"Menor de idade");
        p1.fazerAniversario();
        System.out.println(p1);
        System.out.println(p1.ehMaiorDeIdade()?"Maior de idade":"Menor de idade");
    }
}
