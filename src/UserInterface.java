import java.util.Scanner;

public class UserInterface {
    Scanner scan = new Scanner(System.in);


    void intro() {
        String name;
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi " + name + " ");
    }


    void help() {
        System.out.println("""
                Type "Go north/south/east/west" to go that way
                Type "look" to look at your surroundnings
                Type "Exit" to exit the game""");
        //game.userInterface();
    }


    void doesNotExist(){
        System.out.println("There is no door in this direction");
        //game.userInterface();
    }


    void exit(){
        System.out.println("You exited the program");
        //game.gameOn = false;
    }
}
