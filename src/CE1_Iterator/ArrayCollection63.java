package CE1_Iterator;

public class ArrayCollection63 extends Collection63{

    private int[] array = {1,2,3,4,5,6,7,8,9,10};
    public int getItem(int i){
        return array[i];
    }

    public int count(){
        return array.length;
    }

    @Override
    public Iterator63 createIterator() {
        return new ArrayIterator63(this);
    }
}
