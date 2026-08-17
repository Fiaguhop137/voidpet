package N0;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7167a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th = null;
            }
            aVar.b(str, th);
        }

        public final void a(String str, Throwable th) {
            Log.e("PreviewLogger", str, th);
        }

        public final void b(String str, Throwable th) {
            Log.w("PreviewLogger", str, th);
        }
    }
}
