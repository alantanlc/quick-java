
double average() {
    int[] arr = {10, 20, 5, -1, 30, -12, 50};
    double sum = 0;
    int count = 0;
    for (int a: arr) {
        if (a <= 0) continue;
        sum += a;
        count += 1;
    }
    double average = sum / count;
    return average;
}

