public class Conditional{
    public static void main(String []args){
        //Conditional Statements are used in decision making this statements checks the condition and then decides what to do next based on whether the condition is true or false

        // 1) If-Else Statement:
        int num = 2;

        if (num % 2 == 0){
        System.out.println("Even Number");
        } else{
        System.out.println("Odd Number");
        }


        // 2) If Statement:
        int age = 18;

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }

        // 3) If-else ladder :

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4) Nested if :
        int age = 20;
        boolean canVote = true;

        if (age >= 18) {
            if (canVote) {
                System.out.println("Voting allowed");
            }
        }

        // 5) Switch statement :
        int day = 3;

        switch (day) {
            case 1: System.out.println("Monday"); 
            break;
            case 2: System.out.println("Tuesday"); 
            break;
            case 3: System.out.println("Wednesday"); 
            break;
            default: System.out.println("Invalid day");
        }

        // 6) Ternary Operator: ( it falls in conditional statement as well as operator)

        int number = 10;

        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
