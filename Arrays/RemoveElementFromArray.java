{
    Listobject<T>[] rtn = new Listobject[array.length-1];
    
    for (int i = 0; i < rtn.length; i++) {
        
        if (i < index) {
            rtn[i] = array[i];
        }
        
        if (i == index) {
            rtn[i] = array[i+1];
        }
        
        if (i > index) {
            rtn[i] = array[i+1];
        }
    }
    return rtn;
}
