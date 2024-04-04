package org.example.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Explanation {
    private Hashtable<String, String> explanation = new Hashtable<>();
    Explanation() {
        String file = System.getProperty("user.dir") + "/src/main/resources/KnowledgeBase/TableWithExplanation.csv";
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
            explanation.put(String.valueOf(i), array[i]);
        }
    }
    public Hashtable<String, String> getHashtable() {
        return explanation;
    }

    public String getExplanationByStrId(String index) {
        String[] keys = explanation.keySet().toArray(new String[0]);
        //Arrays.sort(keys);
        for (int i = 0; i < explanation.size(); i++) {
            keys[i] = index;
        }
        return keys[Integer.parseInt(index)];
    }
}
