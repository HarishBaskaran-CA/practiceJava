package org.example;

public class Runner {

    public char character = 'H';
    public static final String name = "Harish";
    public int number = 12;
    public boolean flag = true;
    public double decimal = 1.23;


    public static final String SEND_MESSAGE_TEXTBOX = "//textarea";

    /* ACCESS MODIFIERS
    1. public - project level
    2. protected - package level
    3. private - class level
     */

    // return types
    // Maven
    protected void print () {
        System.out.println("Hi there i work from runner");
    }

    private void print2 (String text) {
        System.out.println(text);
    }

    public void print3 (int value) {
        System.out.println(value);
    }
}






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

        if(month=="DEC"){
           if(true){
           }
       }
 */

/*
            switch(month){
            case "JAN" :
                System.out.println("31");
                break;
            case "FEB" :
                System.out.println("28");
                break;
            default :
                System.out.println("default");
                break;
        }
 */

/*
   int i =0;
        for( ;  i<12 ;  ) {
            // some portion of code
            i++;
        }
 */

/*
         int i =0;
        while (i<12){

            i++;
        }

        int i =0;
       do{

            i++;
        } while ("password" != "stored password" && i<3);
 */















