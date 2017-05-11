######## FRED
{
    
    Listobject<T>[] arr = getArray();
    
    if(pos < 0 || pos > arr.length) return arr;
    
    int shift = (pos == arr.length || arr[pos] != null) ? 1 : 0;
    
    Listobject<T>[] newArr = new Listobject[arr.length + shift];
    
    for(int i = 0; i < newArr.length; i++) {
        if(i < pos) newArr[i] = arr[i];
        else if(i == pos) newArr[i] = element;
        else newArr[i] = arr[i - shift];
    }
    setArray(newArr);
    return newArr;
}





########LUKAS
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
