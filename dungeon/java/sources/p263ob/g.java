package p263ob;

import Ad.AbstractC0793c;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50531a;

    public g(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f50531a = category;
    }

    @Override // p263ob.a
    public void a(c type, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        if (h.f50532a) {
            int iA = c.f50513b.a(type);
            if (iA == 3) {
                Log.d(this.f50531a, message, th);
                return;
            }
            if (iA == 4) {
                Log.i(this.f50531a, message, th);
                return;
            }
            if (iA == 5) {
                Log.w(this.f50531a, message, th);
                return;
            } else if (iA == 6) {
                Log.e(this.f50531a, message, th);
                return;
            } else {
                if (iA != 7) {
                    return;
                }
                Log.e(this.f50531a, message, th);
                return;
            }
        }
        System.out.println((Object) ("[" + type.g() + "] " + this.f50531a + "\t" + message));
        if (th != null) {
            System.out.println((Object) (f.a(th) + "\n" + AbstractC0793c.c(th)));
        }
    }
}
