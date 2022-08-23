package linkedTask;

import java.util.*;

public class TaskLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];
        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(2);
            integerArrayList.add(random.nextInt(2));
            integerLinkedList.add(random.nextInt(2));

            
        }
        System.out.println(Arrays.toString(array));
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);

        System.out.println(integerLinkedList);
        Collections.sort(integerLinkedList);
        System.out.println(integerArrayList);

    }
}
