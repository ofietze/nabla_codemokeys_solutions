{
    if (isEmpty()) return null;
    
    ListElement<T> rtn = getFirst();
    
    setFirst(getFirst().next());
    setSize(size() - 1);
    if (size() == 1) {
        setLast(getFirst());
    }
    
    if (size() == 0) {
        setLast(null);
    }
    
    return rtn;
}