package Assignment.AbstractClass;

public class SearchTree implements NodeList{
    ListItem root = null;

    public SearchTree(ListItem root) {
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
        ListItem parentItem = currentItem;


        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if (comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else{
                performRemoval(currentItem,parentItem);
                return true;
            }
        return false;

        }

        return false;
    }


   /* @Override
    public void traverse(ListItem root) {

        if(root!=null){
            System.out.println("*"+root.getValue());
            traverse(root.previous());
            System.out.print("**"+root.getValue()+", ");
            traverse(root.next());
        }
        System.out.println();
    }*/
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

    private void performRemoval(ListItem removeItem, ListItem parent){
        if(removeItem.next() == null){
            if(parent.next() == removeItem){
                parent.setNext(removeItem.previous());
            }
            else if(parent.previous() ==removeItem){
                parent.setPrevious(removeItem.previous());
            }
            else{
                this.root = removeItem.previous();
            }
        }
        else if(removeItem.previous() == null){
            if(parent.next() == removeItem){
                parent.setNext(removeItem.next());
            }
            else if(parent.previous() ==removeItem){
                parent.setPrevious(removeItem.next());
            }
            else{
                this.root = removeItem.next();
            }
        }
        else{
            ListItem current = removeItem.next();
            ListItem leftmostParent = removeItem;
            while(current.previous() != null){
                leftmostParent = current;
                current= current.previous();
            }

            removeItem.setValue(current.getValue());
            if(leftmostParent == removeItem){
                removeItem.setNext(current.next());
            }
            else{
                removeItem.setPrevious(current.previous());
            }

        }
    }
}
