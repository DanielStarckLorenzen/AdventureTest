import java.util.Scanner;

public class GameTest {
    private String direction;
    private String look;
    private String name;
    Room currentRoom;


    Scanner scan = new Scanner(System.in);

    void userInterface() {
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi " + name + ", You have to pick a path to a new room, which path do you choose?\n" +
                "North, East, South or West?");

        direction = scan.nextLine().toLowerCase().replace(" ","");

        System.out.println("Going " + direction);

        System.out.println("You can also use the command 'look' to look around");
        look = scan.nextLine();

        if (look.equals("look")) {
            System.out.println("Looking around");
            System.out.println();
        }
    }

    void go() {
        //userInterface();
        gameSetup();

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

