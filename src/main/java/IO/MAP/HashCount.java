package IO.MAP;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashCount {

    public static void main(String[] args) {

        String text = "Count is a simple map/reduce application that " +
                "processes input text and counts the number of occurrences of each word.";

                HashMap<String, Integer> wordCountMap = new HashMap<>();


                String[] words = text.split(" ");


                for (String word : words) {

                    wordCountMap.putIfAbsent(word, 1);
                }

                for (String word : wordCountMap.keySet()) {
                    int count = Collections.frequency(List.of(words), word);
                    wordCountMap.put(word, count);
                }

                System.out.println("Frequency of the word : ");
                for (String word : wordCountMap.keySet()) {
                    int count = wordCountMap.get(word);
                    System.out.println(word + ": " + count);
                }
            }
        }
