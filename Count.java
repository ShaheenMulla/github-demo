import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Count {

    private int wordCount;
    private int lineCount;
    private long charCount;

    public int getLineCount(){
        return lineCount;
    }
    public int getWordCount(){
        return wordCount;
    }
    public long getCharCount() { return charCount; }

    public boolean processData(File filename, PrintWriter pw) {
        try (Scanner input = new Scanner(filename)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();

                for ( int i = 0; i < line.length(); i++){
                    charCount++;
                }
                try (Scanner text = new Scanner(line)) {
                    while (text.hasNext()) {
                        text.next();
                        wordCount++;
                    }
                }
            }
            return true;
        } catch (IOException e) {
            pw.println(e);
            return false;
        }
    }
}
class FileWordLIneCount {
    public static void main(String[] args) {
        Count c = new Count();
        PrintWriter pw = new PrintWriter(System.out, true);

        try (Scanner output = new Scanner(System.in)) {
            pw.println("Enter the file name : ");
            File fileName = new File(output.nextLine());

            while (!fileName.canRead()) {
                pw.println("File not found, try again!");
                pw.println("File name?");
                fileName = new File(output.nextLine());
            }
            if (c.processData(fileName, pw)) {
                pw.println("Total lines in the file = " + c.getLineCount());
                pw.println("Total words in the file = " + c.getWordCount());
                pw.println("Total characters in the file = " + c.getCharCount());
            }
        } catch (Exception e) {
            pw.println(e);
        }
        pw.close();
        ;
    }
}

