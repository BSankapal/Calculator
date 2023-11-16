package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Working of Calculator Started.....");

        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.println("Choose the operation to be done:");

            System.out.println("Add - Press 1");
            System.out.println("Minus - Press 2");
            System.out.println("Multiply - Press 3");
            System.out.println("Divide - Press 4");
            System.out.println("Stop - Press 5");

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
    public static int add(int num1, int num2)
    {
        logger.info("Addition Operation Started");
        int res = num1+num2;
        logger.info("Addition Operation Ended");
        return res;
    }
    public static int sub(int num1, int num2)
    {
        logger.info("Subtract Operation Started");
        int res = num1-num2;
        logger.info("Subtract Operation Ended");
        return res;
    }
    public static int mul(int num1, int num2) {
        logger.info("Multiply Operation Started");
        int res = num1*num2;
        logger.info("Multiply Operation Ended");
        return res;
    }
    public static int div(int num1, int num2)
    {
        logger.info("Divide Operation Started");
        if(num2==0){
            logger.warn("Division by Zero!!");
        }
        else
        {
            int res = num1/num2;
            logger.info("Divide Operation Ended");
            return res;
        }
        return 0;
    }
}
