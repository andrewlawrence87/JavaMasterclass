public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9';
        char myChar2 = '\u00AE';
        System.out.println("Unicode output was: " + myChar);
        System.out.println("Unicode output was: " + myChar2);

        boolean isCar = true;
        boolean wasCar = isCar  ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // Create a double variable with a value of 20
        // Create a second variable of type double with value of 80
        // Add both numbers up and multiply by 25
        // Find the remainder and divide by 40
        // Write an If statement that displays "Total was over the limit" if the remaining total is equal to 20 or less

        double firstValue = 20;
        double secondValue = 80;
        double result = (firstValue + secondValue) * 25;
        System.out.println(result);
        result = result % 40;
        if (result <= 20){
            System.out.println("Total was over the limit");
        }

    }
}
