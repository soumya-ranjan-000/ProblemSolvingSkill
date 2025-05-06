package basicproblems;

public class DeltaProblem {

    //rotate the string by a delta value
    static String rotateByDeltaValue(String input, int deltaValue){
        if(deltaValue == 0) return input;
        int first = 'a';
        int last = 'z';
        char[] alphabets = input.toCharArray();
        String newString ="";
        for(char c: alphabets){
            int diff=0;
            char newChar=' ';
            if(c+deltaValue > last){
                diff = (c+deltaValue) - last;
            }
            if(c+deltaValue < first){
                diff = first - (c+deltaValue);
            }
            // if diff is 0
            // do normal rotation
            if(diff == 0){
                newChar = (char)(((int)c) + deltaValue);
            }else{
                if(deltaValue>0){
                    newChar = (char)('a'+(diff-1));
                }else{
                    newChar = (char)('z'-(diff-1));
                }
            }
            newString+=newChar;
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(rotateByDeltaValue("test",3));
        System.out.println(rotateByDeltaValue("whvw",-3));
        System.out.println(rotateByDeltaValue("abc",-3));
        System.out.println(rotateByDeltaValue("xyz",3));
        System.out.println(rotateByDeltaValue("abc",26));
        System.out.println(rotateByDeltaValue("xyz",-26));
    }
}
