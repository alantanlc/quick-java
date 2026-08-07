import java.util.*;

Stack stuff = new Stack();
stuff.push("abracadabra");
stuff.push(new File("abc.txt"));
File foo = (File) stuff.pop();
String spell = (String) stuff.pop();

// Using type parameters, or generics
Stack<String> words = new Stack<String>();
words.push("abracadabra");
words.push(new File("abc.txt")); // not legal

Stack<String> words = new Stack<>();
Stack<String> words = new Stack();

String word = words.pop();

int find(String target, Stack<String> words) { ... }

