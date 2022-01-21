package day04;


import java.util.*;

public class VowelFind {

    public Map<String, Integer> findVowels(String word) {
        Map<String, Integer> returnMap = new TreeMap<>();
        List<Integer> tempList = Arrays.asList(0, 0, 0, 0, 0);
        for (Character c : word.toLowerCase(Locale.ROOT).toCharArray()) {
            switch (c) {
                case 'a':
                    tempList.set(0, tempList.get(0) + 1);
                    break;
                case 'e':
                    tempList.set(1, tempList.get(1) + 1);
                    break;
                case 'i':
                    tempList.set(2, tempList.get(2) + 1);
                    break;
                case 'o':
                    tempList.set(3, tempList.get(3) + 1);
                    break;
                case 'u':
                    tempList.set(4, tempList.get(4) + 1);
            }
        }
        returnMap.put("a", tempList.get(0));
        returnMap.put("e", tempList.get(1));
        returnMap.put("i", tempList.get(2));
        returnMap.put("o", tempList.get(3));
        returnMap.put("u", tempList.get(4));
        return returnMap;
    }
}
