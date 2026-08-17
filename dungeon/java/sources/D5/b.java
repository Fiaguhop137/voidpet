package D5;

import Q5.d;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p437y5.c;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2149f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class f2150g = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p437y5.b f2151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O5.a f2152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f2154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f2155e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: D5.b$b, reason: collision with other inner class name */
    public static final class C0045b implements d.b {
        C0045b() {
        }

        @Override // Q5.d.b
        public void a(int i10, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // Q5.d.b
        public Z4.a b(int i10) {
            return b.this.f2151a.e(i10);
        }
    }

    public b(p437y5.b bitmapFrameCache, O5.a animatedDrawableBackend, boolean z10) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f2151a = bitmapFrameCache;
        this.f2152b = animatedDrawableBackend;
        this.f2153c = z10;
        C0045b c0045b = new C0045b();
        this.f2155e = c0045b;
        this.f2154d = new d(this.f2152b, z10, c0045b);
    }

    @Override // p437y5.c
    public boolean a(int i10, Bitmap targetBitmap) {
        Intrinsics.checkNotNullParameter(targetBitmap, "targetBitmap");
        try {
            this.f2154d.h(i10, targetBitmap);
            return true;
        } catch (IllegalStateException e10) {
            W4.a.l(f2150g, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // p437y5.c
    public int c() {
        return this.f2152b.getHeight();
    }

    @Override // p437y5.c
    public void d(Rect rect) {
        O5.a aVarF = this.f2152b.f(rect);
        Intrinsics.checkNotNullExpressionValue(aVarF, "forNewBounds(...)");
        if (aVarF != this.f2152b) {
            this.f2152b = aVarF;
            this.f2154d = new d(aVarF, this.f2153c, this.f2155e);
        }
    }

    @Override // p437y5.c
    public int e() {
        return this.f2152b.getWidth();
    }
}
