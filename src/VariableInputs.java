import java.util.Scanner;

public class VariableInputs {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text");
        String text = scanner.nextLine();
        System.out.println("Enter an integer");
        Integer num = scanner.nextInt();
        System.out.println("Enter a double");
        Double dub = scanner.nextDouble();
        System.out.println("Enter a boolean value");
        Boolean boo = scanner.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("You integer is " + num);
        System.out.println("You double is " + dub);
        System.out.println("Your boolean is " + boo);

       
    }
    
}
