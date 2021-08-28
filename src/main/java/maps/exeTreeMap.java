package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class exeTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapV = new TreeMap<>();

        treeCapV.put("BH" , "Belo Horizonte");
        treeCapV.put("SC", "Santa Catarina");
        treeCapV.put("AL" , "Alagoas");

        treeCapV.firstKey();
        treeCapV.lastKey();
        treeCapV.lowerKey("");
        treeCapV.higherKey("");
        //Retorna primeiro estado concatenando a chave com o valor
        System.out.println(treeCapV.firstEntry().getKey() + "<--->"+ treeCapV.firstEntry().getValue());
        //Retorna último estado concatenando a chave com o valor
        System.out.println(treeCapV.lastEntry().getKey() + "<--->"+ treeCapV.lastEntry().getValue());

        System.out.println(treeCapV.lowerEntry("SC").getKey()+"<-->"+ treeCapV.lowerEntry("SC").getValue());

        System.out.println(treeCapV.higherEntry("SC").getKey()+"<-->"+ treeCapV.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry = treeCapV.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapV.pollLastEntry();

        System.out.println(firstEntry.getKey() + "--" + firstEntry.getValue());
        System.out.println(lastEntry.getKey() +"--" + lastEntry.getValue());

        Iterator<String> iterator = treeCapV.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key +"--"+ treeCapV.get(key));
        }

        for (String caps : treeCapV.keySet()){
            System.out.println(caps+"-----"+treeCapV.get(caps));
        }
        for (Map.Entry<String, String> caps : treeCapV.entrySet()){
            System.out.println(caps.getKey() +"<--->"+caps.getValue());
        }




    }
}
