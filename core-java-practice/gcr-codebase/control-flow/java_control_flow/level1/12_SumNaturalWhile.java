import java.util.Scanner;
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0; int i=1;
        while(i<=n){ sum+=i; i++; }
        long formula=(long)n*(n+1)/2;
        System.out.println("While Sum = "+sum);
        System.out.println("Formula Sum = "+formula);
        System.out.println(sum==formula);
    }
}