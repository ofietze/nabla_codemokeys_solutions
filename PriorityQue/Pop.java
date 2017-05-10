{
    if (getHead() == null) return null;
    T data = getHead().getKey();
    setHead(getHead().getNext());
    return data;
}