package fibonachi;

import java.io.*;

public class DataIOTest {
    String file;
    int n;

    public DataIOTest(String file, int n) {
        this.file = file;
        this.n = n;
    }

    public void write() throws IOException {
        DataOutputStream out = new
            DataOutputStream(new FileOutputStream(file));
        int value[] = Fibonachi.calculate(n);
        for(int i=0; i <= n; i++) {
            out.writeInt(value[i]);
            //System.out.println(value[i]);
        }
        out.flush();
        out.close();
    }

    public void read() throws IOException {
        DataInputStream in =
            new DataInputStream(new FileInputStream(file));
        int n = in.available()/4;
        //System.out.println("# of data = " + n);
        for(int i=0; i < n; i++) {
            int v = in.readInt();
            System.out.println("f["+i+"] = " + v);
        }
        in.close();
    }

    public static void main(String args[]) {
        try {
            DataIOTest dio = new DataIOTest("a.dat", 20);
            dio.write();
            dio.read();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
