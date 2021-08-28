import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        System.out.println(estudantes.stream().count());

        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));


        System.out.println(estudantes.stream().filter((estudante)->
                estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        System.out.println(estudantes.stream()
                .map(estudante -> estudante.concat("-")
                        .concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        System.out.println(estudantes.stream().allMatch(elemento -> elemento.contains("W")));

        System.out.println(estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        System.out.println(estudantes.stream().noneMatch(elemento -> elemento.contains("a")));

        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante -> estudante.toLowerCase().contains("r")))
                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", "));
//                .collect(Collectors.toSet());
//                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));



    }
}
