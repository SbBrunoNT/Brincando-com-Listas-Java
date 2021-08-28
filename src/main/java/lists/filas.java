package lists;

import java.util.LinkedList;
import java.util.Queue;

public class filas {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        for(String nome : filaBanco){
            System.out.println("--->"+nome);
        }

        System.out.println(filaBanco.peek());

        String removeOPrimeiro = filaBanco.poll();

        System.out.println(removeOPrimeiro);
        System.out.println(filaBanco);

        filaBanco.add("Daniel");
        System.out.println(filaBanco);

        int tamFila = filaBanco.size();
        System.out.println(tamFila);

        boolean estaVazia = filaBanco.isEmpty();
        System.out.println(estaVazia);

        boolean contemNome = filaBanco.contains("Carlos");

        System.out.println(contemNome);
    }
}
