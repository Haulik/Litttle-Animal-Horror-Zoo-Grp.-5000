import java.util.Scanner;

public class Game{   
   public static void main(String[]args){
   
      Rabbit rabbit1 = new Rabbit("Jacky", "American", "Blue", "Male", 2);
      Snake snake1 = new Snake("Jonny", "Anaconda", "Black", "Male", 4);
   
      Scanner input = new Scanner(System.in);
      System.out.print("Welcome to Little Animal Horror Zoo Demo\nPress any number to continue\n");
      double angle = input.nextDouble();
      System.out.println("_________________________________________________");
      menuPrompt1();
   
   // der laves et punkt der representere kaninen
      Point rabbit = new Point(0,0);
   // der laves et punkt der representere slangen
      Point snake = new Point(10,10);
      snake.sound = "evil";
      rabbit.sound = "nice";
      rabbit.name = "rabbit";
      snake.name = "snake";
   
      int choice;
      do
      {
      //menuPrompt();
         choice = input.nextInt();
         switch(choice)
         {
         
            case 1:
               System.out.println("_________________________________________________");
               System.out.println("Game Started:");
               System.out.println("1: Move Rabbit (1,0)");
               System.out.println("2: Move Rabbit (0,1)");
               break;
         
            case 2:
               System.out.println("_________________________________________________");
               menuPrompt2();
               System.out.println("\n5: Back");
               break;
         
            case 3:
               System.out.println("_________________________________________________");
               menuPrompt4();
               System.out.println("\n5: Back");
               break;
         
            case 4:
               System.out.println("_________________________________________________");
            /* System.out.println(" +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+ ");
            System.out.println("[| o o |]  [| o o |]  [| o o |]  [| o o |]  [| o o |]");
            System.out.println(" |  ^  |    |  ^  |    |  ^  |    |  ^  |    |  ^  | ");
            System.out.println(" | '-' |    | '-' |    | '-' |    | '-' |    | '-' | ");
            System.out.println(" +-----+    +-----+    +-----+    +-----+    +-----+ ");
            System.out.println("Wait what?\n5: Go back!!!");
            */
               System.out.println("The Rabbit starts at (0,0)\nThe Snake starts at (10,10)\nRabbits Goal: To survive for as long as you can without getting caught by the snake\nsnakes Goal: Catch the rabbit\n\n5: back");
               break;
         
            case 5:
               System.out.println("_________________________________________________");
               menuPrompt1();
               break;
         
            case 6:
               System.out.println("_________________________________________________");
               System.out.println("Changed");
               rabbit1.setRabbit("Johanne", "Snowshoe Hare", "Red", "Female", 2);
               menuPrompt3();
               break;
         
            case 7:
               System.out.println("_________________________________________________");
               System.out.println("Changed");
               rabbit1.setRabbit("Jacky", "American", "Blue", "Male", 1);
               menuPrompt3();
               break;
         
            case 8:
               System.out.println("_________________________________________________");
               rabbit1.printRabbitInfo();
               menuPrompt3();
               break;
         
            case 9:
               System.out.println("_________________________________________________");
               System.out.println("Changed");
               snake1.setSnake("Sofie", "Cobra", "Brown", "Female", 3);
               menuPrompt5();
               break;
         
            case 10:
               System.out.println("_________________________________________________");
               System.out.println("Changed");
               snake1.setSnake("Jonny", "Anaconda", "Black", "Male", 4);
               menuPrompt5();
               break;
         
            case 11:
               System.out.println("_________________________________________________");
               snake1.printSnakeInfo();
               menuPrompt5();
               break;
         
            case 0:
               System.exit(0);
               break;
         
            case 12:
            /* System.out.println(" +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+    +\"\"\"\"\"+ ");
            System.out.println("[| o o |]  [| o o |]  [| o o |]  [| o o |]  [| o o |]");
            System.out.println(" |  ^  |    |  ^  |    |  ^  |    |  ^  |    |  ^  | ");
            System.out.println(" | '-' |    | '-' |    | '-' |    | '-' |    | '-' | ");
            System.out.println(" +-----+    +-----+    +-----+    +-----+    +-----+ ");
            System.out.println("Wait what?\n5: Go back!!!");
            */
               System.out.println("searching for players...");
               System.out.println("..\n...\nNo Player online, Try again never"); 
               System.out.println("\n5: Back");
               break;
          
            default:
               System.out.println("_________________________________________________");
               System.out.println("WTF ARE YOU DOING?!?!?\n5: GO BACK!");
         }
      }while(choice !=1);
    
     // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)   
   // http://www.mathwarehouse.com/algebra/distance_formula/index.php
   // double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));   
   
   
      do
      {
      //menuPrompt();
         choice = input.nextInt();
         switch(choice)
         {
         
            case 1:
               System.out.println("_________________________________________________");
               double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               rabbit.move(1,0);
               snake.move(0,-1);
               System.out.println("\n1: Move Rabbit (1,0)");
               System.out.println("2: Move Rabbit (0,1)");
               System.out.println("0: Give up");
               if (distb < 2){
                  System.out.println("\nThe Snake has caught the Rabbit!\nPress 0 to continue");
               
               
               
               }else if(distb < 3){
                  System.out.println("NOOOOO, Please don't eat me");}
            
               break;
         
            case 2:
               System.out.println("_________________________________________________");
               double distb2 = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               rabbit.move(0,1);
               snake.move(-1,0);
               System.out.println("\n1: Move Rabbit (1,0)");
               System.out.println("2: Move Rabbit (0,1)");
               System.out.println("0: Give up");
               if (distb2 < 2){
                  System.out.println("\nThe Snake has caught the Rabbit!\nPress 0 to continue");
               
               
               }else if(distb2 < 3){
                  System.out.println("\nNOOOOO, Please don't eat me");
               }    
               break;
         
            case 0:
               System.out.println("_________________________________________________");
               System.out.println("\nGame over!\n\n0: Close game?\n1: Restart!");
               break;
         
            default:
               System.out.println("Invalid input");
               break; 
         }
      }while(choice !=0);
    /*
   
   // hvis afstanden er mindre end 1, altså hvis det to punkter er ens, bliver der printet en besked ud.
   if (distb < 1){
   System.out.println("\nThe Snake has caught the Rabbit!\nGame over!\n\n0: Close game?\n1: Restart!"); 
   
    // hvis afstanden mellem de to er mellem 1 og 2 er de ved siden af hinanden, og printer en ny besked ud
   /if (distb >=1)
   System.out.println("NOOOOO, Please don't eat me!!!");
   } 
   */
   
      do
      {
      //menuPrompt();
         choice = input.nextInt();
         switch(choice)
         {
            case 1:
               System.out.println("_________________________________________________");
               System.out.println("Restarting...\n");
               main( new String[0]);
               break;
         
            case 2:
               System.out.println("Well you tried\n5: Back");
               break;
         
            case 4:
               System.out.println("Not done");
               break;
         
            case 3:
               System.out.println("Wait what\n5: Back");
               break;
         
            case 0:
               System.out.println("Thanks for playing");
               System.exit(0);
               break;
         
            case 5:
               menuPrompt();
               break;
         
            default:
               System.out.println("WTF ARE YOU DOING?!?!?\n5: GO BACK!");
         }
        
      }while(choice !=0);     //while (!console input.hasNext("")){system.out.println(); input.next();
    
   }

    
   private static void menuPrompt()
   {
      //System.out.println("\n1: Rabbit");
      //System.out.println("2: Snake");
      //System.out.println("3: Learn the mening of life");
      System.out.println("1: Start over");
      //System.out.println("5: Menu");
      System.out.println("0: Close Game");
      
   }
      
      
      //Her er alle vores Menuer
   private static void menuPrompt1()
   {
      System.out.println("\n1: Start game");
      System.out.println("2: Rabbit");
      System.out.println("3: Snake");
      System.out.println("4: Rules");
      System.out.println("0: Close game");
      //System.out.println("6: Change Rabbit");
      //System.out.println("4: Start over");
      //System.out.println("5: Menu");
   }

   private static void menuPrompt2()
   {
      System.out.println("Change Rabbit");
      System.out.println("6: Female");
      System.out.println("7: Male"); 
      System.out.println("8: View Rabbit");
   }
      
   private static void menuPrompt3()
   {
      System.out.println("6: Female");
      System.out.println("7: Male"); 
      System.out.println("8: View Rabbit");
      System.out.println("\n5: Back");
   }
      
   private static void menuPrompt4()
   {
      System.out.println("Change Snake");
      System.out.println("9: Female");
      System.out.println("10: Male"); 
      System.out.println("11: View Snake");
   }
      
   private static void menuPrompt5()
   {
      System.out.println("9: Female");
      System.out.println("10: Male"); 
      System.out.println("11: View Snake");
      System.out.println("\n5: Back");
   }
    
    
         
       
   


}
