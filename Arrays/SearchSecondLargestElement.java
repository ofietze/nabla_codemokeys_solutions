{
    if (getLength() <= 1)  return;
    
    for (int i = 0; i < getLength(); i++) {
        if (getLargest() == -1) {
            setLargest(i);
        }
        if (getComp().compare(getElem(getLargest()), getElem(i)) < 0) {
            setSecLargest(getLargest());
            setLargest(i);
        }
        else if (getSecLargest() == -1 || getComp().compare(getElem(getSecLargest()), getElem(i)) < 0) {
            setSecLargest(i);
        }
    }
    
    if (getComp().compare(getElem(getLargest()), getElem(getSecLargest())) == 0) {
        setSecLargest(-1);
    }
}