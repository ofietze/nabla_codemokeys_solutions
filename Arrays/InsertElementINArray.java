{
    if(element == null) return getArray();
    
    Listobject<T>[] arr = getArray(), newArr = new Listobject[arr.length+1];
    int shiftFrom = arr.length;
    for(int i = 0; i < arr.length; i++) {
        
        int compVal = element.compareTo(arr[i]);
        
        if(compVal <= 0) {
            shiftFrom = i;
            break;
        }
        else newArr[i] = arr[i];
        
    }
    newArr[shiftFrom] = element;
    for(int i = shiftFrom+1; i < newArr.length; i++)
        newArr[i] = arr[i-1];
    
    setArray(newArr);
    
    return newArr;
}


