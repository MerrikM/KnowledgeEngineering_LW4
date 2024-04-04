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

    public Hashtable<String, String> getHashtable() {
        return graphVerticies;
    }

    public String GetVerticiesByStrId(String index) {
        String[] keys = graphVerticies.keySet().toArray(new String[0]);
        //Arrays.sort(keys);
        for (int i = 0; i < graphVerticies.size(); i++) {
            keys[i] = index;
        }
        return keys[Integer.parseInt(index)];
    }

    public void DisplayAllHash() {
        for(int i = 0; i <= graphVerticies.size() - 1; i++) {
            System.out.println("[" + i + "]" + " " + graphVerticies.get(String.valueOf(i)));
        }
    }

    public String getMapKeyByValue(Hashtable<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
