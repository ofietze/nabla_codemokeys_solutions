{
    if (StringHelper.isEmpty(s)) return false;
    
    s = StringHelper.toLowerCase(s);
    char[] ary = StringHelper.toCharArray(s);
    
    for (int i = 0; i < ary.length; i++) {
        if (ary[i] != ary[(ary.length -1) - i]){
            return false;
        }
    }
    return true;
}