{
    if (a == null) return false;
    for (int i = 0; i < a.length; i++) {
        if (i +1 < a.length && comp.compare(a[i], a[i+1]) > 0) {
            return false;
        }
    }
    return true;
}
