import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");
        scottishIslands.add(0, "Tiree");
        scottishIslands.add(2,"Islay");
        int island = scottishIslands.indexOf("Skye");
        System.out.println(island);
        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);
        scottishIslands.remove(5);
        System.out.println(scottishIslands.size());
        Collections.sort(scottishIslands);
        for (String islandsList : scottishIslands){
            System.out.println(islandsList);
        }


//        1. Add "Coll" to the end of the list X
//        2. Add "Tiree" to the start of the list X
//        3. Add "Islay" after "Jura" and before "Mull" X
//        4. Print out the index position of "Skye" X
//        5. Remove "Tresco" from the list by name X
//        6. Remove "Arran" from the list by index X
//        7. Print the number of islands in your arraylist X
//        8. Sort the list alphabetically X
//        9. Print out all the islands using a for loop X

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        for (int evens : numbers) {
//            if (evens %2 == 0){
//            System.out.println(evens);
//             }
//        }
        // 1. create for loops to find biggest and smallest numbers, create variables
        // 2. print 'biggest' - 'smallest' variables
        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        System.out.println(maxNumber - minNumber);



// if index = index +/- 1 AND value = 1,  print TRUE
// if number.get(i) = value && i == 1 print i value, i = value

       boolean ones  = false;
        int value = 0;
        for (int i = 0; i < numbers.size(); i++){
            if  (numbers.get(i) == value && numbers.get(i) == 1){
                ones = true;
                System.out.println(ones);

            } else{
                value = numbers.get(i);
            }

        }


        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
             total = numbers.get(i) + total;
        }
        System.out.println(total);

//        1. Print out a list of the even integers X
//        2. Print the difference between the largest and smallest value X
//        3. Print True if the list contains a 1 next to a 1 somewhere. X
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
