{
    if (getFirst() == null) return false;
    
    ArrayListElement<T> current = getFirst();
    for (int i = 0; i < getFirst().getN(); i++) {
        for (Listobject<T> o : current.getData()) {
            if (o != null && o.getData() == data) {
                return true;
            }
        }
        current = current.getNext();
    }
    return false;
}