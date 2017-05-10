{
    if (i <= 0) return 0;
    if (i == 1) return 1;
    return fibRec(i-1) + fibRec(i-2);
}