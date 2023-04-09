package org.example;


public class Main {

    // class & objects
    // variable
        /*
            1. char
            2. string
            3. int
            4. float
            5. boolean
            6. array
         */
    // methods
    // Loops
        /*
            1. if else
                a. else if
                b. nested if
            2. switch // less priority
            3. for loop
         */
    // Access modifiers
    // Keywords
        /*
            1. static
            2. final
         */



    public static void main(String[] args) {
        Runner runner_1 = new Runner();
        Runner runner_2 = new Runner();

//        runner_1.name = "sumathi";
//        runner_2.name = "yamini";



        String value_1 = runner_1.name;
        String value_2 = runner_2.name;

        System.out.println( value_1 +"---" + value_2);
    }
}


/*

 // Rock paper scissors ?

        String user1 = "rock";
        String user2 = "rock";

        if (user1.toLowerCase() == user2.toLowerCase()) {
            System.out.println("retake");
        } else if (user1.toLowerCase() == "rock") {
            if (user2.toLowerCase() == "paper") {
                System.out.println("user2 wins");
            } else if (user2.toLowerCase() == "scissors") {
                System.out.println("user1 wins");
            }
        } else if (user1.toLowerCase() == "paper") {
            if (user2.toLowerCase() == "rock") {
                System.out.println("user1 wins");
            } else if (user2.toLowerCase() == "scissors") {
                System.out.println("user2 wins");
            }
        } else if (user1.toLowerCase() == "scissors") {
            if (user2.toLowerCase() == "rock") {
                System.out.println("user2 wins");
            } else if (user2.toLowerCase() == "paper") {
                System.out.println("user1 wins");
            }
        }

    }

 */



/*
        if(number <10 ) {
            System.out.println("if condition");
        }else if(10 < number && number <15){
            System.out.println("else if condition");
        }else if(10 < number && number <15){
            System.out.println("else if condition");
        }else if(10 < number && number <15){
            System.out.println("else if condition");
        }else if(10 < number && number <15){
            System.out.println("else if condition");
        } else {
            System.out.println("else condition");
        }
 */

// className objectName = new className();
//        Runner object = new Runner();
//        object.print();
//        System.out.println(object.character);
//        System.out.println(object.name);
//        System.out.println(object.number);
//        System.out.println(object.flag);
//        System.out.println(object.decimal);