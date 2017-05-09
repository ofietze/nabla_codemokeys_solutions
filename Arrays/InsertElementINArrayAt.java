{
    Listobject<T>[] array = getArray();
    Listobject<T>[] rtn = new Listobject[array.length + 1];
    boolean lock = false;
    for (int i = 0; i < array.length; i++) {
        if (i < pos) {
            rtn[i] = array[i];
        }
        if (i == pos) {
            if (array[i] == null) {
                lock = true;
                rtn[i] = element;
            } else {
                rtn[i] = element;
                rtn[i + 1] = array[i];
            }
        }
        if (i > pos) {
            if (lock) {
                rtn[i] = array[i];
            } else {
                rtn[i + 1] = array[i];
            }
        }
    }
    setArray(rtn);
    return rtn;
}
