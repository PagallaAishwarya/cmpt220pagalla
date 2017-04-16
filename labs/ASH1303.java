/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author aishw
 */
 import java.util.ArrayList;
import java.util.Collections;
public class ASH1303 {
   

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        System.out.println("Shuffled: ");
        KIT.display(numbers.toArray());
        System.out.println("Sorted: ");
        sort(numbers);
        KIT.display(numbers.toArray());
    }

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }

    }

}
    

