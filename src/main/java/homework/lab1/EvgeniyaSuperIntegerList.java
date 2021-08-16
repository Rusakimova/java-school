package homework.lab1;

public class EvgeniyaSuperIntegerList implements SuperIntegerList {
    private int [] array;
    EvgeniyaSuperIntegerList(int[] array) {
        this.array=array;
    }
    @Override
    public void add(int number) {
        int[] tmp = new int[array.length + 1];
        System.arraycopy(array, 0, tmp, 0, array.length);
        tmp[array.length] = number;
        array = tmp;
    }

    @Override
    public void removeByIndex(int index) {
        int [] tmp=new int[array.length-1];
        int counter = 0;
        for (int i=0; i<array.length; i++) {
            if (i != index) {
                tmp[counter]=array[i];
                counter++;
            }
        }
        array=tmp;
    }

    @Override
    public void removeByValue(int value) {
        int calc = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                calc += 1;
            }
        }
        int [] tmp=new int[array.length-calc];
        int index = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] != value) {
                tmp[index] = array[i];
                index++;
            }
        }
        array=tmp;
    }

    @Override
    public int get(int index) {
        System.out.println("get worked");
        return array[index];
    }

    @Override
    public void printAll() {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
