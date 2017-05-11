                      {
    ListElement<T> clone = null, currClone = null;
    
    for (ListElement<T> curr = el; true; curr = curr.next()) {
        if (clone == null) {
            clone = new ListElement(curr.getData());
            currClone = clone;
        } else {
            currClone.setNext(new ListElement(curr.getData()));
            currClone = currClone.next();
        }
        if (!curr.hasNext()) {
            break;
        }
    }
    
    return clone;
}