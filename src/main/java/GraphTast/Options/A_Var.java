package GraphTast.Options;

import GraphTast.GraphOptions.Item;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class A_Var implements I_VarOfGraphs{

    //Карта соответсвий значений и сумм требуемых значений
    public HashMap<Integer, Integer> map = new HashMap<>();

    //Наш список связей
    public ArrayList<Item> listOfGraphs = new ArrayList<>();

    //Массив чисел = ключам карты соответствий
    public int[] array;

    protected void addEmptyElements(ArrayList<Item> listOfGraphs, int counts){
        while (counts > 0){
            counts--;
            listOfGraphs.add(new Item());
        }
    }

}
