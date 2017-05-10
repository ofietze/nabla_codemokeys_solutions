{
    if (el == null || getFirst() != null && contains(el)) {
        return false;
    }
    
    if (getLast() == null) {
        el.setNext(null);
        setFirst(el);
        setLast(el);
        setSize(1);
    }
    else 
    {
        el.setNext(null);
        getLast().setNext(el);
        setLast(el);
        setSize(size() +1);
        return true;
    }
    return true;
}