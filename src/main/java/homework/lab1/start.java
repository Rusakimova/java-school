package homework.lab1;

public class start {

    public static void main(String[]args){
        int [] array = {1, 3, 5, 6};
        EvgeniyaSuperIntegerList list = new EvgeniyaSuperIntegerList(array);
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
