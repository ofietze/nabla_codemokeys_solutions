{
     ListElement<T> rem = null;
    runDataLogger();
    if (isEmpty())
        return null;
    
    if (getFirst().next() == null) {
        rem = getFirst();
        setFirst(null);
        setLast(null);
        setSize(0);
        return rem;
    }
    
   
    ListElement<T> current = getFirst();
    ListElement<T> last = null;
    
    while (current != null) {
        if (current.next() == null) {
            rem = current;
            setSize(size() - 1);
            setLast(last);
            getLast().setNext(null);
          
        }
        last = current;
        current = current.next();
    }

    return rem;
}