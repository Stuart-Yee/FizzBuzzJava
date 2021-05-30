public class FizzBuzz {
    public static String fizzBuzz(int number) {
        // fizzbuzz logic here
        String output;
        if(number%15 == 0){
            output = "FizzBuzz";
        }
        else if(number%3 == 0){
            output = "Fizz";
        }
        else if(number%5 == 0){
            output = "Buzz";
        }
        else{
            output = String.format("%d", number);
        }
        return output;
    }
}