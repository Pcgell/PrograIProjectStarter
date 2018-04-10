public class DynArray {

    private Product[] items;
    private int size;

    public DynArray() {
        this.items = new Product[3];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     *  Method : add
     *  adds the producto to the items array.
     *
     * @param product: the product to add.
     */
    public void add(Product product){

        if(size >= items.length){
            grow();
        }
        items[size] = product;
        size++;

    }

    private void grow() {
        Product[] temp = new Product[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    /**
     * Method: remove
     *  removes an object at a the specified index
     *  if posible returns false if it fails.
     * @param index: index of the object to be removed.
     * @return true if it removes the item successfully.
     */
    public boolean remove(int index){
        if(index >= size)
            return false;

        for (int i = index + 1; i < size ; i++) {
            items[i-1] = items[i];
        }
        size--;
        return true;
    }

    public boolean isEmpty(){

        
        return false;
    }
}
