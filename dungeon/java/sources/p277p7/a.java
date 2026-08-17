package p277p7;

import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f50847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50848b;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f50847a = new String[i10];
        this.f50848b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f50847a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append("\n");
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.f50847a;
        int i10 = this.f50848b;
        strArr[i10 % strArr.length] = str;
        this.f50848b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f50848b);
            sb2.append(" base apk paths.");
            if (this.f50848b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f50847a;
                if (i10 < strArr.length) {
                    int i11 = (this.f50848b - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb2.append("\n");
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f50848b;
    }
}
