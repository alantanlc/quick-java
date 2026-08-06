/**
 * A leap year is a year divisible by 4 but not
 * by 100, unless it is also divisible by 400.
 */
boolean isLeapYear(int year) {
    // return (year % 4 == 0) && !(year % 100 == 0 && !(year % 400 == 0));
    if (year % 4 != 0) return false;
    if (year % 100 != 0) return true;
    return year % 400 == 0;
}

