import java.util.Scanner;

public class ComputeFare {
    public static void main(String args[]) {
        while(true) {
            System.out.print("Enter the age: ");
            Scanner keyboard = new Scanner(System.in);
            int age = keyboard.nextInt();
            int fare;

            // If age < 11 then fare = 3
            // If age > 11 and age < 65 then fare = 5
            // Else other ages then fare 3
            if (age < 11) fare = 3;
            if (age > 11 && age < 65) fare = 5;
            else fare = 3;
            System.out.println("Fare: " + fare + "\n\n");
        }
    }
}

// import java.util.regex.Pattern;

// public class ComputeFare {
//     // ComputeFare Fields
//     public static Scanner in = new Scanner(System.in);
//     public static int age;
//     public static String validatedAge;
//     public static int fare;

//     public static void main(String[] args) throws Exception {
//         // Invoking getFare methods
//         while(true) {
//             getFare();
//         }
//     }

//     public static void getFare() {
//         // Ask for user age
//         System.out.print("\nEnter Age: ");
//         validatedAge = in.nextLine();

//         // Validate user input
//         while(!Pattern.compile("^[0-9]+$").matcher(validatedAge).find()) {
//             System.out.println("Invalid input!");
//             System.out.print("\nEnter Age: ");
//             validatedAge = in.nextLine();
//         }

//         // assign validatedAge to age variable
//         age = Integer.parseInt(validatedAge);

//         // If age < 11 then fare = 3
//         // If age > 11 and age < 65 then fare = 5
//         // Else other ages then fare 3
//         fare = (age > 11 && age < 65) ? 5: 3;

//         System.out.println("Your fare is $" + fare);
//     }
// }