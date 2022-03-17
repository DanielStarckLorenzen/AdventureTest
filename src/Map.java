public class Map {
    Room startRoom = new Room();

    void gameSetup(){
        Room room1 = new Room("The Field", """
                You stand in front of a decaying house, and spot two doors""");
        Room room2 = new Room("Main Entrance","""
            You entered the main entrance, there is broken glass all over the ground,
            among the shattered glass, are broken picture frames""");
        Room room3 = new Room("Dining Room","""
                You entered the dining room, there is a big old clock which is very loud,
                dining table has mold growing on it""");
        Room room4 = new Room("Back entrance", "You are standing on a rotten carpet." +
                "A bit of light enters through a broken window." +
                "A sweet smell of decay comes from the the southern door");
        Room room5 = new Room("The dungeon", "All dark. You have no sense of direction." +
                "Some heavy creature is breathing nearby. It seems to be coming your way.");
        Room room6 = new Room("The Lounge", "There are no windows in this room." +
                "The only light is a small candlelight in the southeastern corner." +
                "A door to the south is ajar.");
        Room room7 = new Room("Bedroom","The room seems to be a bedroom but it's very dark. " +
                "You can feel cobweb all over you and see a little reflection near the night stand.");
        Room room8 = new Room("Kitchen","You are in what seems to be the kitchen. " +
                "It's very smokey and hard to see. " +
                "You can faintly see a staircase but can't put a finger on the which way to get to it.");
        Room room9 = new Room("Bathroom","Room 9 seems to be the bathroom. " +
                "It's very cold since a small window is broken and banging against the outside bricks. " +
                "You see the medicine closet is slightly open.");

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

        startRoom = room1;
    }
    Room getStartRoom(){
        return startRoom;
    }
}
