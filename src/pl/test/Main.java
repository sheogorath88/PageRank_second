package pl.test;

import java.util.*;

public class Main {

    public static void main(String[] var0) {
        System.out.println("Please, give 13 sentences");
        Scanner scanner = new Scanner(System.in);
        List<String> sentences = new ArrayList<>();

        int lengthOfList = 4;
        for (int i = 0; i < lengthOfList; ++i) {
            sentences.add(scanner.nextLine());
        }
        Map<String, Map<Integer,String>> wordToNumberOfOccurrence = new HashMap<>();
        for (int i = 0; i < lengthOfList; i++) {
            String sentenceToSplit = sentences.get(i);
            String[] wordsInSentence = sentenceToSplit.split(" ");
            for(int j = 0; j < wordsInSentence.length; j++){
                String key = wordsInSentence[j];
                int numberOfOccurrences = 0;
                for(int k = 0; k < wordsInSentence.length; k++){
                    if(key.equalsIgnoreCase(wordsInSentence[k])){
                        numberOfOccurrences++;
                    }
                }
                Map<Integer, String> value= new HashMap<>();
                value.put(numberOfOccurrences, sentenceToSplit);
                wordToNumberOfOccurrence.put(key,value);
            }
        }
        System.out.println("Pleas, give 3 words");
        for(int i = 0; i < 3; i++){
            String inputWord = scanner.nextLine();
            Collection<String> values = wordToNumberOfOccurrence.get(inputWord).values();
            System.out.println(values);
        }
    }
}