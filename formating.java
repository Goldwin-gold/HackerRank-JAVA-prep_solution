import java.util.*;
import java.io.*;

class formating{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum=(double)a;
            for(double j=0;j<n;j++){
                sum=sum+((Math.pow(2,j))*b);
                //
                System.out.printf("%.0f ",sum);
            }
            System.out.println();
        }
        in.close();
    }
}

