package Assignment.AbstractClass;


public class MyItemList implements NodeList {

    private ListItem root = null;

    public MyItemList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                //new item is greator - move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next so insert at the end
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //new Item is less , insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                System.out.println(newItem.getValue() + "already present");
                return false;

            }


        }
        return false;
    }


    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) {
            System.out.println("Item is empty");
            return false;
        }
        ListItem currentItem = this.root;


        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison== 0) {
                //if item at first position
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                }
                else { //if currentitem is not root item
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }

                }
                return true;
            }else if(comparison < 0 ) {
                currentItem = currentItem.next();
            }
            else {
                return false;
            }
        }

        return false;
    }


    @Override
    public void traverse(ListItem root) {
        ListItem currentItem = root;
        if(root== null){
            System.out.println("The list is empty");
        }

        while (currentItem != null) {
            System.out.print(currentItem.getValue()+",");
            currentItem = currentItem.next();
        }
        System.out.println();
    }
}
