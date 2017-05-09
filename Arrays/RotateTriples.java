{
    if (a < array.length && b <array.length && c < array.length) {
        Listobject<T> _a = array[a];
        Listobject<T> _b = array[b];
        Listobject<T> _c = array[c];
        array[b] = _a;
        array[c] = _b;
        array[a] = _c;
        return true;
    }
    return false;
}