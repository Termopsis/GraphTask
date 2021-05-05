package GraphTast;

import GraphTast.GraphOptions.Graph;
import GraphTast.GraphOptions.I_Graph;
import GraphTast.GraphOptions.Item;
import GraphTast.Options.A_Var;
import GraphTast.Options.Var_1;
import GraphTast.Options.Var_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

    Permutation permutation;
    I_Graph i_graph;

    public static void main(String[] args) {

        //Вариант графа
        System.out.println("First one ------------------------------");
        start(new Var_1());

        System.out.println("\nSecond one ------------------------------");
        start(new Var_2());
    }

    static void start(A_Var varOfGraphs){

        //Задача по обработке графа и поска в нем соответствий
        Test test = new Test();

        //Заполним входные данные
        Permutation permutation = new Permutation(varOfGraphs.array);
        permutation.fillPermutation();
        test.setPermutation(permutation);

        Graph graph = new Graph();
        graph.setValueOfNumbers(varOfGraphs.map);
        graph.setGraphLinks(varOfGraphs.listOfGraphs);
        test.setI_graph(graph);

        test.checkAllPermutation();
    }

    public void checkAllPermutation() {
        for (int i = 0; i < permutation.getPermutationListOfDigits().size(); i++) {
            if (check(permutation.getPermutationListOfDigits().get(i), i_graph.getGraphLinks(), i_graph.getValueOfNumbers())) {
                //break;
            }
        }
    }

    public void setPermutation(Permutation permutation) {
        this.permutation = permutation;
    }

    public void setI_graph(I_Graph i_graph) {
        this.i_graph = i_graph;
    }

    public boolean check(int[] arr, ArrayList<Item> listOfGraphs, HashMap<Integer,Integer> map){

        for (int i = 0; i < arr.length; i++) {
            //Заполнили значение элемента взяв число из массива где только что выставили новую комбинацию
            listOfGraphs.get(i).setValue(arr[i]);

            //По новой комбинации так же берем из карты итоговое число
            listOfGraphs.get(i).setTargetValue(map.get(arr[i]));
        }

        //Проверяем получится при данной комбинации нужные нам числа
        if (countTargetValue(listOfGraphs)) {
            System.out.println("The final set of numbers: " + Arrays.toString(arr));

            //Не будем прерывать цикл. Пусть ищет все возможные комбинации
            //return true;
        }
        return false;
    }

    public boolean countTargetValue(ArrayList<Item> listOfGraphs){

        for(Item item: listOfGraphs){
            ArrayList<Item> listOfItems = item.getItems();

            int v = 0;
            for (int i = 0; i < listOfItems.size(); i++) {
                v += listOfItems.get(i).getValue();
            }
            if (item.getTargetValue() != v){
                return false;
            }
        }
        return true;
    }
}
