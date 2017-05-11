{
    if (idx < 0 || idx > size) return null;
    
    ListElement<T> current = getFirst();
    int i = 0;
    while(current != null) {
        
        if (i == idx) {
            return current;
        }
        i++;
        current = current.next();
    }
    
    return null;
}