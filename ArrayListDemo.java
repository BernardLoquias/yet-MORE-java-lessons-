package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Class {

}
public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        System.out.println(list);
        System.out.println(list.size());


       //  ArrayList<Integer> list2 = new ArrayList<Double>();

      ///  ArrayList<> list3  = new ArrayList<Integer>(); 


      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println(list);
      System.out.println(list.size());


      list.add(1, 5);
      System.out.println(list);


      System.out.println(list.get(1));


      list.remove(1);
      System.out.println(list);

     list.add(1, 5);
     list.add(2, 5);

     list.remove(Integer.valueOf(5));
     System.out.println(list);



     System.out.println("Contains 5: " + list.contains(5));



     Collections.sort(list);
     Integer value =  Collections.binarySearch(list, 4);
     System.out.println(value);
     System.out.println(list);


    Integer[] arr = list.toArray(new Integer[2]);
    for (int val : arr) {
        System.out.print(val + " ");
    }
    System.out.println();


    ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()-1));
    System.out.println(splitList);
    
    list.clear();
    System.out.println(list);





    System.out.println(list.size());


    // Create an arrayList with 10 random numbers
    // Remove all odd from that list


    // Make a guest list that allows the user to enter names
    // if the name exists tell the user that "this person is invited!"
    // continue until you type exit


    // Create a list of grocery items
    // if the user types in a food print out the index
    // If not print "Not Found" and add it to the list
    // continue until you type exit
    }
    
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
      

  // Challenge 1
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            nums.add(r.nextInt(100));
        }

        System.out.println("Random numbers: " + nums);

        nums.removeIf(n -> n % 2 != 0); // remove odd numbers

        System.out.println("Only evens left: " + nums);


              
// Challenge 2
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Alex");
        guests.add("Sam");
        guests.add("Jordan");

        while(true){
            System.out.print("Enter a name for guest list (or exit): ");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase("exit")){
                break;
            }

            if(guests.contains(name)){
                System.out.println("this person is invited!");
            }else{
                System.out.println("not invited");
            }
        }


       
// Challenge 3
        ArrayList<String> food = new ArrayList<>();
        food.add("milk");
        food.add("bread");
        food.add("eggs");

        while(true){
            System.out.print("Enter food (or exit): ");
            String item = sc.nextLine();

            if(item.equalsIgnoreCase("exit")){
                break;
            }

            int index = food.indexOf(item);

            if(index != -1){
                System.out.println("Found at index: " + index);
            }else{
                System.out.println("Not Found, adding it");
                food.add(item);
            }
        }

        System.out.println("Final grocery list: " + food);
        
    }
}

