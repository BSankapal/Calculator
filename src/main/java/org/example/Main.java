package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Start of Execution");

        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.println("***** Welcome to My Calculator *****");
            System.out.println("Choices of operations: ");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit from calculator");

            int choice = myObj.nextInt();

            if(choice==5)
            {
                logger.info("End of Execution");
                break;
            }
            System.out.println("Enter first operand:");
            int x = myObj.nextInt();

            System.out.println("Enter second operand:");
            int y = myObj.nextInt();

            System.out.println("The Result is ");
            switch(choice)
            {
                case 1:
                    System.out.println(add(x,y));
                    break;
                case 2:
                    System.out.println(sub(x,y));
                    break;
                case 3:
                    System.out.println(mul(x,y));
                    break;
                case 4:
                    System.out.println(div(x,y));
                    break;
            }

        }

    }
    public static int add(int x, int y)
    {
        logger.info("START OP: Add");
        int r = x+y;
        logger.info("END OP: Add");
        return r;
    }
    public static int sub(int x, int y)
    {
        logger.info("START OP: Subtract");
        int r = x-y;
        logger.info("END OP: Subtract");
        return r;
    }
    public static int mul(int x, int y) {
        logger.info("START OP: Multiply");
        int r = x*y;
        logger.info("END OP: Multiply");
        return r;
    }
    public static int div(int x, int y)
    {
        logger.info("START OP: Divide");
        if(y==0){
            logger.warn("Invalid Input, Division by zero!");
        }
        else
        {
            int r = x/y;
            logger.info("END OP: Divide");
            return r;
        }
        return 0;
    }
}