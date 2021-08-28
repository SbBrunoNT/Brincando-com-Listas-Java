import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class novoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequencia = new LinkedHashSet<>();

        sequencia.add(3);
        sequencia.add(88);
        sequencia.add(20);
        sequencia.add(44);
        sequencia.add(3);
        for (Integer num : sequencia){
            System.out.println("---->"+ num);
        }

        sequencia.remove(3);
        sequencia.add(23);

        Iterator<Integer> iterator = sequencia.iterator();

        while (iterator.hasNext()){
            System.out.println("--- Iterator "+ iterator.next());
        }

        System.out.println(sequencia.size());

        System.out.println(sequencia.isEmpty());

    }
}
