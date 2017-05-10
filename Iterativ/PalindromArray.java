{
    if (a.length == 0 || a == null) return null;
    boolean[] rtn = new boolean[a.length];
    for (int i = 0; i < a.length; i++) {
        char[] ary = StringHelper.toCharArray(StringHelper.toLowerCase(a[i]));
        rtn[i] = true;
        for (int j = 0; j < ary.length; j++) {
            if (ary[j] != ary[(ary.length -1) -j]){
                rtn[i] = false;
                break;
            }
        }
    }
    
    return rtn;
}