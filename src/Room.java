import java.util.Scanner;

public class Room {
    private String direction;
    private String look;
    private String listOfThings;
    private String name;

    Scanner scan = new Scanner(System.in);

    Room() {

        }

    public void setListOfThings(String listOfThings){
    this.listOfThings = listOfThings;

    }
    public String getListOfThings(){
        return listOfThings;
    }
}


