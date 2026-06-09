import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double phy=sc.nextDouble(), chem=sc.nextDouble(), math=sc.nextDouble();
        double avg=(phy+chem+math)/3;
        String grade, remarks;
        if(avg>=80){grade="A"; remarks="Level 4";}
        else if(avg>=70){grade="B"; remarks="Level 3";}
        else if(avg>=60){grade="C"; remarks="Level 2";}
        else if(avg>=50){grade="D"; remarks="Level 1";}
        else if(avg>=40){grade="E"; remarks="Below Standard";}
        else {grade="R"; remarks="Remedial";}
        System.out.println("Average = "+avg);
        System.out.println("Grade = "+grade);
        System.out.println("Remarks = "+remarks);
    }
}