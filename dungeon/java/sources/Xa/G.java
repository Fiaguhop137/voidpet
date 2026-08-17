package Xa;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Md.n f15575d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f15572a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f15573b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference f15574c = new AtomicReference("OpenIAP");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15576e = 8;

    public enum a {
        Debug,
        Info,
        Warn,
        Error;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15582f = Gd.a.a(e());
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15583a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Warn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15583a = iArr;
        }
    }

    private G() {
    }

    public static /* synthetic */ void e(G g10, String str, Throwable th, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        if ((i10 & 4) != 0) {
            str2 = g10.c();
        }
        g10.d(str, th, str2);
    }

    private final void j(a aVar, String str, Throwable th, String str2) {
        if (i()) {
            Md.n nVar = f15575d;
            if (nVar != null) {
                nVar.invoke(aVar, str, th);
                return;
            }
            int i10 = b.f15583a[aVar.ordinal()];
            if (i10 == 1) {
                Log.d(str2, str);
                return;
            }
            if (i10 == 2) {
                Log.i(str2, str);
            } else if (i10 == 3) {
                Log.w(str2, str);
            } else {
                if (i10 != 4) {
                    throw new Ad.n();
                }
                Log.e(str2, str, th);
            }
        }
    }

    public final void a(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        b(message, tag);
    }

    public final void b(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        j(a.Debug, message, null, tag);
    }

    public final String c() {
        Object obj = f15574c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (String) obj;
    }

    public final void d(String message, Throwable th, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        f(message, th, tag);
    }

    public final void f(String message, Throwable th, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        j(a.Error, message, th, tag);
    }

    public final void g(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        h(message, tag);
    }

    public final void h(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        j(a.Info, message, null, tag);
    }

    public final boolean i() {
        return f15573b.get();
    }

    public final void k(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        l(message, tag);
    }

    public final void l(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        j(a.Warn, message, null, tag);
    }
}
