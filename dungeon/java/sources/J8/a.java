package J8;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5751a;

    static {
        f5751a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
