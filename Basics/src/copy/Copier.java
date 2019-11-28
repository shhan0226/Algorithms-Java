package copy;

import java.io.*;

public class Copier {	

    protected InputStream in;
    protected OutputStream out;
    protected byte data[];

    public Copier(InputStream in, OutputStream out, int sz) {
        this.in = in;
        this.out = out;
        data = new byte[sz];
    }

    public Copier(InputStream in, OutputStream out) {
        this(in, out, 1024);
    }

    public void copy() throws IOException {
        int n = 0;
        while((n = in.read(data)) != -1) {
            out.write(data, 0, n);
        }
        in.close();
        out.close();
    }

}
