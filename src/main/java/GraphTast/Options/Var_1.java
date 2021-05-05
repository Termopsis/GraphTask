package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Var_1 extends A_Var{

    public Var_1() {
        array = new int[]{1, 3, 4, 7};
        fillConformityMap();
        fillListOfGraphs();
    }

    private void fillConformityMap(){
        map = new HashMap<>();
        map.put(1, 3);
        map.put(3, 12);
        map.put(4, 10);
        map.put(7, 7);

    }

    private void fillListOfGraphs(){
        listOfGraphs = new ArrayList<>();
        addEmptyElements(listOfGraphs, array.length);

        Item item0 = listOfGraphs.get(0);
        //item0.setIndex(1);
        item0.AddItem(listOfGraphs.get(1));

        Item item1 = listOfGraphs.get(1);
        //item1.setIndex(3);
        item1.AddItem(listOfGraphs.get(0));
        item1.AddItem(listOfGraphs.get(2));
        item1.AddItem(listOfGraphs.get(3));

        Item item2 = listOfGraphs.get(2);
        //item1.setIndex(4);
        item2.AddItem(listOfGraphs.get(1));
        item2.AddItem(listOfGraphs.get(3));

        Item item3 = listOfGraphs.get(3);
        //item1.setIndex(7);
        item3.AddItem(listOfGraphs.get(1));
        item3.AddItem(listOfGraphs.get(2));

    }

}
