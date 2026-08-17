package E1;

import android.text.Editable;
import androidx.emoji2.text.o;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f2617a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f2618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f2619c;

    private b() {
        try {
            f2619c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f2618b == null) {
            synchronized (f2617a) {
                try {
                    if (f2618b == null) {
                        f2618b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2618b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f2619c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
