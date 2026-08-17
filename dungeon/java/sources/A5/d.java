package A5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f231b = d.class;

    public d(int i10) {
        this.f230a = i10;
    }

    @Override // A5.a
    public void a() {
        a.C0004a.c(this);
    }

    @Override // A5.a
    public void b(int i10, int i11, Function0 function0) {
        a.C0004a.d(this, i10, i11, function0);
    }

    @Override // A5.a
    public Z4.a c(int i10, int i11, int i12) {
        return a.C0004a.b(this, i10, i11, i12);
    }

    @Override // A5.a
    public void d() {
        a.C0004a.a(this);
    }

    @Override // A5.a
    public void e(b bitmapFramePreparer, p437y5.b bitmapFrameCache, p419x5.a animationBackend, int i10, Function0 function0) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i11 = this.f230a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iA = (i10 + i12) % animationBackend.a();
                if (W4.a.w(2)) {
                    W4.a.z(this.f231b, "Preparing frame %d, last drawn: %d", Integer.valueOf(iA), Integer.valueOf(i10));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, iA)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
