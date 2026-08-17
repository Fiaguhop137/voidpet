package Db;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.enums.ContentFit;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements I4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f2374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ContentFit f2382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private H4.c f2383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y f2384k;

    public r(WeakReference imageViewHolder) {
        Intrinsics.checkNotNullParameter(imageViewHolder, "imageViewHolder");
        this.f2374a = imageViewHolder;
        this.f2377d = -1;
        this.f2378e = -1;
        this.f2379f = -1;
        this.f2380g = -1;
        this.f2381h = -1;
        this.f2384k = new y(imageViewHolder);
    }

    private final void h() {
        synchronized (this) {
            if (this.f2381h >= 0) {
                B b10 = B.f2255a;
                String strC = b10.c();
                String strA = b10.a();
                p381v3.a.d("[" + strC + "] " + strA, this.f2381h);
                this.f2381h = -1;
            }
            Unit unit = Unit.f48228a;
        }
    }

    public final void A(int i10) {
        this.f2377d = i10;
    }

    public final void B(int i10) {
        this.f2378e = i10;
    }

    public final void C(boolean z10) {
        this.f2376c = z10;
    }

    @Override // E4.l
    public void a() {
    }

    @Override // I4.d
    public H4.c b() {
        return this.f2383j;
    }

    @Override // E4.l
    public void c() {
    }

    @Override // E4.l
    public void d() {
    }

    @Override // I4.d
    public void e(I4.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        if (this.f2374a.get() == null) {
            cb2.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            this.f2384k.e(cb2);
        }
    }

    public final void f(com.bumptech.glide.l requestManager) {
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        this.f2384k.d();
        requestManager.p(this);
    }

    @Override // I4.d
    public void g(H4.c cVar) {
        this.f2383j = cVar;
    }

    @Override // I4.d
    public void i(Drawable drawable) {
    }

    @Override // I4.d
    public void j(Drawable drawable) {
    }

    @Override // I4.d
    public void k(I4.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f2384k.l(cb2);
    }

    @Override // I4.d
    public void l(Drawable drawable) {
        h();
    }

    public final boolean n() {
        return this.f2375b;
    }

    public final ContentFit o() {
        return this.f2382i;
    }

    public final int p() {
        return this.f2379f;
    }

    public final int q() {
        return this.f2380g;
    }

    public final int r() {
        return this.f2377d;
    }

    public final int s() {
        return this.f2378e;
    }

    public final boolean t() {
        return this.f2376c;
    }

    @Override // I4.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(Drawable resource, J4.b bVar) {
        H4.c cVarB;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Object obj = this.f2374a.get();
        if (obj == null) {
            h();
            Log.w("ExpoImage", "The `ExpoImageViewWrapper` was deallocated, but the target wasn't canceled in time.");
            return;
        }
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) obj;
        H4.c cVar = this.f2383j;
        boolean z10 = false;
        if (cVar instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = cVar instanceof ThumbnailRequestCoordinator ? (ThumbnailRequestCoordinator) cVar : null;
            if (thumbnailRequestCoordinator != null && (cVarB = A.b(thumbnailRequestCoordinator)) != null && !cVarB.isComplete()) {
                z10 = true;
            }
        }
        if (!z10) {
            h();
        }
        expoImageViewWrapper.onResourceReady(this, resource, z10);
    }

    public final void v(int i10) {
        h();
        synchronized (this) {
            this.f2381h = i10;
            Unit unit = Unit.f48228a;
        }
    }

    public final void w(boolean z10) {
        this.f2375b = z10;
    }

    public final void x(ContentFit contentFit) {
        this.f2382i = contentFit;
    }

    public final void y(int i10) {
        this.f2379f = i10;
    }

    public final void z(int i10) {
        this.f2380g = i10;
    }
}
