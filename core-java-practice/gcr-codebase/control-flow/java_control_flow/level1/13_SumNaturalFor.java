import java.util.Scanner;
public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        long formula=(long)n*(n+1)/2;
        System.out.println(sum==formula);
    }
}