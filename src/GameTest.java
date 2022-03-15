public class GameTest {


    void go(){

        Room currentRoom = new Room();
        currentRoom.setListOfThings("A Table, a chair and a broken lamp");
        System.out.println(currentRoom.getListOfThings());


    }

    public static void main(String[] args) {
        new GameTest().go();
    }
}
