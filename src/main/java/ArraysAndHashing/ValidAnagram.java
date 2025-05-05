package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 */
public class ValidAnagram {
    public static  boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm1= createHM(s);
        HashMap<Character, Integer> hm2= createHM(t);
        System.out.println(hm1);
        System.out.println(hm2);
        if(hm1.size() != hm2.size()){
            return false;
        }
        else {
            //Map.Entry used to iterate entryset
            for (Map.Entry<Character, Integer> e: hm1.entrySet()){
                Character key= e.getKey();
                Integer value= e.getValue();
                //equals() method is used to compare 2 Integers.
                if (!hm2.containsKey(key) || !hm2.get(key).equals(value)){
                    return false;
                }
            }
        }
        return true;
    }
    //Create a hashmap with the string. Each char as key and it's frequency as value.
    public static HashMap<Character, Integer> createHM(String s){
        HashMap<Character, Integer> hm= new HashMap<>();
        for (char c: s.toCharArray()){
            if (hm.get(c)==null){
                hm.put(c, 1);
            }
            else {
                hm.put(c,hm.get(c)+1);
            }
        }
        return hm;
    }
}
