package dailywork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer>  arraylist = new ArrayList<>(5);
        for (int i=1;i<=5;i++)
        {
         int x = sc.nextInt();
         arraylist.add(x);

        }
        //printing list
        System.out.println(arraylist);
        //removing an element
        arraylist.remove(3);
        System.out.println(arraylist);
        for(int i = 0; i< arraylist.size(); i++){
            System.out.println(arraylist.get(i) + "  ");
        }

    }
}
