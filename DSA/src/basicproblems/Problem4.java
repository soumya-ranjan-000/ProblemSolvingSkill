package basicproblems;

public class Problem3 {
    public static void main(String[] args) {
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
}
