package main.java.game.fb.simulation.init;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * File reader for CSV files.
 *
 * @author abhi
 */
public class Reader {

    /* Map<Id, List<Data>> */
    public static Map<Integer, Collection<String>> getMap(String fileName, String delim) {
        Map<Integer, Collection<String>> data = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<String> values = Arrays.asList(line.split(delim));
                if (values.isEmpty()) {
                    continue;
                } else if (values.size() < 2) {
                    data.put(Integer.parseInt(values.get(0)), new ArrayList<>());
                } else {
                    data.put(Integer.parseInt(values.get(0)), values.subList(1, values.size()));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("[Reader] Unable to find file: " + fileName);
        } catch (IOException e) {
            System.err.println("[Reader] Error reading file: " + fileName);
        }

        return data;
    }

}