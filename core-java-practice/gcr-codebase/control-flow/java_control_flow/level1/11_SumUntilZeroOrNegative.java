import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        while(true){
            double v=sc.nextDouble();
            if(v<=0) break;
            total+=v;
        }
        System.out.println(total);
    }
}