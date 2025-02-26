/** Class that prints the Collatz sequence starting from a given number.
 *  @author floyd white
 */

public class Collatz{
    public static int nextNumber(int n){
        if(n%2==1){//odd number
            return 3*n+1;
        } else {//even number
            return n/2;
        }
    }

    public static void main(String[] args){
        int n = 5;
        while (n != 1){
            System.out.print(n+" ");
            n=nextNumber(n);
        }
        System.out.print(n+" ");
    }
}