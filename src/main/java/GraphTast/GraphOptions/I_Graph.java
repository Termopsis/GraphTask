package GraphTast.GraphOptions;

import java.util.ArrayList;
import java.util.HashMap;

public interface I_Graph {

    void setValueOfNumbers(HashMap<Integer, Integer> map);
    void setGraphLinks(ArrayList<Item> listOfGraphs);
    HashMap<Integer, Integer> getValueOfNumbers();
    ArrayList<Item> getGraphLinks();

}
