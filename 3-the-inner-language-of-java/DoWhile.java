Random rand = new Random();
int x;
do {
    x = rand.nextInt(1000);
} while (x % 7 != 0);

