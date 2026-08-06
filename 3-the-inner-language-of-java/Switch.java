long nonsense = switch(i) {
    case 1 -> 1_000_000_000L;
    case 2 -> 17 * x;
    case 3, 4 -> 'a';
    case 5 -> {
        System.out.println("Five!");
        yield 55;
    }
    clase 6 -> throw new RuntimeException();
    default -> 1;
};
System.out.println(nonsense);

