import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> HASH_MAP = new HashMap<>();
        HashMap<String, Integer> newHASH_MAP = new HashMap<>();
        HASH_MAP.put("яблоки", 300);
        HASH_MAP.put("груши", 456);
        HASH_MAP.put("лук", 80);
        HASH_MAP.put("свекла", 650);
        HASH_MAP.put("картошка", 1020);
        HASH_MAP.put("чеснок", 10);
        HASH_MAP.put("ягоды", 230);

        System.out.println(HASH_MAP);
        for(Map.Entry<String, Integer> entry :HASH_MAP.entrySet()) {
            if (entry.getValue() <= 300) newHASH_MAP.put(entry.getKey(), entry.getValue());
        }
        System.out.println(newHASH_MAP);
    }
}



    

