/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.views;


import citbyui.cit260.connect4.models.Connect4Error;
import citbyui.cit260.connect4.control.MainMenuControl;
import citbyui.cit260.connect4.exceptions.MenuException;
import java.util.Scanner;
/**
 *
 * @author 
 */


public class MainMenuView {
    
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"Q", "Quit Game"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {

    }
    public void displayWelcome() {
    System.out.println("\nWelcome to Connect 4!\n");
    }
    
    public void getInput ()  {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.mainMenuControl.startGameOne();
                    break;
                case "2":
                    this.mainMenuControl.startGameTwo();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();                      
                    break;
                case "Q":
                    break;
                default: 
                   new Connect4Error().displayError("Invalid command. Please enter either 1, 2, S, H, or Q.");
                   continue;                    
            }
        } while (!command.equals("Q"));

   
       // return;
    }   
    
   public final void display() {
        System.out.println("\n\t============================== Main Menu =================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
     private void checkInput(String command) throws MenuException {
        try {
            int selection = Integer.parseInt(command);
                    
        } catch (NumberFormatException e) {
            throw new MenuException("Invalid entry. Please try again.");
    }
      
}
}
