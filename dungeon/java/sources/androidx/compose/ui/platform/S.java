package androidx.compose.ui.platform;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
