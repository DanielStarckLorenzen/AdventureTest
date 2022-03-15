import java.util.Scanner;
/*
public class Room {
    private String direction;
    private String look;
    private String listOfThings;
    private String name;


    Room() {

        }


} */
public class Room{
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String listOfThings;

    Room(){};
    Room(String name, String listOfThings){
        this.name = name;
        this.listOfThings = listOfThings;
    };

    void setNorth(Room north){
        this.north = north;
    }
    void setSouth(Room south){
        this.south = south;
    }
    void setEast(Room east){
        this.east = east;
    }
    void setWest(Room west){
        this.west = west;
    }
    String getListOfThings(){
        return listOfThings;
    }

}


