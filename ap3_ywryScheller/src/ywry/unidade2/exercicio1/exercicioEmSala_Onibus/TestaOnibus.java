package ywry.unidade2.exercicio1.exercicioEmSala_Onibus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestaOnibus {
    public static void main(String[] args) {
        Passageiro p = new Passageiro("ywry", "123", LocalDate.of(2002, 3, 24));
        Viagem v = new Viagem(0, "Cruzeta", "Caico", LocalDateTime.of(2023, 8, 26, 7, 0, 0), LocalDateTime.of(2023, 8, 26, 07, 45, 0));
        Assento a = new Assento(20);
        System.out.println(p);
        System.out.println(v);
        System.out.println(a);
        v.reservarAssento(0);
        Reserva r = new Reserva(p, a, v);
        System.out.println(r);
        System.out.println(v);
        v.assentosDisponiveis();
    }
}
