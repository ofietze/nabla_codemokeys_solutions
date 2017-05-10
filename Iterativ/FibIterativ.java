{
    if (n < 0) throw new IllegalArgumentException();
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    int[] last = new int[n+1];
    last[0] = 0;
    last[1] = 1;
    for (int i = 2; i <= n; i++) {
        last[i] = last[i-1] + last[i-2];
    }
    return last[n];
}