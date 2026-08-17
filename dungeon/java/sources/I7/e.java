package I7;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5068c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(J7.a aVar) {
    }

    final void c(J7.a aVar) throws IOException {
        int iAvailable = aVar.available();
        b(aVar);
        int iAvailable2 = iAvailable - aVar.available();
        int i10 = this.f5067b;
        int i11 = i10 + (i10 & 1);
        if (iAvailable2 > i11) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i11) {
            aVar.skip(i11 - iAvailable2);
        }
    }
}
