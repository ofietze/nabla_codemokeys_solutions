{
    if (el == null || contains(el)) return false;
    
    if (getFirst() == null) {
        el.setNext(null);
        setFirst(el);
        setLast(el);
        setSize(1);
    }
    else 
    {
        el.setNext(getFirst());
        setFirst(el);
        setSize(size() + 1);
    }
    
    return true;
}