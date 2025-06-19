package playersguide.day39;

public class Amarok extends Monster{
public static int shotAmarokRow;
public static int shotAmarokColumn;

    public static int getShotAmarokRow() {
        return shotAmarokRow;
    }

    public static int getShotAmarokColumn() {
        return shotAmarokColumn;
    }

    @Override
    public boolean isMonsterAtRoom(int shotRoomRow, int shotRoomColumn, String[][] rooms){
        if(rooms[shotRoomRow][shotRoomColumn].equals("amarok")){
            shotAmarokRow = shotRoomRow;
            shotAmarokColumn = shotRoomColumn;
            return true;
        }
        return false ;
    }
}
