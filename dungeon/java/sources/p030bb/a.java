package p030bb;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: bb.a$a, reason: collision with other inner class name */
    public static final class C0347a {
        public static /* synthetic */ void a(a aVar, Activity activity, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMenu");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            aVar.a(activity, str);
        }
    }

    void a(Activity activity, String str);
}
