package p195kf;

import Ad.q;
import Ad.r;
import p000a.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f48122a = new a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f48123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48124c;

    static {
        Object objB;
        Object objB2;
        try {
            q.a aVar = q.f327b;
            objB = q.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            q.a aVar2 = q.f327b;
            objB = q.b(r.a(th));
        }
        if (q.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f48123b = (String) objB;
        try {
            objB2 = q.b(C.class.getCanonicalName());
        } catch (Throwable th2) {
            q.a aVar3 = q.f327b;
            objB2 = q.b(r.a(th2));
        }
        if (q.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f48124c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
