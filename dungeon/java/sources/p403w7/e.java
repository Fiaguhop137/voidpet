package p403w7;

import android.text.TextUtils;
import java.io.IOException;
import p421x7.a;

/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f56650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f56651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f56652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f56653d;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(a aVar) {
    }

    void c(a aVar) throws IOException {
        int iAvailable = aVar.available();
        b(aVar);
        int iAvailable2 = iAvailable - aVar.available();
        int i10 = this.f56650a;
        if (iAvailable2 > i10) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i10) {
            aVar.skip(i10 - iAvailable2);
        }
    }
}
