{
    if (head == null) return null;
    
    ListElement<T> current = head;
    ListElement<T> last = null;
    
    while (current != null) {
    
        if (last != null && comp.compare(current.getData(), last.getData()) == 0) {
            last.setNext(current.next());
            current = current.next();
            continue;
        }
        
        last = current;
        current = current.next();
    }
    
    return head;
}