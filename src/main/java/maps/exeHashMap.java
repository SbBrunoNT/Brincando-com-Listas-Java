package maps;

import java.util.HashMap;
import java.util.Map;

public class exeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> dicionario = new HashMap<>();

        dicionario.put("Brasil", 1);
        dicionario.put("EUA", 22);
        dicionario.put("Alemanha", 15);
        dicionario.put("Itália", 19);

//        dicionario.containsKey("");
//        dicionario.containsValue(2);
//        dicionario.size();

        for (Map.Entry<String, Integer> entry : dicionario.entrySet()){
            System.out.println("Map.Entry"+entry.getKey() +"----"+ entry.getValue());
        }

        for (String key : dicionario.keySet()){
            System.out.println(key + "-" + dicionario.get(key));
        }

        String chave = dicionario.get("Alemanha").toString();
        System.out.println(dicionario.keySet());

    }
}
