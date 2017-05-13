public int fibRec(int i) {
        if (i < 0) {
            return 0;
        }
        return (i == 0) ? 0 : i == 1 ? 1 : fibRec(i - 1) + fibRec(i - 2);
    }
