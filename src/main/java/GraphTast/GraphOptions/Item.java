package GraphTast.GraphOptions;

import java.util.ArrayList;

public class Item {

    private int value;
    private int targetValue;
    private ArrayList<Item> items = new ArrayList();

    public void AddItem(Item item){
        items.add(item);
    }

    public int getValue() {
        return value;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

}
