package iterator;

public interface List {
    public void add(Object obj);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}
