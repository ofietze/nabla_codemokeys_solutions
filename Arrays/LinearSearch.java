{
    for (int i = 0; i < getArrayLength(); i++) {
        if (getElem() != null && getArrayElem(i) != null && getComp().compare(getElem(), getArrayElem(i)) == 0) {
            return i;
        }
    }
    return -1;
}