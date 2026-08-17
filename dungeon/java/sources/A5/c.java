package A5;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.d f219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p437y5.c f220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f224f;

    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p419x5.a f225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p437y5.b f226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f229e;

        public a(c cVar, p419x5.a animationBackend, p437y5.b bitmapFrameCache, int i10, int i11) {
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            this.f229e = cVar;
            this.f225a = animationBackend;
            this.f226b = bitmapFrameCache;
            this.f227c = i10;
            this.f228d = i11;
        }

        private final boolean a(int i10, int i11) {
            Z4.a aVarD;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    aVarD = this.f226b.d(i10, this.f225a.e(), this.f225a.c());
                } else {
                    if (i11 != 2) {
                        Z4.a.g(null);
                        return false;
                    }
                    aVarD = this.f229e.f219a.b(this.f225a.e(), this.f225a.c(), this.f229e.f221c);
                    i12 = -1;
                }
                Z4.a aVar = aVarD;
                boolean zB = b(i10, aVar, i11);
                Z4.a.g(aVar);
                return (zB || i12 == -1) ? zB : a(i10, i12);
            } catch (RuntimeException e10) {
                W4.a.F(this.f229e.f223e, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                Z4.a.g(null);
            }
        }

        private final boolean b(int i10, Z4.a aVar, int i11) {
            if (Z4.a.r(aVar) && aVar != null) {
                p437y5.c cVar = this.f229e.f220b;
                Object objM = aVar.m();
                Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
                if (cVar.a(i10, (Bitmap) objM)) {
                    W4.a.y(this.f229e.f223e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f229e.f224f) {
                        this.f226b.c(i10, aVar, i11);
                        Unit unit = Unit.f48228a;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f226b.S(this.f227c)) {
                    W4.a.y(this.f229e.f223e, "Frame %d is cached already.", Integer.valueOf(this.f227c));
                    SparseArray sparseArray = this.f229e.f224f;
                    c cVar = this.f229e;
                    synchronized (sparseArray) {
                        cVar.f224f.remove(this.f228d);
                        Unit unit = Unit.f48228a;
                    }
                    return;
                }
                if (a(this.f227c, 1)) {
                    W4.a.y(this.f229e.f223e, "Prepared frame %d.", Integer.valueOf(this.f227c));
                } else {
                    W4.a.k(this.f229e.f223e, "Could not prepare frame %d.", Integer.valueOf(this.f227c));
                }
                SparseArray sparseArray2 = this.f229e.f224f;
                c cVar2 = this.f229e;
                synchronized (sparseArray2) {
                    cVar2.f224f.remove(this.f228d);
                    Unit unit2 = Unit.f48228a;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f229e.f224f;
                c cVar3 = this.f229e;
                synchronized (sparseArray3) {
                    cVar3.f224f.remove(this.f228d);
                    Unit unit3 = Unit.f48228a;
                    throw th;
                }
            }
        }
    }

    public c(T5.d platformBitmapFactory, p437y5.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f219a = platformBitmapFactory;
        this.f220b = bitmapFrameRenderer;
        this.f221c = bitmapConfig;
        this.f222d = executorService;
        this.f223e = c.class;
        this.f224f = new SparseArray();
    }

    private final int g(p419x5.a aVar, int i10) {
        return (aVar.hashCode() * 31) + i10;
    }

    @Override // A5.b
    public boolean a(p437y5.b bitmapFrameCache, p419x5.a animationBackend, int i10) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int iG = g(animationBackend, i10);
        synchronized (this.f224f) {
            try {
                try {
                    if (this.f224f.get(iG) != null) {
                        W4.a.y(this.f223e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                        return true;
                    }
                    if (bitmapFrameCache.S(i10)) {
                        W4.a.y(this.f223e, "Frame %d is cached already.", Integer.valueOf(i10));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, i10, iG);
                        this.f224f.put(iG, aVar);
                        this.f222d.execute(aVar);
                        Unit unit = Unit.f48228a;
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }
}
