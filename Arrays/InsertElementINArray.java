{
    Listobject<T>[] ary = new Listobject[getArray().length +1];
    boolean isIn = false;
    for (int i = 0; i < getArray().length; i++) {
       
        if (element.compareTo(getArray()[i]) == 0) {
            isIn = true;
            ary[i] = getArray()[i];
        }
       
        
        if (isIn) {
            ary[i+1] = getArray()[i];
        }
        else {
            ary[i] = getArray()[i];
        }
    }
    
    setArray(ary);
    return ary;
}