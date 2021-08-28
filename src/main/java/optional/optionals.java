import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("nao presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional nulo");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null não presente "));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional empty");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty não presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor Null Pointer Exception");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro não presente"));
    }
}
