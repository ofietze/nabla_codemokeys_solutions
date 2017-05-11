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
