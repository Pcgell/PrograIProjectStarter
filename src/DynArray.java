public class DynArray<T> implements Lista<T>{

    private T[] mItems;
    int mSize;


    public DynArray() {
        this.mItems = (T[]) new  Object[40];
        mSize = 0;
    }

    private void grow() {

        // E[] arr = (E[])new Object[INITIAL_ARRAY_LENGTH];
        T[] temp = (T[]) new  Object[mItems.length * 2];
        for (int i = 0; i < mItems.length; i++) {
            temp[i] = mItems[i];
        }
        mItems = temp;
    }

    @Override
    public void add(T data) {
        if(mSize >= mItems.length){
            grow();
        }
        mItems[mSize] = data;
        mSize++;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T remove(int index) {
        if(index >= mSize)
            return null;
        T retval = mItems[index];

        for (int i = index + 1; i < mSize ; i++) {
            mItems[i-1] = mItems[i];
        }
        mSize--;
        return retval;
    }

    @Override
    public T getItem(int index) {
        return mItems[index];
    }

    @Override
    public int getSize() {
        return mSize;
    }
}
