import java.util.Scanner;

public class GameTest {
    Room currentRoom;
    boolean gameOn = true;
    Map map = new Map();
    UserInterface ui = new UserInterface();
    Scanner scan = new Scanner(System.in);

    void go() {
        map.gameSetup();
        currentRoom = map.getStartRoom();
        ui.intro();
        while(gameOn) {
            userInterface();
        }
    }
    void userInterface() {
        System.out.println("""

                What do you want to do?
                Type help to get commands""");
        String answer = scan.nextLine().toLowerCase();

        switch (answer) {
            case "help" -> ui.help();
            case "exit" -> {
                ui.exit();
                gameOn = false;
            }
            case "look" -> look();
            case "north", "n", "go north" -> goNorth();
            case "south", "s", "go south" -> goSouth();
            case "east", "e", "go east" -> goEast();
            case "west", "w", "go west" -> goWest();
        }
    }
    void look() {
        System.out.println(currentRoom.getListOfThings());
    }

    void goNorth(){
        if(currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            System.out.println("You go north");
            System.out.println("Entering " + currentRoom.getName());
            look();
        } else ui.doesNotExist();
    }
    void goSouth(){
        if(currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            System.out.println("You go south");
            System.out.println("Entering " + currentRoom.getName());
            look();
        } else ui.doesNotExist();
    }
    void goEast(){
        if(currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            System.out.println("You go east");
            System.out.println("Entering " + currentRoom.getName());
            look();
        } else ui.doesNotExist();
    }
    void goWest(){
        if(currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            System.out.println("You go west");
            System.out.println("Entering " + currentRoom.getName());
            look();
        } else ui.doesNotExist();
    }
}

