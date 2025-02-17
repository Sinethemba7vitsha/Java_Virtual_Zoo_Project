import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // for getting input
       Scanner keyboard = new Scanner(System.in);

       // for loop continuation - 1 represents true
       int continueOuterLoop = 1  ;
       int continueInnerLoop = 1;

       // for menu choice
       int menuChoice = 1;

       Tiger tiger = new Tiger();
       Dolphin dolphin = new Dolphin();
       Penguin penguin = new Penguin();
       do {
           switch (animalChoiceMenu(keyboard)) {
               case 1:
                   do {
                       System.out.println("The animal which is chosen is : "+tiger.getNameOfAnimal());
                       // get menu choice
                       switch (menuChoice=animalDetailsManipulationMenu(keyboard, tiger)) {
                           case 1:
                               System.out.println("Enter speed: ");
                               tiger.setSpeed(keyboard.nextInt());
                               System.out.println("Enter number of stripes: ");
                               tiger.setNumberOfStripes(keyboard.nextInt());
                               System.out.println("Enter sound level of roar: ");
                               tiger.setSoundLevelOfRoar(keyboard.nextInt());
                               break;

                           case 2:
                               System.out.println("Age: "+tiger.getAge());
                               System.out.println("Height: "+tiger.getHeight());
                               System.out.println("Weight: "+tiger.getWeight());
                               System.out.println("Speed: "+tiger.getSpeed());
                               System.out.println("Number of stripes: "+tiger.getNumberOfStripes());
                               System.out.println("Sound level of roar: "+tiger.getSoundLevelOfRoar());
                               break;
                           case 3:
                               tiger.walking();
                               break;
                           case 4:
                               tiger.eatingCompleted();
                               break;
                           default:
                               System.out.println("Not supported");

                       }
                       System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                       continueInnerLoop = keyboard.nextInt();
                   } while(continueInnerLoop == 1);

                   break;
               case 2:
                   do {
                       System.out.println("The animal which is chosen is : "+dolphin.getNameOfAnimal());
                       // get menu choice
                       switch (menuChoice = animalDetailsManipulationMenu(keyboard, dolphin)) {
                           case 1:
                               System.out.println("Enter color: ");
                               dolphin.setColor(keyboard.next());
                               System.out.println("Enter swimming speed: ");
                               dolphin.setSwimmingSpeed(keyboard.nextDouble());
                               break;

                           case 2:
                               System.out.println("Age: "+dolphin.getAge());
                               System.out.println("Height: "+dolphin.getHeight());
                               System.out.println("Weight: "+dolphin.getWeight());
                               System.out.println("Color: "+dolphin.getColor());
                               System.out.println("Swimming Speed: "+dolphin.getSwimmingSpeed());
                               break;
                           case 3:
                               dolphin.swimming();
                               break;
                           case 4:
                               dolphin.eatingFood();
                               break;
                           default:
                               System.out.println("Not supported");

                       }
                       System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                       continueInnerLoop = keyboard.nextInt();
                   } while(continueInnerLoop == 1);
                   break;

               case 3:
                   do {
                       System.out.println("The animal which is chosen is : "+penguin.getNameOfAnimal());
                       // get menu choice
                       switch (menuChoice = animalDetailsManipulationMenu(keyboard, penguin)) {
                           case 1:
                               System.out.println("Is the Penguin Swimming (True/False): ");
                               penguin.setSwimming(keyboard.nextBoolean());
                               System.out.println("Enter the walk speed of penguin: ");
                               penguin.setWalkSpeed(keyboard.nextInt());
                               System.out.println("Enter the swim speed of penguin: ");
                               penguin.setSwimSpeed(keyboard.nextInt());
                               break;

                           case 2:
                               System.out.println("Age: "+penguin.getAge());
                               System.out.println("Height: "+penguin.getHeight());
                               System.out.println("Weight: "+penguin.getWeight());
                               System.out.println("Walking Speed: "+penguin.getWalkSpeed());
                               System.out.println("Swimming Speed: "+penguin.getSwimSpeed());
                               break;
                           case 3:
                               if(penguin.isSwimming()){
                                   penguin.swimming();
                               } else{
                                   penguin.walking();
                               }
                               break;
                           case 4:
                               penguin.eatingFood();
                               break;
                           default:
                               System.out.println("Not supported");

                       }
                       System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                       continueInnerLoop = keyboard.nextInt();
                   } while(continueInnerLoop == 1);
                   break;

               default:
                   System.out.println("Sorry no such animal available.");
           }

           System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
           continueOuterLoop = keyboard.nextInt();

       } while(continueOuterLoop == 1);
      

   }

   private static int animalChoiceMenu(Scanner keyboard) {
       int choiceGivenByUser;

       System.out.println("******* ZOO ANIMAL choice menu ******");
       System.out.println("1. Tiger");
       System.out.println("2. Dolphin");
       System.out.println("3. Penguin");


       System.out.println("Enter choice of animal (1-3):");
       choiceGivenByUser = keyboard.nextInt();
       return choiceGivenByUser;
   }

   private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
       int choiceGivenByUser;

       System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
       System.out.println("1. Set properties");
       System.out.println("2. Display properties");
       System.out.println("3. Display movement");
       System.out.println("4. Display eating");

       System.out.println("Enter choice (1-4):");
       choiceGivenByUser = keyboard.nextInt();
       return choiceGivenByUser;

   }
}