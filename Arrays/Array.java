
public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void print() {
        for (int item : items) {
            System.out.print(item + " ");
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }
}