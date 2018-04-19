public interface Lista<T> {
    public void add(T data);
    public boolean isEmpty();
    public T remove(int index);
    public int getSize();
    public T getItem(int index);
}
