package GraphTast.GraphOptions;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph implements I_Graph {

    public HashMap<Integer,Integer> map;
    public ArrayList<Item> listOfGraphs;

    @Override
    public void setValueOfNumbers(HashMap<Integer,Integer> map) {
        //Карта соответсвий значений и сумм требуемых значений
        this.map = map;
    }

    @Override
    public void setGraphLinks(ArrayList<Item> listOfGraphs) {
        //Наш список связей
        this.listOfGraphs = listOfGraphs;
    }

    @Override
    public HashMap<Integer,Integer> getValueOfNumbers() {
        return map;
    }

    @Override
    public ArrayList<Item> getGraphLinks() {
        return listOfGraphs;
    }


}
