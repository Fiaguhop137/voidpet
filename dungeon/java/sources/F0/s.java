package F0;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f2894a = new s();

    private s() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.f2895a.a(context);
        }
        return 0;
    }
}
