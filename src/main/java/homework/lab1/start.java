package homework.lab1;

import homework.lab1.EvgeniyaSuperIntegerList;

public class start {

    public static void main(String[]args){
        EvgeniyaSuperIntegerList list = new EvgeniyaSuperIntegerList();
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(6);
        list.printAll();
        list.get(2);
        list.removeByIndex(1);
        list.printAll();
        list.removeByValue(6);
        list.printAll();
    }
}
