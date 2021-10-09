import java.util.Locale;
import java.util.Scanner;

public class Best {
    public static final String[] COMMANDS = {"add", "subtract", "multiply", "divide"};

    public static void main(String []args) {
        Calculator math = new Calculator();
        Vector vector = new Vector();

        System.out.println("Welcome to the math game!");

        System.out.println("Would you like to add subtract multiply or divide. please type it out");
        Scanner scanner = new Scanner(System.in);
        String typeOfMath = scanner.nextLine().toLowerCase(Locale.ROOT);
        if(!(typeOfMath.contains("add") || typeOfMath.contains("subtract") || typeOfMath.contains("multiply") || typeOfMath.contains("divide"))) {
            System.out.println("Invalid response");
            return;
        }
        for (String type : COMMANDS) {
        }
        System.out.println("What would you like the first number to " +typeOfMath+ " by");
        double x = scanner.nextDouble();
        System.out.println("What would you like the second number to " +typeOfMath+ " by");
        double y = scanner.nextDouble();
        switch (typeOfMath.toUpperCase()){
            case "ADD":
                math.add(x,y);
                break;
            case "SUBTRACT":
                math.subtract(x,y);
                break;
            case "MULTIPLY":
                math.multiply(x,y);
                break;
            case "DIVIDE":
                math.divide(x,y);
                break;
        }
    }

}