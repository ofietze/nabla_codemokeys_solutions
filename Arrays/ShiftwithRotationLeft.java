{
    if (list == null) return null;
    
    Listobject<T> tmp = list[0];
    
    for (int i = 0; i < list.length-1; i++)
    {
        list[i] = list[i+1];
    }
    
    list[list.length-1] = tmp;
    
    return list;
}