package GraphTast;

import java.util.ArrayList;

public class Permutation {

    private int[] arrOfNumbers;
    private ArrayList<int[]> permutationListOfDigits;

    public Permutation(int[] arrOfNumbers) {
        this.arrOfNumbers = arrOfNumbers;
        this.permutationListOfDigits = new ArrayList<>();
    }

    public void fillPermutation() {
        if (arrOfNumbers.length != 0) {
            fillPermutationOptions(arrOfNumbers, arrOfNumbers.length);
        }else
            System.out.println("The array of numbers is empty!");
    }

    //finds permutation using Heap Algorithm
    private void fillPermutationOptions(int array[], int size) {
        // if size becomes 1, it prints the obtained permutation
        if (size == 1)

            this.permutationListOfDigits.add(array.clone());
        for (int i = 0; i < size; i++) {
            fillPermutationOptions(array, size - 1);

            //if the length of the array is odd, it swaps the 0th element with the last element
            int temp;
            if (size % 2 == 1) {
                //performing swapping
                temp = array[0];
                array[0] = array[size - 1];
            }

            //if the size of the array is even, it swaps the ith element with the last element
            else {
                //taking a temp variable for swapping and performing swapping
                temp = array[i];
                array[i] = array[size - 1];
            }
            array[size - 1] = temp;
        }
    }

    public ArrayList<int[]> getPermutationListOfDigits() {
        return permutationListOfDigits;
    }
}


