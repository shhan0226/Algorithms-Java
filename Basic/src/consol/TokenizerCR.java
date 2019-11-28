package consol;

import java.io.*;

public class TokenizerCR {
	
	public static void main(String args[]) throws IOException {
		ConsoleReader reader = new ConsoleReader(System.in);		
		System.out.println("문장을 입력하세요");		
		String input = reader.readString();
		StreamTokenizer lexer = 
			new StreamTokenizer(new StringReader(input));
		lexer.quoteChar('"');
		while(lexer.nextToken() != StreamTokenizer.TT_EOF) {
			switch(lexer.ttype) {
				case StreamTokenizer.TT_WORD:
					System.out.println("W:" + lexer.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println("N:" + lexer.nval);
					break;					
				case StreamTokenizer.TT_EOL:
					System.out.println("EOL");
					break;					
				default:
					if(lexer.ttype == '"') {
						System.out.println("O:" + lexer.sval);
					} else {
						System.out.println("O:" + (char)lexer.ttype);
					}
			}
		}
	}

}
