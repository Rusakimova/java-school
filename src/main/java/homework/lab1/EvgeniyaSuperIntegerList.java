package homework.lab1;

public class EvgeniyaSuperIntegerList implements SuperIntegerList {
    private int [] array;
    private int SIZE = 10;
    private int len;
    EvgeniyaSuperIntegerList() {
        this.array=new int[SIZE];
        len = 0;
    }
    @Override
    public void add(int number) {
        if ((len + 1)%SIZE == 0) {
            SIZE*=2;
            int[] tmp = new int[SIZE];
            System.arraycopy(array, 0, tmp, 0, SIZE);
            tmp[SIZE-1] = number;
            array = tmp;
        } else {
            array[len] = number;
        }
        len++;

    }

    @Override
    public void removeByIndex(int index) {
        int [] tmp=new int[len-1];
        int counter = 0;
        for (int i=0; i<len; i++) {
            if (i != index) {
                tmp[counter]=array[i];
                counter++;
            }
        }
        array=tmp;
        len--;
    }

    @Override
    public void removeByValue(int value) {
        int calc = 0;
        for (int i=0; i<len; i++) {
            if (array[i] == value) {
                calc += 1;
            }
        }
        int [] tmp=new int[len-calc];
        int index = 0;
        for (int i=0; i<len; i++) {
            if (array[i] != value) {
                tmp[index] = array[i];
                index++;
            }
        }
        array=tmp;
        len-=calc;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void printAll() {
        for (int i=0; i<len; i++) {
            System.out.println(array[i]);
        }
    }
}
