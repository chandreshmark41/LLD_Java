package head_first_design_pattern.menu_iterator_example;

public class DinerMenuIterator implements Iterator{

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
