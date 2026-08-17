package p348t6;

import Ad.n;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f54520a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54521a;

        static {
            int[] iArr = new int[p348t6.a.values().length];
            try {
                iArr[p348t6.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p348t6.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54521a = iArr;
        }
    }

    private b() {
    }

    public static final void a(String name, p348t6.a logLevel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        if (p384v6.a.f56281f) {
            f54520a.c(name, logLevel);
        }
    }

    public static /* synthetic */ void b(String str, p348t6.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = p348t6.a.WARNING;
        }
        a(str, aVar);
    }

    private final void c(String str, p348t6.a aVar) {
        if (p384v6.a.f56277b) {
            int i10 = a.f54521a[aVar.ordinal()];
            if (i10 == 1) {
                throw new AssertionException(str + " is being executed when app is fully running on the NEW Architecture.");
            }
            if (i10 != 2) {
                throw new n();
            }
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new ReactNoCrashSoftException(str + " is being executed when app is fully running on the NEW Architecture."));
        }
    }
}
