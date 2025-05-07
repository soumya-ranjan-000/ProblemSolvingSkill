package basicproblems;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static void p1(){
//        1. How do you reverse a string in Java?
        String original = "Soumya Ranjan Ghadei";

        //1. Using StringBuilder
        StringBuilder builder = new StringBuilder(original);
        String reversedString = builder.reverse().toString();
        System.out.println("Original String: "+original+",\n Reversed String: "+reversedString);

        //2. Using character reversal
        String newString= "";
        char[] chars = new char[original.length()];
        original.getChars(0,original.length(),chars,0);
        for(int i = chars.length -1 ; i >= 0 ; i-- ){
            newString+=chars[i];
        }
        System.out.println("Original String: "+original+",\n Reversed String: "+newString);
    }
    static void p2(){
//        2. How do you swap two numbers without using a third variable in Java?
        int a=10;
        int b=13;
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    static void p3(){
//        3. Write a Java program to check if a vowel is present in a string.
        String ranString = "xyz1 % A";
        boolean isVowelPresent = false;
        for(int i=0;i<ranString.length();i++){
            char c = ranString.toLowerCase().charAt(i);
            if (Character.isLetter(c)){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    isVowelPresent=true;
                    break;
                }
            }
        }
        if(isVowelPresent) System.out.println("String contains a vowel");
        else System.out.println("String doesn't contains a vowel");
    }
    static void p4(){
        // input - Good Morning Everyone
        // output - Everyone Morning Good
        // split is not allowed
        String s = "Good Morning Everyone";
        List<String> list= new ArrayList<>();//[Good,Morning,Everyone]
        String tempString= ""; //Everyone
        for(int i =0 ;i < s.length();i++){
            if(s.charAt(i)!=' '){
                tempString=tempString+s.charAt(i);
            }else{
                list.add(tempString);
                tempString="";
            }
        }
        list.add(tempString);
        s="";
//        for(String word : list.reversed()){ //[Everyone,Morning,Good]
//            s=s+word+" ";
//        }
        for(int i= list.size()-1; i>=0;i--){ //[Good,Morning,Everyone]
            String word = list.get(i);
            s=s+word+" ";
        }
        //Everyone Morning Good
        s=s.trim();
        System.out.println(s);
    }
    static void p5(){
        // Part 1-> Process this string and find out the occurrence of each character.
        // Part 2 -> find out the second-largest character by occurrence?

        String s = "aab123cdbcccddee123";
        Map<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                if(table.putIfAbsent(c,1)!=null){
                    table.put(c, table.get(c) + 1);
                }
            }
        }

        System.out.println(table);
        int max = 0;
        int secMax = 0;
        char maxChar = ' ';
        char secMaxChar = ' ';
        for (Character c : table.keySet()) {
            int x = table.get(c);
            if (x > max) {
                secMax = max;
                secMaxChar = maxChar;
                max = x;
                maxChar = c;
            } else if (x > secMax) {
                secMax = x;
                secMaxChar = c;
            }
        }
        System.out.println(secMaxChar);
    }
    static void p6(){
        String s = "ananya"; //*n**ny***
        int count=0;
        String str="";
        for(int i =0 ;i <s.length();i++){
            String tempString = "";
            char c = s.charAt(i);
            if(c == 'a'){
                count++;
                for(int j = count; j>0; j--){
                    tempString+="*";
                }
                str+=tempString;
            }else{
                str+=c;
            }
        }
        System.out.println(str);
    }

    static void p7(){
        String ip= "Automation";
        int lastIndex = ip.length()-1;
        char[] chars =  ip.toCharArray();
        String str = "aeiouAEIOU";
        for(int i =0; i<chars.length; i++){
            char c = chars[i];
            if(!str.contains(String.valueOf(c))){ // not a vowel, do swap
                while (lastIndex>i){
                    if(!str.contains(String.valueOf(chars[lastIndex]))){
                        char temp = chars[lastIndex];
                        chars[lastIndex]=chars[i];
                        chars[i] = temp;
                        lastIndex--;
                        break;
                    }else {
                        lastIndex--;
                    }
                }
            }
        }
        System.out.println(String.valueOf(chars));
    }

    static void p8(){
        //Write a python/java script to find the most occurred number in a list,
        // along with its occurrence count
        //l = [4,2,3,1,4,5,6,2,3,7,2,3,4]

        int[] numbers =  {4,2,3,1,4,5,6,2,3,7,2,3,4,3};
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int n : numbers){
            if(table.containsKey(n)){
                table.put(n, table.get(n)+1);
            }else{
                table.put(n, 1);
            }
        }

        int max=Integer.MIN_VALUE;
        int key=0;
        for(Integer k: table.keySet()){
            if(table.get(k) > max){
                max=  table.get(k);
                key = k;
            }
        }
        System.out.println(key+" -> "+max);
    }

    //Google Problem
    static void p9(){
        //Write a program to find the number of words in a string that are present in the original string in sequence.
        //maintaining the original order
        String str = "abbcde";
        String[] words = {"a","bab","bba","acd", "ace", "abbe"};
//       String[] words = {"a","abb","acd", "ace"};

        int count=0;
        for(String word:words){
            StringBuilder builder = new StringBuilder(str);
            char[] chars = word.toCharArray();
            int prevCharIndex=-1;
            boolean allCharactersPresentInCorrectOrder = true;
            for (char aChar : chars) {
                int currentCharIndex = builder.indexOf(String.valueOf(aChar), prevCharIndex + 1);
                if (currentCharIndex == -1 || !(currentCharIndex > prevCharIndex)) {
                    // check if character is present in original string or not
                    // handle the duplication of character as well
                    // check character is in correct original order or not
                    allCharactersPresentInCorrectOrder = false;
                    break;
                } else {
                    // check if duplicate character is there
                    //remove the character from the original string if duplicate found
                    prevCharIndex = currentCharIndex; // we are good to continue to check next character
                }
            }
            if(allCharactersPresentInCorrectOrder) count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
//        p8();
        p9();
    }
}


