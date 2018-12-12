/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edxProjects.ArrayList;
import java.util.ArrayList;
/**
 *
 * @author DELL INSPIRON
 */
public class ArrayListMystery2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        mystery2(list);
    }
    public static void mystery2(ArrayList<Integer> list ) {
        for (int i = list.size()- 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.add(list.get(i));
            }else{
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }
}
