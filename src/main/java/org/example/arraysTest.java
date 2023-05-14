package org.example;

import java.util.*;

public class arraysTest {

    public static void main(String[] args) {

        // annotation order
        // test execution order

        // invocation count / priority / dependsOnMethod
        // xml file
            // groups
            // suite - methods

        // data providers - excel sheet
        // listeners
        // parameters


        // Hash problem
       // { Key : value }


        // arrays | strings

        // identify pattern in a string
            // duplicate
            // highest / lowest
            // longest
            // shortest

        // sorting
        // search
            // replace


        try {
            // code that needs to be run
        }catch (NoSuchElementException e ){
            // error catch
        }finally {
            // code must be executed
        }

        // final vs finally

        // lines -- still get executed


      //  Page object Model - POM
      // package -
            // class -
                /*
                    variables
                    methods
                 */
            // class 2
        // package 2

    }

    public void sorting01(){

        // input = [0,1,1,1,0,0,1,0]
        // output = [0,0,0,0,1,1,1,1]

        // Brute force algorithm
        // 2 for loop - temp object - compare - switch
        // 2 pointer algorithm

        int a[] = {0,1,1,1,0,0,1,0};

//        for (int i = 0, j= a.length-1; i > j || i==j ; i++, j--)
//             temp object switch
//        }

        int zero_count = 0;
        int one_count = 0 ;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0) zero_count++;
            else one_count++;
        }

        System.out.println(zero_count + "--" +  one_count);
    }

    public void remove_duplicates() {
        // testInput = "iafsinaafru"
        // answer = "iafsnru"

        String testInput = "iafsinaafru";

        Set<Character> characters = new LinkedHashSet<>();

        for (int i = 0; i < testInput.length(); i++) {
            characters.add(testInput.charAt(i));
        }

        System.out.println(characters);
    }

    public void teaching_arrays(){
        String name = "Harish";

        int[] a1 = new int[5]; // default values = 0
        int[] a = {33,2,1,4,5}; //

        a[2] = 10;

        for (int i = 0; i < a.length; i++) {
//            System.out.println(i +"---" + a[i]);
        }

        List<String> arraylist = new ArrayList<>();

        arraylist.add("carrot");
        System.out.println(arraylist.size());

        arraylist.add("radish");
        System.out.println(arraylist.size());

        arraylist.remove(0);
        System.out.println(arraylist.size());

        arraylist.add("carrot");
        System.out.println(arraylist.get(0));

        arraylist.add(1,"beetroot");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(i +"---" + arraylist.get(i));
        }


        Set<String> arraySet = new HashSet<>();

        arraySet.add("carrot");
        System.out.println(arraylist.size());

        arraySet.add("radish");
        System.out.println(arraylist.size());

        arraySet.remove(0);
        System.out.println(arraylist.size());

        arraySet.add("carrot");
        System.out.println(arraylist.get(0));

        arraySet.add("carrot");

        //for each loop
        for (String vegetable : arraySet) {
            System.out.println(vegetable);
        }

    }

}
