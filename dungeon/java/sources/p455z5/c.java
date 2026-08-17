package p455z5;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p437y5.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58478c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58479a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z4.a f58480b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final synchronized void f() {
        Z4.a.g(this.f58480b);
        this.f58480b = null;
        this.f58479a = -1;
    }

    @Override // p437y5.b
    public synchronized boolean S(int i10) {
        return i10 == this.f58479a && Z4.a.r(this.f58480b);
    }

    @Override // p437y5.b
    public synchronized void a(int i10, Z4.a bitmapReference, int i11) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (this.f58480b != null) {
                Object objM = bitmapReference.m();
                Z4.a aVar = this.f58480b;
                if (Intrinsics.b(objM, aVar != null ? (Bitmap) aVar.m() : null)) {
                    return;
                }
            }
            Z4.a.g(this.f58480b);
            this.f58480b = Z4.a.e(bitmapReference);
            this.f58479a = i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p437y5.b
    public synchronized Z4.a b(int i10) {
        return Z4.a.e(this.f58480b);
    }

    @Override // p437y5.b
    public void c(int i10, Z4.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // p437y5.b
    public synchronized void clear() {
        f();
    }

    @Override // p437y5.b
    public synchronized Z4.a d(int i10, int i11, int i12) {
        Z4.a aVarE;
        try {
            aVarE = Z4.a.e(this.f58480b);
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
        return aVarE;
    }

    @Override // p437y5.b
    public synchronized Z4.a e(int i10) {
        return this.f58479a == i10 ? Z4.a.e(this.f58480b) : null;
    }
}
