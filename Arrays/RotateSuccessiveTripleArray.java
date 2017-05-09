{
    if (list == null) return null;
    
    Listobject<T> tmp_0 = null;
    Listobject<T> tmp_1 = null;
    Listobject<T> tmp_2 = null;
    for(int i = 2; i < list.length; i = i + 3) {
        tmp_0 = list[i-2];
        tmp_1 = list[i-1];
        tmp_2 = list[i];
        
        list[i] = tmp_0;
        list[i-1] = tmp_2;
        list[i-2] = tmp_1;
    }
    
    return list;
}