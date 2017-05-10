{
    LinkedList<T> newList = new LinkedList();
    
    ListElement<T> current = list.getFirst();
    while(current != null) {
        ListElement<T> newItem = new ListElement();
        newItem.setData(current.getData());
        if (newList.getFirst() == null) {
            newList.setFirst(newItem);
            newList.setLast(newItem);
            newList.setSize(1);
        }
        else {
            newList.getLast().setNext(newItem);
            newList.setLast(newItem);
            newList.setSize(newList.size() +1);
        }
        current = current.next();
    }
    
    return newList;
}