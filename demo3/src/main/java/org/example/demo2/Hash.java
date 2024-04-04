package org.example.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Hash {
    private Hashtable<String, String> graphVerticies = new Hashtable<>();
    Hash() {
        String file = System.getProperty("user.dir") + "/src/main/resources/KnowledgeBase/TableWithoutNumeration.csv";
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        String[] array = lines.toArray(new String[0]);
        for (int i = 0; i < array.length; i++) {
            graphVerticies.put(String.valueOf(i), array[i]);
        }
    }

    protected Hashtable<String, String> getGraphVerticies() {
        return graphVerticies;
    }

    protected String getHashKeyByValue(Hashtable<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected String GetVerticiesByStrId(Hashtable<String, String> hashtable, String index) {
        String[] keys = hashtable.keySet().toArray(new String[0]);
        //Arrays.sort(keys);
        for (int i = 0; i < hashtable.size(); i++) {
            keys[i] = index;
        }
        return keys[Integer.parseInt(index)];
    }

    protected void DisplayAllHash(Hashtable<String, String> hashtable) {
        for(int i = 0; i <= hashtable.size() - 1; i++) {
            System.out.println("[" + i + "]" + " " + hashtable.get(String.valueOf(i)));
        }
    }

    protected String getMapKeyByValue(Hashtable<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
