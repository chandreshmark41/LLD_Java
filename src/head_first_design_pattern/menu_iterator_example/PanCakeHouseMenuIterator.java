package head_first_design_pattern.menu_iterator_example;

import java.util.ArrayList;

public class PanCakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int length;
    int position = 0;

    public PanCakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
        this.length = items.size();
    }

    @Override
    public boolean hasNext() {
        if(position < length - 1){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
