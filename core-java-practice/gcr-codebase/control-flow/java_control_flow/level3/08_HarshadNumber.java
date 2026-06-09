import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), temp=n, sum=0;
        while(temp>0){ sum += temp%10; temp/=10; }
        System.out.println(n%sum==0?"Harshad Number":"Not Harshad Number");
    }
}