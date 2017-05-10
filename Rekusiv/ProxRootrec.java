    if (x < 0 || g < 0 || tolerance < 0) throw new IllegalArgumentException();
    
    if (MathHelper.abs((x / g) - g) < tolerance) {
        return g;
    }
    
    return proxRootRec(x, ((x / g) + g)/2, tolerance);
}
