import java.util.TreeSet;

public class novoTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeCap = new TreeSet<>();

        treeCap.add(3);
        treeCap.add(88);
        treeCap.add(20);
        treeCap.add(44);
        treeCap.add(3);

        System.out.println(treeCap);

        for (Integer num : treeCap){
            System.out.println("Iterando com For: "+ num);
        }

        int removePrimeiro = treeCap.pollFirst();
        System.out.println("Primeiro removido: "+ removePrimeiro);

        treeCap.add(23);
        System.out.println(treeCap);
        System.out.println(treeCap.size());
        System.out.println(treeCap.isEmpty());

//        treeCap.first();
//        treeCap.last();
//
////        treeCap.higher();
////        treeCap.lower("");
//
//        treeCap.pollFirst();
//        treeCap.pollLast();
    }
}
