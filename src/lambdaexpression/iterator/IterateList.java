package src.lambdaexpression.iterator;

import src.lambdaexpression.anonymous.Laptop;

import java.util.Arrays;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("lambda.expression.anonymous.Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Ram Size is "+ memorySize+" GB");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Monitor Size is "+ screenSize+" inches");
            }

        };




        for (String item : electronicsList) {
            if (item.equalsIgnoreCase("monitor")){

               laptop.monitorSize(14);
            }
            else if (item.equalsIgnoreCase("tablet")){
                laptop.ramSize(8);
            }
        }



        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Lambda Expression");


        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Lambda Method Reference-1");


        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Lambda Method Reference-2 using Electronics class");


        //Please implement stream iteration through electronicsList
        System.out.println("iterate using Stream for each loop");
        electronicsList.stream().forEach(item -> System.out.println(item));
    }
}
