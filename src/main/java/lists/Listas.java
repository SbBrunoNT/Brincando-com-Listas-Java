import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Clarisse");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        for (String nomeLista : nomes){
            System.out.println("O nome é: "+nomeLista);
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes);

        String nomePosicao = nomes.get(1);
        System.out.println(nomePosicao);

        nomes.remove(4);
        System.out.println(nomes);

        int qtdLista = nomes.size();
        System.out.println(qtdLista);

        boolean temJul = nomes.contains("Juliano");
        System.out.println(temJul);

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        System.out.println(novaLista);
        nomes.addAll(novaLista);
//        for(String nomeNovaLista : novaLista){
//            nomes.add(nomeNovaLista);
//        }

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        boolean vazio = nomes.isEmpty();
        System.out.println(vazio);

        nomes.clear();

        System.out.println(nomes.isEmpty());
    }
}
