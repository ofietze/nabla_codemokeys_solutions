{
    if (el == null || contains(el)) return false;
    
    ListElement<T> fast = el, slow= el;
    
    while (slow != null && fast != null && fast.hasNext()) {
        fast = fast.next().next();
        slow = slow.next();
        if (fast == slow) return false;
    }
    
    for (ListElement<T> i = el; i != null; i = i.next()) {
        if (contains(i)) return false;
    }
    
    int i = 1;
    ListElement<T> c = el;
    while(c.hasNext()) {
        c = c.next();
        i++;
    }
    
    if (isEmpty()) {
        setFirst(el);
         setLast(c);
    }
    else {
    getLast().setNext(el);
    setLast(c);
    }
    setSize(size() +i);
  
    
    return true;
}