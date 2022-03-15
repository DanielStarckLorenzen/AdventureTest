import java.util.Scanner;

public class GameTest {
    private String direction;
    private String look;
    private String name;
    Room currentRoom;


    Scanner scan = new Scanner(System.in);

    void intro() {
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi " + name + " ");
    }

    void look() {

    }

    void help() {
        System.out.println("Type \"Go north/south/east/west\" to go that way" +
                "\nType \"look\" to look at your surroundnings" +
                "\nType \"Exit\" to exit the game");
        userInterface();
    }

    void userInterface() {
        System.out.println("What do you want to do?" +
                "\nType help to get commands");
        String answer = scan.nextLine();

        switch (answer) {
            case "help" -> help();
            case "exit" -> System.out.println("You exited the program");
            case "look" -> look();
            case "north", "n", "go north" -> goNorth();
            case "south", "s", "go south" -> goSouth();
            case "east", "e", "go east" -> goEast();
            case "west", "w", "go west" -> goWest();
        }
    }


    void go() {
        gameSetup();
        intro();
        userInterface();

    }

    void goNorth(){
        if(currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            System.out.println("You go north");
            System.out.println("Entering " + currentRoom.getName());
        } else doesNotExist();
    }
    void goSouth(){
        if(currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            System.out.println("You go south");
            System.out.println("Entering " + currentRoom.getName());
        } else doesNotExist();
    }
    void goEast(){
        if(currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            System.out.println("You go east");
            System.out.println("Entering " + currentRoom.getName());
        } else doesNotExist();
    }
    void goWest(){
        if(currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            System.out.println("You go west");
            System.out.println("Entering " + currentRoom.getName());
        } else doesNotExist();
    }
    void doesNotExist(){
        System.out.println("There is no door in this direction");
        userInterface();
    }

    void gameSetup(){
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();
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

        currentRoom = room1;
    }

    public static void main(String[] args) {
        new GameTest().go();

    }
}

