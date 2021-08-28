package lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class novoHashSet {
    public static void main(String[] args) {
        Set<Integer> nota = new HashSet<>();

        nota.add(3);
        nota.add(88);
        nota.add(20);
        nota.add(44);
        nota.add(3);

        Iterator<Integer> iterator = nota.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        nota.remove(3);

        nota.add(23);

        int tamSet = nota.size();
        System.out.println(tamSet);

        boolean setVazio = nota.isEmpty();
        System.out.println(setVazio);

        System.out.println(nota);
    }
}
