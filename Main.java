import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = input.nextInt();
        int minimum = Math.min(num1, num2);
        int maximum = Math.max(num1, num2);
        int lastResult= ( num1 + num2) / 2;
        while (true){
            System.out.println("Enter 1 to addition the numbers\n" +
                    "\n" +
                    "Enter 2 to multiplication the numbers\n" +
                    "\n" +
                    "Enter 3 to division the numbers\n" +
                    "\n" +
                    "Enter 4 to modulus the numbers\n" +
                    "\n" +
                    "Enter 5 to subtraction the numbers\n" +
                    "\n" +
                    "Enter 6 to find minimum number\n" +
                    "\n" +
                    "Enter 7 to find maximum number\n" +
                    "\n" +
                    "Enter 8 to find the average of numbers\n" +
                    "\n" +
                    "Enter 9 to print the last result in calculator\n" +
                    "\n" +
                    "Enter 10 to print the list of all results in calculato" +
                    "+\n" +
                    "Enter 11 to Ent calculato");
            switch (input.nextInt()){
                case 1:
                    System.out.println(num1+"+ "+num2+" = "+ ( num1 + num2));
                    break;
                case 2:
                    System.out.println(num1+"* "+num2+" = "+ ( num1 * num2));
                    break;
                case 3:
                    System.out.println(num1+"/ "+num2+" = "+( num1 / num2));
                    break;
                case 4:
                    System.out.println(num1+"% "+num2+" = "+ ( num1 % num2));
                    break;
                case 5:
                    System.out.println(num1+"-"+num2+" = "+ ( num1 - num2));
                    break;
                case 6:
                    System.out.println(" minimum number is: "+ (minimum));
                    break;
                case 7:
                    System.out.println(" maximum number is: "+ (maximum));
                    break;
                case 8:
                    System.out.println(" the avarage is: "+ lastResult);
                    break;
                case 9:
                    System.out.println("the last result is :"+ lastResult);
                case 10:
                    System.out.println("List of all results:");
                    System.out.println(num1+"+ "+num2+" = "+ ( num1 + num2));
                    System.out.println(num1+"* "+num2+" = "+ ( num1 * num2));
                    System.out.println(num1+"/ "+num2+" = "+( num1 / num2));
                    System.out.println(num1+"% "+num2+" = "+ ( num1 % num2));
                    System.out.println(num1+"-"+num2+" = "+ ( num1 - num2));
                    System.out.println(" minimum number is: "+ (minimum));
                    System.out.println(" maximum number is: "+ (maximum));
                    System.out.println(" the avarage is: "+ lastResult);
                    break;
                case 11:
                    System.out.println(" Thank you see you soon...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                   break;
            }
            }

        }
    }
