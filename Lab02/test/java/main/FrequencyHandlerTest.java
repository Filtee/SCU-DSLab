package main;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyHandlerTest {
    @Test
    void getFrequency() throws IOException {

        String filePath = "./test/java/resources/f1.txt";
        Map<Character,Integer> charFrequency = new HashMap<>();

        charFrequency = FrequencyHandler.getFrequency(filePath);

        Map<Character,Integer> expected = new HashMap<>();
        expected.put('A',7);
        expected.put('C',2);
        expected.put('S',4);
        expected.put('T',5);

        for(Map.Entry<Character,Integer> entry : expected.entrySet()){
            assertEquals(entry.getValue(),charFrequency.get(entry.getKey()));
        }
    }
}