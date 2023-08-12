import java.util.Arrays;
//Creates and constructs WordLine Objects
public class WordLine {

private String Word;
private int LineNumber;

public WordLine(String word, int lineNumber) {
//Exception to be thrown if the WordLine lineNumber value is not valid.
if(lineNumber < 1) throw new InvalidWordLineException("Line number cannot be less than 1");

else {
Word = word;
LineNumber = lineNumber;
}

}


//Returns the word value as a string.
public String getWordLine() {
return Word;
}
//Returns the line number value as a string.
public  String getLineNumber() {
return Integer.toString(LineNumber);
}
//Returns both the word value a line value of the WordLine object as a whole string.
public String getWordAndLineNumber() {
return "\"" + Word + "\"" + " is on line " + Integer.toString(LineNumber);
}


}
