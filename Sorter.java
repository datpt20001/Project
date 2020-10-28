/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Viet
 */
public class Sorter {

    void bubbleSort(int[] array) {
        int size = array.length;
        int j = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < size - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != size - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

}
