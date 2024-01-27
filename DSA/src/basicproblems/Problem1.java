package basicproblems;

public class Problem1 {
    public static void main(String[] args) {
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
}
