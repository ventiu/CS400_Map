// --== CS400 Project Three File Header ==--
// Name: Julia Oghigian
// Email: oghigian@wisc.edu
// Team: Red
// Group: BA
// TA: Cameron Ruggles
// Lecturer: Gary Dahl
// Notes to Grader:
/**
 * The interface that allows for access to StateData.java.
 */
interface StateDataInterface{
    public int getLatitude();
    public List<String> getNeighborStates();
    public String getStateCode();
    public String getStateName();
    public int getLongitude();
}
/**
 * The StateData object stores relevant information of the given state and
 * for access through its given interface.
 */
public class StateData implements StateDataInterface{

}
class StateDataPlaceholderA implements StateDataInterface{
    public String getStateCode() { return "State Code"; }
    public List<String> getNeighborStates() { return null; }
    public double getLatitude() { return 1900; }
    public String getStateName() { return "StateName"; }
    public double getLongitude() { return 1900; }
}
class StateDataPlaceholderB implements StateDataInterface{
    public String getStateCode() { return "State Code"; }
    public List<String> getNeighborStates() { return null; }
    public double getLatitude() { return 1900; }
    public String getStateName() { return "StateName"; }
    public double getLongitude() { return 1900; }
}
class StateDataPlaceholderC implements StateDataInterface{
    public String getStateCode() { return "State Code"; }
    public List<String> getNeighborStates() { return null; }
    public double getLatitude() { return 1900; }
    public String getStateName() { return "StateName"; }
    public double getLongitude() { return 1900; }
}
