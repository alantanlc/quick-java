# Lightning Tour of Java

## Data

Every data value in Java is eithe a __primitive__ or and __object__.

There are eight kinds of primitives, most of them numeric types.

Objects are defined by __classes__, and each class defines a new type of object.

Pprimitive data types:
1. byte
2. short
3. int (integers, or whole numbers)
4. long
5. float
6. double (numbers containing a decimal point)
7. boolean (the values true and false)
8. char (individual characters)

Two important types of object are:
1. string (objects defined by the String class)
1. array (objects defined using traditional syntax)

# Example

```java
int count; // declaration
count = 0; // definition
int count = 0; // declaration + definintion
```

```java
int[] numbers = new int[100];
int len = numbers.length;
int first = numbers[0];
int last = numbers[99];
last = numbers[len-1];
```

## Operators

Arithmetic operators:
1. + (add)
2. - (subtract, or unary minus)
3. * (multiply)
4. % (remainder, or modulus)

- Multiplicative operators \*, / and % are done before the additive operatiors + and -.
- Operations of the same precedence are done left to right
- Arithmetic expressions using only integers result in an integer result. If the expression involves a double, the result will be a double.

Boolean operators:
1. && (and)
2. || (or)
3. ! (not)

Comparison operators:
1. < (less than)
2. <= (less than or equals)
3. == (equals)
4. != (not equals)
5. > (greater than)
6. >= (greater than or equals)

## Program Structure

A class is a recipe, or blueprint, for making objects. Classes contain declarations, constructors, and methods.

```java
public class ClassName {
    declarations
    constructors
    methods
}
```

Classes marked public are available everywhere throughout the program.Q

## Statements

__if statement__

```java
if (2 + 2 == 4) {
    System.out.println("All is well.");
} else {
    System.out.println("What??");
}
```

__while loop__

```java
int count = 10;
while (count > 0) {
    System.out.println(count):
    count--;
}
System.out.println("Blast off!");
```

__for loop__

```java
for (int i = 0; i > 0; i--) {
    System.out.println(i);
}
System.out.println("Blast off!");
```

