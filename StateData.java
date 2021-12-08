import java.util.Arrays;
import java.util.List;
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
    public double getLatitude();
    public List<String> getNeighborStates();
    public String getStateCode();
    public String getStateName();
    public double getLongitude();
}
/**
 * The StateData object stores relevant information of the given state and
 * for access through its given interface.
 *
 *  @author Julia Oghigian
 */
public class StateData implements StateDataInterface{
private String state;
	private double latitude;
	private double longitude;
	private String fullName;
	private String neighborStateCode;

	/**
	 * This creates the constructor for the state
	 * 
	 * @param state             - the state code
	 * @param latitude          - the latitude of the state
	 * @param longitude         - the longitude of the state
	 * @param fullName          - states full name
	 * @param neighborStateCode - a string of the states nearby the state
	 */
	public StateData(String state, double latitude, double longitude, String fullName, String neighborStateCode) {
		this.state = state;
		this.fullName = fullName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.neighborStateCode = neighborStateCode;

	}

	/**
	 * @return - the latitude of the state
	 */
	@Override
	public double getLatitude() {

		return latitude;
	}

	/**
	 * @return - list of neighbor states of the state
	 */
	@Override
	public List<String> getNeighborStates() {
		String[] split = neighborStateCode.split(" ");

		return Arrays.asList(split);
	}

	/**
	 * @return - the state code of the state
	 */
	@Override
	public String getStateCode() {

		return state;
	}

	/**
	 * @return - the full state name of the state
	 */
	@Override
	public String getStateName() {

		return fullName;
	}

	/**
	 * @return - the longitude of the state
	 */
	@Override
	public double getLongitude() {

		return longitude;
	}
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
