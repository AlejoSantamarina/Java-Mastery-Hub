import java.util.ArrayList;

public class MyList {
    private ArrayList<String> myList;

    public MyList(ArrayList<String> myList) {
        this.myList = myList;
    }

    public ArrayList<String> filter(char letter) {
        ArrayList<String> copyList = new ArrayList<>();
        for(String s : myList) {
            if(letter == s.charAt(0)) {
                copyList.add(s);
            }
        }
        return copyList;
    }
}
