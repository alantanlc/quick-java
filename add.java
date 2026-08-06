/**
 * Returns the sum of two numbers.
 * @param a The first number.
 * @param b The second number. Cannot be negative.
 * @return the sum of the two numbers.
 * @throws AssertionError if b is negative.
 */
int add(int a, int b) {
    assert b >= 0; // ignored unless -ea is set
    while (b > 0) {
        // move a 1 from b into a
        b -= 1;
        a += 1;
    }
    return a;
}
