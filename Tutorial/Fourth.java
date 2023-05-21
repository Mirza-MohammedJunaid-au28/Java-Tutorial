import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        /* Conditional Statements */
        int age;
        Scanner sc = new Scanner(System.in);
        boolean age_inp = sc.hasNextInt();
        if(!age_inp){
            System.out.println("!!! Enter Valid Input !!!");
            return;
        }
        age = sc.nextInt();
        String msg = (age >= 18) ? "Eligible for Driving" : "Not Eligible for Driving";
        System.out.println(msg);

        /*int day = 4;
String dayOfWeek;

switch (day) {
    case 1:
        dayOfWeek = "Monday";
        break;
    case 2:
        dayOfWeek = "Tuesday";
        break;
    case 3:
        dayOfWeek = "Wednesday";
        break;
    case 4:
        dayOfWeek = "Thursday";
        break;
    case 5:
        dayOfWeek = "Friday";
        break;
    case 6:
        dayOfWeek = "Saturday";
        break;
    case 7:
        dayOfWeek = "Sunday";
        break;
    default:
        dayOfWeek = "Invalid day";
}

System.out.println("The day of the week is: " + dayOfWeek);
*/
    }
}
