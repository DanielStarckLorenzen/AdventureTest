import java.util.Scanner;

public class GameTest {
    private String direction;
    private String look;
    private String name;
    Room currentRoom;


    Scanner scan = new Scanner(System.in);

    void introduction() {
        System.out.print("What is your name? ");
        name = scan.nextLine();
    }
    void whichDirection() {
        System.out.println("Hi " + name + ", You have to pick a path to a new room, which path do you choose?\n" +
                "North, East, South or West?");
        direction = scan.nextLine();
        System.out.println("Going " + direction);
    }

    void userInterface() {
        System.out.println("You can use the command 'look' to look around");
        look = scan.nextLine();

        switch (direction) {
            case "north", "n", "go north" -> goNorth();
            case "south", "s", "go south" -> goSouth();
            case "east", "e", "go east" -> goEast();
            case "west", "w", "go west" -> goWest();
        }
    }

    void go() {
        introduction();
        whichDirection();
        gameSetup();
        userInterface();
    }

    void goNorth(){
        currentRoom = currentRoom.getNorth();
    }
    void goSouth(){
        currentRoom = currentRoom.getSouth();
    }
    void goEast(){
        currentRoom = currentRoom.getEast();
    }
    void goWest(){
        currentRoom = currentRoom.getWest();
    }
    void doesNotExist(){
        System.out.println("There is no door in this direction");
    }

    void gameSetup(){
        Room room1 = new Room("room1","A small room, with a broken lamp and one chair... interesting");
        Room room2 = new Room("room2","In this room a big living room with a couch");
        Room room3 = new Room("room3","");
        Room room4 = new Room("room4","");
        Room room5 = new Room("room5","");
        Room room6 = new Room("room6","");
        Room room7 = new Room("room7","");
        Room room8 = new Room("room8","");
        Room room9 = new Room("room9","");
        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setWest(room2);
        room3.setSouth(room6);
        room6.setSouth(room9);
        room6.setNorth(room3);
        room9.setNorth(room6);
        room9.setWest(room8);
        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);
        room7.setEast(room8);
        room7.setNorth(room4);
        room4.setSouth(room7);
        room4.setNorth(room1);
    }


    public static void main(String[] args) {
        new GameTest().go();

    }
}

