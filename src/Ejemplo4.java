    import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        float x;
        float y;
        float sum;
        float sub;
        float mult;
        float div;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("introduce number 1: ");
        x = inputValue.nextFloat();

        System.out.println("introduce number 2: ");
        y = inputValue.nextFloat();

        inputValue.close();


        sum = x + y;
        sub =  x- y;
        mult = x * y;
        div = x / y;

        System.out.println("sum: " + sum);
        System.out.println("subtraction: " + sub);
        System.out.println("multiplication: " + mult);
        System.out.println("div: " + div);


    }
}
