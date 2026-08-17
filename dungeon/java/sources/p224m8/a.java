package p224m8;

import android.util.Log;
import java.util.Locale;
import p170j8.C3845j;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3845j f49181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49182d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f49180b = string;
        this.f49179a = str;
        this.f49181c = new C3845j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f49179a, i10)) {
            i10++;
        }
        this.f49182d = i10;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f49179a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f49179a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f49180b.concat(str);
    }

    public boolean d(int i10) {
        return this.f49182d <= i10;
    }

    public void e(String str, Object... objArr) {
        Log.w(this.f49179a, c(str, objArr));
    }
}
