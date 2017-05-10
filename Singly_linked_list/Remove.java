{
    if (isEmpty() || idx < 0 || idx >= size()) return null;
    
    ListElement<T> rem = null;
    ListElement<T> current = getFirst();

    if (size() == 1){
        rem = getFirst();
        setFirst(null);
        setLast(null);
        setSize(0);
        return rem;
    }   
    
    
    for (int i = 0; i < size; i++) {
        if (idx -1 == -1) {
            rem = getFirst();
            setFirst(getFirst().next());
            break;
        }
        if (i == idx - 1) {
            rem = current.next();
            
            if (rem.next() == null)
            {
                current.setNext(null);
                setLast(current);
            }
            else {
                current.setNext(rem.next());
            }
            break;
        }
        current = current.next();
    }
    setSize(size()-1);
    return rem;
}