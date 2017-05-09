public Listobject<T>[] duplicateEverySecondElement(Listobject<T>[] array)
{
    Listobject<T>[] rtn = new Listobject[(int) (((double)array.length) / 2) + array.length];
    int j = 0;
    for(int i = 0; i < array.length; i++) {
        rtn[j] = array[i];
        if (i % 2 != 0) {
            j++;
            rtn[j] = array[i];
        }
        j++;
    }
    return rtn;
}
