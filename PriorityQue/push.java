{
    if (key == null) return false;
    MListElement<T> current = getHead();
    MListElement<T> last = null;
    
    if (current == null) {
        setHead(new MListElement(key));
        return true;
    }
    
    while (current != null) {
        
        if (getComp().compare(current.getKey(), key) > 0){
            MListElement<T> newItem = new MListElement(key);
            newItem.setNext(current);
            if (last == null) {
                setHead(newItem);
            }
            else {
                last.setNext(newItem);
            }
            return true;
        }
        last = current;
        current = current.getNext();
    }
    
    last.setNext(new MListElement(key));
    return false;
}