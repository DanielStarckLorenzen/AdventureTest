import java.util.Scanner;

public class Room {
    private String direction;
    private String look;
    private String listOfThings;
    private String name;

    Scanner scan = new Scanner(System.in);

    Room() {
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hi "+name+", You have to pick a path to a new room, which path do you choose?\n" +
                "North, East, South or West?" );
        direction = scan.nextLine();

        System.out.println("Going "+ direction );

        System.out.println("You can also use the command 'look' to look around");
        look = scan.nextLine();


        if(look.equals("look")){
            System.out.println("Looking around");
            System.out.println();
        }

    }
    public void setListOfThings(String listOfThings){
    this.listOfThings = listOfThings;

    }
    public String getListOfThings(){
        return listOfThings;
    }

}


