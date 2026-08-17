package p195kf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import p088ef.X0;

/* JADX INFO: loaded from: classes3.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f48133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f48134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X0[] f48135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48136d;

    public O(CoroutineContext coroutineContext, int i10) {
        this.f48133a = coroutineContext;
        this.f48134b = new Object[i10];
        this.f48135c = new X0[i10];
    }

    public final void a(X0 x10, Object obj) {
        Object[] objArr = this.f48134b;
        int i10 = this.f48136d;
        objArr[i10] = obj;
        X0[] x0Arr = this.f48135c;
        this.f48136d = i10 + 1;
        Intrinsics.d(x10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        x0Arr[i10] = x10;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f48135c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            X0 x10 = this.f48135c[length];
            Intrinsics.c(x10);
            x10.F(coroutineContext, this.f48134b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
