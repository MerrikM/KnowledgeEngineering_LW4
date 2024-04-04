package org.example.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Edges {
    private Hashtable<String, String> graphedges = new Hashtable<>();
    Edges() {
        String file = System.getProperty("user.dir") + "/src/main/resources/KnowledgeBase/TableWithEdges2.csv";
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
            graphedges.put(String.valueOf(i), array[i]);
        }
    }

    public Hashtable<String, String> getHashtable() {
        return graphedges;
    }
    public String GetEdgesByStrId(String index) {
        String[] keys = graphedges.keySet().toArray(new String[0]);
        //Arrays.sort(keys);
        for (int i = 0; i < graphedges.size(); i++) {
            keys[i] = index;
        }
        return keys[Integer.parseInt(index)];
    }

    public String getHashKeyByValue(Hashtable<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
