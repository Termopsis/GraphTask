package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Var_1 extends A_Var{

    public Var_1() {
        setArray(new int[]{1, 3, 4, 7});
        setMapOfValues(fillConformityMap());
        setListOfGraphs(fillListOfGraphs());
    }

    @Override
    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void setListOfGraphs(ArrayList<Item> listOfGraphs) {
        this.arrayList = listOfGraphs;
    }

    @Override
    public void setMapOfValues(HashMap<Integer, Integer> mapOfValues) {
        this.mapOfValues = mapOfValues;
    }

    private HashMap<Integer, Integer> fillConformityMap(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 3);
        hashMap.put(3, 12);
        hashMap.put(4, 10);
        hashMap.put(7, 7);
        return  hashMap;
    }

    private ArrayList<Item> fillListOfGraphs(){
        ArrayList<Item> arrayList = new ArrayList<>();
        addEmptyElements(arrayList, array.length);

        Item item0 = arrayList.get(0);
        item0.AddItem(arrayList.get(1));

        Item item1 = arrayList.get(1);
        item1.AddItem(arrayList.get(0));
        item1.AddItem(arrayList.get(2));
        item1.AddItem(arrayList.get(3));

        Item item2 = arrayList.get(2);
        item2.AddItem(arrayList.get(1));
        item2.AddItem(arrayList.get(3));

        Item item3 = arrayList.get(3);
        item3.AddItem(arrayList.get(1));
        item3.AddItem(arrayList.get(2));
        return arrayList;
    }
}
