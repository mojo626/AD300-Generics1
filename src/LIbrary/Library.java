package LIbrary;

import java.util.ArrayList;

public class Library<T extends LibraryItem> {
    ArrayList<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public int findFirstItemWithName(String name) {
        for (T item : items) {
            if (item.name.equals(name)) {
                return items.indexOf(item);
            }
        }

        return -1;
    }

    public T getItem(int index) {
        return items.get(index);
    }
}
