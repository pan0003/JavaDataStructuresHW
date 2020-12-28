import java.util.*;
import java.lang.Math;

public class DataStructuresHWCode {

    private int sum = 0;

    public void getSum() {

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < 5; ++i) {
            sum += numbers[i];
        }
        System.out.println("The sum of the array is " + sum);
    }

    public void getOutput() {

        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
        double maximum = exampleArray[0]; 
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println("The answer is " + index + " but Idk why that is the case.");
        
    }

    public void toPower() {
        int size; // This is the size of the array
        float power; // This is the index raised to power (ie power 2 = [0, 1, 4, 9, ....] index^2)

        Scanner input = new Scanner(System.in);
        System.out.println("I will create an array!");
        System.out.println("Enter a number for the array size: ");
        size = input.nextInt();
        double[] numbers = new double[size];
        System.out.println("Enter a number the power to iterate the values of index: ");
        power = input.nextFloat();
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.pow(i, power);
        }

        System.out.println(Arrays.toString(numbers));
        input.close();
    }

    public static void main(String[] args) throws Exception {
        DataStructuresHWCode nums = new DataStructuresHWCode();
        // Part 1 of the HW
        nums.getSum();
        System.out.println("**********");
        // Part 2 of the HW
        nums.getOutput();
        System.out.println("**********");
        // Part 3 of the HW
        nums.toPower();
    }
}

