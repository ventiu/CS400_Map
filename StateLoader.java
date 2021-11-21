// --== CS400 Project Three File Header ==--
// Name: Julia Oghigian
// Email: oghigian@wisc.edu
// Team: Red
// Group: BA
// TA: Cameron Ruggles
// Lecturer: Gary Dahl
// Notes to Grader:
/**
 * This interface is to help implement the converting of the two CSV file for StateLoader.
 */
interface StateLoaderInterface {
    public List<StateDataInterface> loadFile(String csvFilePath) throws FileNotFoundException;
    public List<StateDataInterface> loadAllFilesInDirectory(String directoryPath) throws FileNotFoundException;
}
/**
 * This class is responsible for reading and parsing information from two CSV files into a linked
 * list that can be loaded into a minimum spanning tree by iterating through the returned list.
 */
public class StateLoader implements StateLoaderInterface {
}
class StateLoaderPlaceholder implements StateLoaderInterface {
    public List<StateDataInterface> loadFile(String csvFilePath) throws FileNotFoundException{
        List<StateDataInterface> list = new LinkedList<>();
        list.add(new StateDataPlaceholderA());
        list.add(new StateDataPlaceholderB());
        return list;
    }
    public List<StateDataInterface> loadAllFilesInDirectory(String directoryPath) throws FileNotFoundException{
        List<StateDataInterface> list = new LinkedList<>();
        list.add(new StateDataPlaceholderA());
        list.add(new StateDataPlaceholderB());
        list.add(new StateDataPlaceholderC());
        return list;
    }
}
