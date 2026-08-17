package p023b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p077e4.g;

/* JADX INFO: loaded from: classes.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f26268a;

    public a(HttpURLConnection httpURLConnection) {
        this.f26268a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // p023b4.d
    public String Y0() {
        return this.f26268a.getContentType();
    }

    @Override // p023b4.d
    public String Y2() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f26268a.getURL() + ". Failed with " + this.f26268a.getResponseCode() + "\n" + a(this.f26268a);
        } catch (IOException | NullPointerException e10) {
            g.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26268a.disconnect();
    }

    @Override // p023b4.d
    public InputStream i1() {
        return this.f26268a.getInputStream();
    }

    @Override // p023b4.d
    public boolean isSuccessful() {
        try {
            return this.f26268a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
