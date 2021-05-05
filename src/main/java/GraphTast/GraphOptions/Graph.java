package GraphTast.GraphOptions;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph{

    private HashMap<Integer,Integer> map;
    private ArrayList<Item> listOfGraphs;

    public void setValueOfNumbers(HashMap<Integer,Integer> map) {
        //Map of values and sums of required values
        this.map = map;
    }

    public void setGraphLinks(ArrayList<Item> listOfGraphs) {
        //Our link list
        this.listOfGraphs = listOfGraphs;
    }

    public HashMap<Integer,Integer> getValueOfNumbers() {
        return map;
    }

    public ArrayList<Item> getGraphLinks() {
        return listOfGraphs;
    }


}
