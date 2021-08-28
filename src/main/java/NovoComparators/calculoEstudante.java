package NovoComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class calculoEstudante {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Bruno", 24));
        estudantes.add(new Estudante("Ana", 17));
        estudantes.add(new Estudante("Clara", 18));
        estudantes.add(new Estudante("Thiago", 30));
        estudantes.add(new Estudante("George", 22));

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversa());
        System.out.println(estudantes);


    }
}
