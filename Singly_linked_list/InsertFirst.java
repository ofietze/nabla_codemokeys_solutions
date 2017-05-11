{
    if (el == null || contains(el)) return false;
    
    ListElement<T> fast=el, slow=el;
    
    while(slow != null && fast != null && fast.hasNext()) {
        fast = fast.next().next();
        slow = slow.next();
        if (fast == slow) return false;
    }
    
    for(ListElement<T> elIt = el; elIt != null; elIt = elIt.next()) {
        if(this.contains(elIt)) return false;
    }
    
    
    int i = 1;
    ListElement<T> c = el;
    while(c.hasNext()) {
        
        c= c.next();
        i++;
    }
    
    if (getFirst() == null) {
        setLast(c);
    }
    c.setNext(getFirst());
    setFirst(el);
    setSize(size() + i);
    return true;
}