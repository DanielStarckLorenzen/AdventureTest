import java.util.Scanner;

public class UserInterface {
    Scanner scan = new Scanner(System.in);
    public String answer;



    void intro() {
        String name;
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi " + name + " ");
    }


    void help() {
        System.out.println("""
                Type "Go north/south/east/west" to go that way
                Type "look" to look at your surroundings
                Type "Exit" to exit the game""");

    }
    void playerChoice() {
        System.out.println("""

                What do you want to do?
                Type help to get commands""");
        answer = scan.nextLine().toLowerCase();
    }

    void doesNotExist(){
        System.out.println("There is no door in this direction");

    }
    void exit(){
        System.out.println("You exited the program");
    }
}
