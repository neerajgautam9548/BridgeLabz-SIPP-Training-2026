public class CodingGuild {
    public static void main(String[] args) {

        // Storing member details
        String name = "Ravi";
        int age = 25;
        String rank = "Novice";
        double salary = 50000.0;
        float membershipFee = 1500.50f;

        // Calculate annual bonus (12% of salary)
        double bonus = salary * 0.12;

        // Cast bonus to int
        int annualBonus = (int) bonus;

        // Print formatted welcome card
        System.out.println("================================");
        System.out.println("      WELCOME TO THE GUILD      ");
        System.out.println("================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("================================");
        System.out.println("Welcome, " + name + "! Happy Coding!");
        System.out.println("================================");
    }
}