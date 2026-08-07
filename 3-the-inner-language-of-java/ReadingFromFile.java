// Reading from a File

/* The basic approach to reading from or writing to a text file is
 * (1) open the file
 * (2) use the file
 * (3) close the file
 *
 * Each of these steps could raise an exception which must be handled.
 *
 * The FileReader class has methods that will read characters and return them as integers.
 * This is inconvenient, so the usual way to read files is to wrap a BufferedReader around a FileReader object
 *
 * A BufferedReader has the following methods (among others):
 * - readLine() reads and returns one line (as a String), or null if the end of the file has been reached.
 * - read(charArray, index, n) fills the character array with n characters, starting at index. The return value is the number of characters actually read.
 * - close() closes both the BufferedReader and the associated FileReader. Closing an already-closed reader does not throw an exception.
 */

FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr);
String line = br.readLine();
br.close()

// The file argument to the FileReader constructor may be eithere a File object or a string representing a path to the file.
// If the file doesn't exist, the constructor will throw an FileNotFoundException.

// The constructor for a BufferedReader will not throw an IOException, but any use of readLine, read, or close could do so.


try (FileReader fr = new FileReader("/Users/dave/test.txt");
    BufferedReader br = new BufferedReader(fr);) {
        String line = br.readLine();
        System.out.println(line);
    }
    catch (IOException e) { }

try (FileWriter fw = new FileWriter("/Users/dave/test2.txt")) {
    fw.write("Hello\n");
    fw.write("Goodbye");
} catch (IOException e) {}

