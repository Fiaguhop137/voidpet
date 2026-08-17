package p455z5;

import Q5.c;
import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025b6.f;
import p025b6.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p437y5.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f58472e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f58473f = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f58476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4.a f58477d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Z4.a c(Z4.a aVar) {
            f fVarQ2 = f.q2(aVar, o.f26315d, 0);
            Intrinsics.checkNotNullExpressionValue(fVarQ2, "of(...)");
            return Z4.a.s(fVarQ2);
        }

        public final Z4.a b(Z4.a aVar) {
            try {
                if (Z4.a.r(aVar)) {
                    Intrinsics.c(aVar);
                    if (aVar.m() instanceof f) {
                        Object objM = aVar.m();
                        Intrinsics.d(objM, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((f) objM).l0();
                    }
                }
                return null;
            } finally {
                Z4.a.g(aVar);
            }
        }
    }

    public b(c animatedFrameCache, boolean z10) {
        Intrinsics.checkNotNullParameter(animatedFrameCache, "animatedFrameCache");
        this.f58474a = animatedFrameCache;
        this.f58475b = z10;
        this.f58476c = new SparseArray();
    }

    private final synchronized void f(int i10) {
        Z4.a aVar = (Z4.a) this.f58476c.get(i10);
        if (aVar != null) {
            this.f58476c.delete(i10);
            Z4.a.g(aVar);
            W4.a.z(f58473f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f58476c);
        }
    }

    @Override // p437y5.b
    public synchronized boolean S(int i10) {
        return this.f58474a.b(i10);
    }

    @Override // p437y5.b
    public synchronized void a(int i10, Z4.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        f(i10);
        Z4.a aVarC = null;
        try {
            aVarC = f58472e.c(bitmapReference);
            if (aVarC != null) {
                Z4.a.g(this.f58477d);
                this.f58477d = this.f58474a.a(i10, aVarC);
            }
            Z4.a.g(aVarC);
        } catch (Throwable th) {
            Z4.a.g(aVarC);
            throw th;
        }
    }

    @Override // p437y5.b
    public synchronized Z4.a b(int i10) {
        return f58472e.b(Z4.a.e(this.f58477d));
    }

    @Override // p437y5.b
    public synchronized void c(int i10, Z4.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        try {
            Z4.a aVarC = f58472e.c(bitmapReference);
            if (aVarC == null) {
                Z4.a.g(aVarC);
                return;
            }
            Z4.a aVarA = this.f58474a.a(i10, aVarC);
            if (Z4.a.r(aVarA)) {
                Z4.a.g((Z4.a) this.f58476c.get(i10));
                this.f58476c.put(i10, aVarA);
                W4.a.z(f58473f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f58476c);
            }
            Z4.a.g(aVarC);
        } catch (Throwable th) {
            Z4.a.g(null);
            throw th;
        }
    }

    @Override // p437y5.b
    public synchronized void clear() {
        try {
            Z4.a.g(this.f58477d);
            this.f58477d = null;
            int size = this.f58476c.size();
            for (int i10 = 0; i10 < size; i10++) {
                Z4.a.g((Z4.a) this.f58476c.valueAt(i10));
            }
            this.f58476c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p437y5.b
    public synchronized Z4.a d(int i10, int i11, int i12) {
        if (!this.f58475b) {
            return null;
        }
        return f58472e.b(this.f58474a.d());
    }

    @Override // p437y5.b
    public synchronized Z4.a e(int i10) {
        return f58472e.b(this.f58474a.c(i10));
    }
}
