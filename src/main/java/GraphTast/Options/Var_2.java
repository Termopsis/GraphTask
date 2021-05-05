package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Var_2 extends A_Var{

    public Var_2() {
        setArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
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
        hashMap.put(0, 13);
        hashMap.put(1, 20);
        hashMap.put(2, 25);
        hashMap.put(3, 18);
        hashMap.put(4, 14);
        hashMap.put(5, 24);
        hashMap.put(6, 14);
        hashMap.put(7, 15);
        hashMap.put(8, 11);
        hashMap.put(9, 11);
        return hashMap;
    }

    private ArrayList<Item> fillListOfGraphs(){
        ArrayList<Item> arrayList = new ArrayList<>();
        addEmptyElements(arrayList, array.length);

        Item item0 = arrayList.get(0);
        item0.AddItem(arrayList.get(1));
        item0.AddItem(arrayList.get(3));
        item0.AddItem(arrayList.get(4));
        item0.AddItem(arrayList.get(7));

        Item item1 = arrayList.get(1);
        item1.AddItem(arrayList.get(0));
        item1.AddItem(arrayList.get(2));
        item1.AddItem(arrayList.get(5));

        Item item2 = arrayList.get(2);
        item2.AddItem(arrayList.get(1));
        item2.AddItem(arrayList.get(9));

        Item item3 = arrayList.get(3);
        item3.AddItem(arrayList.get(0));
        item3.AddItem(arrayList.get(4));
        item3.AddItem(arrayList.get(5));

        Item item4 = arrayList.get(4);
        item4.AddItem(arrayList.get(0));
        item4.AddItem(arrayList.get(3));
        item4.AddItem(arrayList.get(5));
        item4.AddItem(arrayList.get(9));

        Item item5 = arrayList.get(5);
        item5.AddItem(arrayList.get(1));
        item5.AddItem(arrayList.get(3));
        item5.AddItem(arrayList.get(4));
        item5.AddItem(arrayList.get(6));
        item5.AddItem(arrayList.get(7));
        item5.AddItem(arrayList.get(8));

        Item item6 = arrayList.get(6);
        item6.AddItem(arrayList.get(5));
        item6.AddItem(arrayList.get(9));

        Item item7 = arrayList.get(7);
        item7.AddItem(arrayList.get(0));
        item7.AddItem(arrayList.get(5));
        item7.AddItem(arrayList.get(8));

        Item item8 = arrayList.get(8);
        item8.AddItem(arrayList.get(5));
        item8.AddItem(arrayList.get(7));
        item8.AddItem(arrayList.get(9));

        Item item9 = arrayList.get(9);
        item9.AddItem(arrayList.get(2));
        item9.AddItem(arrayList.get(4));
        item9.AddItem(arrayList.get(6));
        item9.AddItem(arrayList.get(8));
        return arrayList;
    }

}
