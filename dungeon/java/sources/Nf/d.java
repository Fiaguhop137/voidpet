package Nf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f8244a = File.separatorChar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8245b;

    static {
        Of.a aVar = new Of.a(4);
        try {
            PrintWriter printWriter = new PrintWriter(aVar);
            try {
                printWriter.println();
                f8245b = aVar.toString();
                printWriter.close();
                aVar.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    aVar.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long jE = e(inputStream, outputStream);
        if (jE > 2147483647L) {
            return -1;
        }
        return (int) jE;
    }

    public static int b(Reader reader, Writer writer) {
        long jG = g(reader, writer);
        if (jG > 2147483647L) {
            return -1;
        }
        return (int) jG;
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i10) {
        return f(inputStream, outputStream, new byte[i10]);
    }

    public static void d(InputStream inputStream, Writer writer, Charset charset) {
        b(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long e(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, 4096);
    }

    public static long f(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static long g(Reader reader, Writer writer) {
        return h(reader, writer, new char[4096]);
    }

    public static long h(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static String i(InputStream inputStream) {
        return j(inputStream, Charset.defaultCharset());
    }

    public static String j(InputStream inputStream, Charset charset) {
        Of.a aVar = new Of.a();
        try {
            d(inputStream, aVar, charset);
            String string = aVar.toString();
            aVar.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
