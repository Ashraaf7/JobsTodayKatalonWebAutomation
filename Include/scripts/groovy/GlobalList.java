
import java.util.ArrayList;
import java.util.List;


public class GlobalList {
    // Static list to be shared across all instances of the class
    private static List<String> myList = new ArrayList<>();

    // Method to add values to the list
    public static void addToMyList(String value) {
    	  if (!myList.contains(value)) {
              myList.add(value);
          }
    }
    
    public static void removeFromMyList(String value) {
  	  if (myList.contains(value)) {
  		  	myList.remove(value);
        }
  }

    // Getter to retrieve the list
    public static List<String> getMyList() {
        return myList;
    }
}