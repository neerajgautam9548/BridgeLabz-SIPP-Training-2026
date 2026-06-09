import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        double heightCm=sc.nextDouble();
        double height=heightCm/100.0;
        double bmi=weight/(height*height);
        System.out.println("BMI = "+bmi);
        if(bmi<18.5) System.out.println("Underweight");
        else if(bmi<25) System.out.println("Normal");
        else if(bmi<40) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}