{
    runDataLogger();
    if (el == null || idx < 0 || idx > size()||contains(el)) return false;
    el.setNext(null);
   
    //if (contains(el)) return false;
    
    
     if (isEmpty()) {
        setFirst(el);
        setLast(el);
        setSize(1);
        return true;
    }
    
    if (idx == 0) {
        el.setNext(getFirst());
        setFirst(el);
        setSize(size()+1);
        return true;
    }
    
    if (idx == size())
    {
        getLast().setNext(el);
        setLast(el);
        setSize(size()+1);
        return true;
    }
    
    ListElement<T> last = null;
    ListElement<T> current = getFirst();
    
    for (int i = 0; i < size(); i++) {
        
        if (i == idx) {
            last.setNext(el);
            el.setNext(current);
            setSize(size()+1);
            return true;
        }
        last = current;
        current = current.next();
    }
    
    return false;
}