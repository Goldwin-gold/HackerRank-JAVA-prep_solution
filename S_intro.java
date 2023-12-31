/* There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java". */
import java.io.*;
import java.util.*;

public class S_intro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1=A.length();
        int l2=B.length();
        int sum=l1+l2;
        System.out.println(sum);
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println((A.substring(0,1)).toUpperCase().concat(A.substring(1,l1))+" "+(B.substring(0,1)).toUpperCase().concat(B.substring(1,l2)));

    }
}



