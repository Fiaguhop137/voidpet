package p339sf;

import If.C1109k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J {
    public abstract void a(I i10, int i11, String str);

    public void b(I webSocket, int i10, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void c(I i10, Throwable th, E e10);

    public void d(I webSocket, C1109k bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public abstract void e(I i10, String str);

    public abstract void f(I i10, E e10);
}
