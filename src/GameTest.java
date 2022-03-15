import java.util.Scanner;

public class GameTest {
    private String direction;
    private String look;
    private String name;


    Scanner scan = new Scanner(System.in);

    void userInterface() {
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi " + name + ", You have to pick a path to a new room, which path do you choose?\n" +
                "North, East, South or West?");

        direction = scan.nextLine();

        System.out.println("Going " + direction);

        System.out.println("You can also use the command 'look' to look around");
        look = scan.nextLine();

        if (look.equals("look")) {
            System.out.println("Looking around");
            System.out.println();
        }
    }

    void go() {
        userInterface();
      /*  Room currentRoom = new Room("A Table, a chair and a broken lamp");
        Room room1 = new Room("");
        Room room2 = new Room("");
        Room room3 = new Room("");
        Room room4 = new Room("");
        Room room5 = new Room("");

       */

    }

    public static void main(String[] args) {
        new GameTest().go();

    }
}

