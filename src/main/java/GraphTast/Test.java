package GraphTast;

import GraphTast.GraphOptions.Graph;
import GraphTast.GraphOptions.Item;
import GraphTast.Options.A_Var;
import GraphTast.Options.Var_1;
import GraphTast.Options.Var_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

    private Permutation permutation;
    private Graph graph;

    public static void main(String[] args) {

        //Graph variant
        System.out.println("First one ------------------------------");
        start(new Var_1());

        System.out.println("\nSecond one ------------------------------");
        start(new Var_2());
    }

    static void start(A_Var varOfGraphs){

        //The task of processing a graph and searching for matches in it
        Test test = new Test();

        //Заполним входные данные
        Permutation permutation = new Permutation(varOfGraphs.array);
        permutation.fillPermutation();
        test.setPermutation(permutation);

        Graph graph = new Graph();
        graph.setValueOfNumbers(varOfGraphs.mapOfValues);
        graph.setGraphLinks(varOfGraphs.arrayList);
        test.setI_graph(graph);

        test.checkAllPermutation();
    }

    public void checkAllPermutation() {
        for (int i = 0; i < permutation.getPermutationListOfDigits().size(); i++) {
            check(permutation.getPermutationListOfDigits().get(i), graph.getGraphLinks(), graph.getValueOfNumbers());
        }
    }

    public void setPermutation(Permutation permutation) {
        this.permutation = permutation;
    }

    public void setI_graph(Graph graph) {
        this.graph = graph;
    }

    public void check(int[] arr, ArrayList<Item> listOfGraphs, HashMap<Integer,Integer> map){

        for (int i = 0; i < arr.length; i++) {
            //Filled in the value of the element by taking the number from the array where you just put a new combination
            listOfGraphs.get(i).setValue(arr[i]);

            //For the new combination, we also take the total number from the card
            listOfGraphs.get(i).setTargetValue(map.get(arr[i]));
        }

        //We check whether the numbers we need will work out with the given combination
        if (countTargetValue(listOfGraphs)) {
            System.out.println("The final set of numbers: " + Arrays.toString(arr));
            //Let's not interrupt the cycle. Let's look for all combinations of combinations
        }
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
