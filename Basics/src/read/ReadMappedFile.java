package read;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class ReadMappedFile {
	
	public static void main(String args[])  throws Exception {
		FileInputStream is = new FileInputStream("./data/test.txt");
		FileChannel fc = is.getChannel();
		int size = (int) fc.size();
		
		MappedByteBuffer mb = 
			fc.map(FileChannel.MapMode.READ_ONLY, 0, size);
		
		Charset charset = Charset.forName("ISO-8859-1");
		CharsetDecoder decoder = charset.newDecoder();
		CharBuffer cb = decoder.decode(mb);
		System.out.println(cb.toString());
		fc.close();
	}	

}
