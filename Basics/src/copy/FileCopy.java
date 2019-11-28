package copy;

import java.io.*;

public class FileCopy {
    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.print("usage: java FileCopy ");
            System.out.println("<filename> <filename>");    
            System.exit(1);
        }
        try {
            Copier cp = new Copier(
            		new FileInputStream("./data/"+ args[0]),
                    new FileOutputStream("./data/"+ args[1], 
                    true)
                   );
            
            cp.copy();
            System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
