import java.util.*;
import java.util.concurrent.*;

public class Activity1
{
    public static void main(String[]args) 
        throws InterruptedException { 
        Scanner Keyboard = new Scanner(System.in);
        while(true){
            System.out.println('\f'+"Insert your age");
            int age = Keyboard.nextInt();
            while(age < 0){
                System.out.println("Negative age is not allowed. Please insert a positive integer for age, measured in years");
                age = Keyboard.nextInt();
            }
            if((age < 2)||(age > 18)){
                System.out.println("Age outside range of the study");
            }
            else{
                System.out.println("Insert how many hours you use mobile devices per day");
                double testtime = Keyboard.nextDouble();
                while(testtime < 0){
                    System.out.println("Negative time is not allowed. Please enter a positive integer for time, measured in hours");
                    testtime = Keyboard.nextDouble();
                }
                while((testtime % 1)!= 0){
                    System.out.println("Decimal number is not allowed to measure hours. Please enter an integer for time");
                    testtime = Keyboard.nextDouble();
                }
                int time = (int)testtime;
                int fdif;
                if((age >= 2)&&(age <= 7)){
                    System.out.println("The average for this age group(2-7) is 3 hours");
                    if(time < 3){
                        fdif = 3 - time;
                        if(fdif == 1){
                            System.out.println("You are below average by "+fdif+" hour");
                        } 
                        else{
                            System.out.println("You are below average by "+fdif+" hours");
                        }
                    }
                    if(time == 3){
                        System.out.println("You are in the average");
                    }
                    if(time > 3){
                        fdif = time - 3;
                        if(fdif == 1){
                        System.out.println("You are above average by "+fdif+" hour");
                        }
                        else{
                            System.out.println("You are above average by "+fdif+" hours");
                        }
                    }
                }
                double sdif;
                if((age >= 8)&&(age <= 12)){
                    System.out.println("The average for this age group(8-12) is 4 hours and 45 minutes");
                    if(time < 4.75){
                        sdif = 4.75 - time;
                        if(sdif == 0.75){
                            System.out.println("You are below average by 45 minutes");
                        }
                        if(sdif == 1.75){
                            System.out.println("You are below average by 1 hour and 45 minutes");
                        }
                        if(sdif > 1.75){
                            System.out.println("You are below average by "+(int)sdif+" hours and 45 minutes");
                        }
                    }
                    if(time > 4.75){
                        sdif = time - 4.75;
                        if(sdif == 0.25){
                            System.out.println("You are above average by 15 minutes");
                        }
                        if(sdif == 1.25){
                            System.out.println("You are above average by 1 hour and 15 minutes");
                        }
                        if(sdif > 1.25){
                            System.out.println("You are above average by "+(int)sdif+" hours and 15 minutes");
                        }
                    }
                }
                if((age >= 13)&&(age <= 18)){
                    System.out.println("The average for this age group(13-18) is 6 hours");
                    if(time < 6){
                        fdif = 6 - time;
                        if(fdif == 1){
                            System.out.println("You are below average by 1 hour");
                        }
                        else{
                            System.out.println("You are below average by "+fdif+" hours");
                        }
                    }
                    if(time == 6){
                        System.out.println("You are in the average");
                    }
                    if(time > 6){
                        fdif = time - 6;
                        if(fdif == 1){
                            System.out.println("You are above average by 1 hour");
                        }
                        else{
                            System.out.println("You are above average by "+fdif+" hours");
                        }
                    }
                }
            }
            TimeUnit.SECONDS.sleep(1);
            System.out.println('\t'+"Enter '1' if you wish to check another age-time combination"+'\n'+'\t'+"Enter '0' to stop running the program");
            int on = Keyboard.nextInt();
            if(on == 0){
                Keyboard.close();
                System.exit(0);
            }
        }
    }    
}
