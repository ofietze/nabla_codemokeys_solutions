{
    if (list == null) return null;
    Listobject<T> tmp = null;
    for (int i = 1; i < list.length; i = i + 2) {
            tmp = list[i];
            list[i] = list[i-1];
            list[i-1] = tmp;
    }
    return list;
}