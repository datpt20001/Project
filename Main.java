
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Hoang Viet
 */
public class Main {

    public static void main(String[] args) {
        Validation check = new Validation();
        Sorter m = new Sorter();
        int size = check.inputInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        System.out.print("Unsorted array: ");
        m.display(arr);
        m.bubbleSort(arr);
        System.out.print("Sorted array: ");
        m.display(arr);
    }
}
