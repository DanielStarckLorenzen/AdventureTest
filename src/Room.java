
public class Room{
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String listOfThings;

    //Room(){};
    Room(String listOfThings, String name){
        this.listOfThings = listOfThings;
        this.name = name;
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
    Room getNorth(){
        return north;
    }
    Room getSouth(){
        return south;
    }
    Room getEast(){
        return east;
    }
    Room getWest() {
        return east;
    }
}


