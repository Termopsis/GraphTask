package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class A_Var implements I_VarOfGraphs{

    //Array of numbers = match map keys
    public int[] array;

    //Map of values and sums of required values
    public HashMap<Integer, Integer> mapOfValues = new HashMap<>();

    //Our link list
    public ArrayList<Item> arrayList = new ArrayList<>();

    protected void addEmptyElements(ArrayList<Item> listOfGraphs, int counts){
        while (counts > 0){
            counts--;
            listOfGraphs.add(new Item());
        }
    }

}
