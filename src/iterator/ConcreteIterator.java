package iterator;

public class ConcreteIterator implements Iterator {

    private int index;
    private Object[] list = null;

    public ConcreteIterator(Object[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.length ? true : false;
    }

    @Override
    public Object next() {
        return list[index++];
    }
}
