package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC3698e0;
import io.sentry.M3;
import io.sentry.util.C3799a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f44638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f44639b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final C3799a f44640c = new C3799a();

    public static String a(Context context) {
        InterfaceC3698e0 interfaceC3698e0A = f44640c.a();
        try {
            if (f44638a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f44638a = strC;
                        if (interfaceC3698e0A != null) {
                            interfaceC3698e0A.close();
                        }
                        return strC;
                    }
                    f44638a = b(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str = f44638a;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return str;
        } catch (Throwable th2) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f44639b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = M3.a();
            fileOutputStream.write(strA.getBytes(f44639b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
