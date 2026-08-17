package p077e4;

import R3.AbstractC1358e;
import R3.Q;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f40367a = new HashSet();

    @Override // R3.Q
    public void a(String str) {
        d(str, null);
    }

    @Override // R3.Q
    public void b(String str, Throwable th) {
        if (AbstractC1358e.f10773a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // R3.Q
    public void c(String str) {
        e(str, null);
    }

    @Override // R3.Q
    public void d(String str, Throwable th) {
        Set set = f40367a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    public void e(String str, Throwable th) {
        if (AbstractC1358e.f10773a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
