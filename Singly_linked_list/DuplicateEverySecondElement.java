{
    if (head == null) return null;
    MListElement<T> elem = head;
    int i = 0;
    while(elem != null) {
        if (i % 2 == 0) {
            MListElement<T> tmp = new MListElement(elem.getKey());
            tmp.setNext(elem.getNext());
            elem.setNext(tmp);
        }
        i++;
        elem = elem.getNext();
    }
    return head;
}