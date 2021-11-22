// --== CS400 Project Three File Header ==--
// Name: Tianyou Wen
// Email: twen22@wisc.edu
// Team: Red
// Group: BA
// TA: Cameron Ruggles
// Lecturer: Gary Dahl
// Notes to Grader:
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

/**
 * The interface that allows for access to SearchBackEnd.java.
 */
interface SearchBackEndInterface {
    // add states 
    public void addStates(StateDataInterface state);

    // add distance as the weight of every edge
    public void addDistance(StateDataInterface state);

    // return True if the shotest path is found
    public List<String> findShortestPath(StateDataInterface state);

    // return how many states are passed in the path
    public int countStates(StateDataInterface state);
}

/**
 * The SearchBackEnd object use the given states and weight to find the 
 * shortes path between two states and count how many states are passed 
 * in the path.
 */
public class SearchBackEnd implements SearchBackEndInterface {

    public void SearchBackEnd() throws FileNotFoundException {}

    public void addStates(StateDataInterface state) {

    }

    public void addDistance(StateDataInterface state) {

    }

    public List<String> findShortestPath(StateDataInterface state) {
        List<String> ShortestPath = new LinkedList<>();
        return ShortestPath;
    }

    public int countStates(StateDataInterface state){
        return 0;
    }

}

// placeholder(s) (implemented with proposal, and possibly added to later)

class SearchBackEndPlaceholder implements SearchBackEndInterface {
    private StateDataInterface onlyState;
    private StateDataInterface onlyWeight;
    private int count = 0;

    public void addStates(StateDataInterface state) {
        this.onlyState = state;
    }

    public void addDistance(StateDataInterface state) {
        this.onlyWeight = state;
    }

    public List<String> findShortestPath(StateDataInterface state) {
        List<String> ShortestPath = new LinkedList<>();
        return ShortestPath;
    }

    public int countStates(StateDataInterface state){
        return count;
    }
}