package juslencode;

import java.util.Arrays;
import java.util.Locale;

public class Exercise {

    public static void main(String[] args){
        /*
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result
        */
        int number1 = 10;
        int number2 = 10;
        int number3 = 0;
        String result = null;

        if(number1 > number2 ){
            result = number1 + " " + "is greater than" + " " + number2;
        }else if(number2 > number1){
            result = number2 + " " +"is greater than" + " " + number1;
        } else{
            result = number1 + " " + " is equal to" + " " + number2;
        }
        System.out.println(result);


          /*
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */

        String string1 = "Love";
        String string2 = "Hate";
        String result1 = null;

        if(string1.equals(string2)){
            result1 = string1 + " " + "is equal to" + " " + string2;
        }else {
            result1 =  string1 + " " + "is not equal to" + " " + string2;
        }

        System.out.println(result1);


        // Write a program that transform "Amigoscode" to "AMIGOSCODE"
        String transform = "Amigoscode";
        String answer = transform.toUpperCase();
        System.out.println(answer);

        // Write a program that transform "amigoscode" to "Amigoscode"
        String transform1 = "amigoscode";
        String answer1 = transform1.substring(0,1).toUpperCase() + transform1.substring(1);
        System.out.println(answer1);


       /*
        Loops and Arrays
       **/

        // declare an empty integer array of length = 3
        // print the contents to the console
        // fill it with the number `4`
        // print the array to the console
        int[] love = new int[3];
        for(int i = 0; i < love.length; i++){
            love[i] = 4;
        }

        for(int i = 0; i < love.length; i++){
            System.out.println(love[i] + "\n\n");
        }


        // reassign the second value in the array to the number `17`
        // print the array to the console
        love[1] = 17;
        for(int i = 0; i < love.length; i++){
            System.out.println(love[i] + "\n\n");
        }

        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] stringArray = {"a","b","c","d"};
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] newArray = stringArray;
        newArray[0] = "z";

        System.out.println("Former array\n");
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        System.out.println("new array\n");
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }


        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] anotherArray = Arrays.copyOf(stringArray,5);
        anotherArray[0] = "z";

        System.out.println("Former array\n");
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        System.out.println("new array\n");
        for(int i = 0; i < anotherArray.length; i++){
            System.out.println(anotherArray[i]);
        }


        // create a `for` loop which prints each item in the array
        String[] a = {"a", "b", "c", "d"};
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        // create a for loop which goes from 0 to 10
        // print each value
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // create a for loop which goes from 10 down to 0
        // print each value
        for(int i = 10; i >= 0; i-- ){
            System.out.println(i);
        }


        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] addArray = new int[11];
        for (int i = 0; i < addArray.length; i++){
            addArray[i] = i;
        }
        System.out.println("Print arrey");
        for (int i = 0; i < addArray.length; i++){
            System.out.println(addArray[i]);
        }

        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        int[] nArray = {1,2,3,4,5,6,7};
        int sum = 0;
        for (int i=0; i<nArray.length; i++){
            sum = sum + nArray[i];
        }
        System.out.println("Total Sum:" + sum);



    }
}
