package ru.summer.practice.lukoyanov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Operator;
        int[] First = {1, 1};
        int[] Second = {1, 1};

        try {
            String[] buf1 = (in.next().split("/"));
            Operator = in.next();
            String[] buf2 = (in.next().split("/"));

            for(int i = 0; i < buf1.length; i++)
                First[i] = Integer.parseInt(buf1[i]);
            for(int i = 0; i < buf2.length; i++)
                Second[i] = Integer.parseInt(buf2[i]);
        } catch (NumberFormatException e)
        {
            System.out.println("Не удалось перевести в число.");
            return;
        }

        switch(Operator)
        {
            case "+": {
                System.out.print(First[0] * Second[1] + Second[0] * First[1]);
                System.out.print("/");
                System.out.print(First[1] * Second[1]);
                break;
            }
            case "-": {
                System.out.print(First[0] * Second[1] - Second[0] * First[1]);
                System.out.print("/");
                System.out.print(First[1] * Second[1]);
                break;
            }
            case "*": {
                System.out.print(First[0] * Second[0]);
                System.out.print("/");
                System.out.print(First[1] * Second[1]);
                break;
            }
            case "/": {
                if(Second[0] == 0)
                {
                    System.out.println("Division By Zero!");
                    return;
                }
                System.out.print(First[0] * Second[1]);
                System.out.print("/");
                System.out.print(First[1] * Second[0]);
                break;
            }
        }
    }
}