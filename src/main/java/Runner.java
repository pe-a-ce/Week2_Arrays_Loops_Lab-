import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();

        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list DONE
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list DONE

//        3. Add "Islay" after "Jura" and before "Mull" DONE

//        4. Print out the index position of "Skye" DONE
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name DONE
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index DONE
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist DONE
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically DONE
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop DONE
        for (String name : scottishIslands) {
            System.out.println(name);
        }
//        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers DONE
        List<Integer> evenNumber = new ArrayList<>();
        for (int number : numbers){
//            if the number is %2 with no remainder, the value is even
            if (number % 2 ==0 ){
                evenNumber.add(number);

            }
        }
        System.out.println("The even integers are:" + evenNumber);

//        2. Print the difference between the largest and smallest value


//        3. Print true if the list contains a 1 next to a 1 somewhere DONE
//        done but not printing?

        if (numbers.contains("1")){
            System.out.println("true");
        }

//        4. Print the sum of the numbers DONE

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.
//        int Bigsum = 0;
//        for (int number : numbers) {
//            Bigsum += number;
//         if (sum == 13) {
//            break;
//        }
//        System.out.println(Bigsum);
//
//        will need to use break??
//        attempt but confused on what direction to take

    }
}

