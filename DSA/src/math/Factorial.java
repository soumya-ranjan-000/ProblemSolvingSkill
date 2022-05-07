package math;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println( factorialOfNumber(100));
//        System.out.println(factorial(50));
//        System.out.println(factorialUsingBig(new Scanner(System.in).nextInt()));
//        System.out.println(factorialUsingArray(new Scanner(System.in).nextInt()));
          System.out.println(factorialUsingLinkedList(new Scanner(System.in).nextInt()));
    }


    static String factorialUsingArray(int number){
        if(number==0) return 1+"";
        if(number < 0) return "Factorial of a negative number is not possible";
        int[] resultArr=new int[5*number];
        int numberOfDigitOfNumber=1;
        int carry=0;
        int count=1;
        resultArr[0]=1;
        while (count<=number){
            int index=0;
            while(index<numberOfDigitOfNumber){
                int mul=(resultArr[index]*count)+carry;
                resultArr[index]=mul%10;
                carry=mul/10;
                index++;
            }
            while(carry>0){
                int digit=carry%10;
                carry=carry/10;
                resultArr[numberOfDigitOfNumber]=digit;
                numberOfDigitOfNumber++;
            }
            count++;
        }
        List<Integer> output = new ArrayList<>(IntStream.of(resultArr).boxed().toList());
        Collections.reverse(output);
        System.out.println("numberOfDigitOfNumber: "+numberOfDigitOfNumber);
        return output.toString().replaceAll(", ","").substring((resultArr.length+2)-numberOfDigitOfNumber-1,(resultArr.length+2)-1);
    }


    public static BigInteger factorialUsingBig(int num)
    {
        BigInteger bi = new BigInteger("1");
        for (int j = 2; j <= num; j++)
        {
            bi = bi.multiply(BigInteger.valueOf(j));
        }
        return bi;
    }
    public static String factorialUsingLinkedList(int number){
        if(number==0) return 1+"";
        if(number < 0) return "Factorial of a negative number is not possible";
        Node head=new Node(1);
        Node temp;
        int carry;
        int count=1;
        while (count<=number){carry=0;
           temp=head;
           Node addNode = null;
            while (temp!=null){
                int n=temp.getData();
                int mul=(n*count)+carry;
                temp.setData(mul%10);
                carry=mul/10;
                addNode=temp;
                temp=temp.getNext();
            }
            while(carry>0){
                int digit=carry%10;
                carry=carry/10;
                addNode.setNext(new Node(digit));
                addNode=addNode.getNext();
            }
            count++;
        }
        StringBuilder result= new StringBuilder();
        while (head!=null){
          result.append(head.getData());
          head=head.getNext();
        }
        result.reverse();
        return result.toString();
    }
}

class Node{
    private int data=0;
    private Node next=null;

    Node(int num){
        this.data=num;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data=data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next=next;
    }

}
