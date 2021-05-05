package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Var_2 extends A_Var{

    public Var_2() {
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        fillConformityMap();
        fillListOfGraphs();
    }

    private void fillConformityMap(){
        map = new HashMap<>();
        map.put(0, 13);
        map.put(1, 20);
        map.put(2, 25);
        map.put(3, 18);
        map.put(4, 14);
        map.put(5, 24);
        map.put(6, 14);
        map.put(7, 15);
        map.put(8, 11);
        map.put(9, 11);
    }

    private void fillListOfGraphs(){
        listOfGraphs = new ArrayList<>();
        addEmptyElements(listOfGraphs, array.length);

        Item item0 = listOfGraphs.get(0);
        item0.AddItem(listOfGraphs.get(1));
        item0.AddItem(listOfGraphs.get(3));
        item0.AddItem(listOfGraphs.get(4));
        item0.AddItem(listOfGraphs.get(7));

        Item item1 = listOfGraphs.get(1);
        item1.AddItem(listOfGraphs.get(0));
        item1.AddItem(listOfGraphs.get(2));
        item1.AddItem(listOfGraphs.get(5));

        Item item2 = listOfGraphs.get(2);
        item2.AddItem(listOfGraphs.get(1));
        item2.AddItem(listOfGraphs.get(9));

        Item item3 = listOfGraphs.get(3);
        item3.AddItem(listOfGraphs.get(0));
        item3.AddItem(listOfGraphs.get(4));
        item3.AddItem(listOfGraphs.get(5));

        Item item4 = listOfGraphs.get(4);
        item4.AddItem(listOfGraphs.get(0));
        item4.AddItem(listOfGraphs.get(3));
        item4.AddItem(listOfGraphs.get(5));
        item4.AddItem(listOfGraphs.get(9));

        Item item5 = listOfGraphs.get(5);
        item5.AddItem(listOfGraphs.get(1));
        item5.AddItem(listOfGraphs.get(3));
        item5.AddItem(listOfGraphs.get(4));
        item5.AddItem(listOfGraphs.get(6));
        item5.AddItem(listOfGraphs.get(7));
        item5.AddItem(listOfGraphs.get(8));

        Item item6 = listOfGraphs.get(6);
        item6.AddItem(listOfGraphs.get(5));
        item6.AddItem(listOfGraphs.get(9));

        Item item7 = listOfGraphs.get(7);
        item7.AddItem(listOfGraphs.get(0));
        item7.AddItem(listOfGraphs.get(5));
        item7.AddItem(listOfGraphs.get(8));

        Item item8 = listOfGraphs.get(8);
        item8.AddItem(listOfGraphs.get(5));
        item8.AddItem(listOfGraphs.get(7));
        item8.AddItem(listOfGraphs.get(9));

        Item item9 = listOfGraphs.get(9);
        item9.AddItem(listOfGraphs.get(2));
        item9.AddItem(listOfGraphs.get(4));
        item9.AddItem(listOfGraphs.get(6));
        item9.AddItem(listOfGraphs.get(8));
    }

}
