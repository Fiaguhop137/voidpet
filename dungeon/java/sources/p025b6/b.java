package p025b6;

import V4.k;
import Z4.a;
import Z4.h;
import android.graphics.Bitmap;
import p222m6.c;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f26286i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f26287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f26288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f26289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26291h;

    protected b(a aVar, p pVar, int i10, int i11) {
        a aVar2 = (a) k.g(aVar.d());
        this.f26287d = aVar2;
        this.f26288e = (Bitmap) aVar2.m();
        this.f26289f = pVar;
        this.f26290g = i10;
        this.f26291h = i11;
    }

    protected b(Bitmap bitmap, h hVar, p pVar, int i10, int i11) {
        this.f26288e = (Bitmap) k.g(bitmap);
        this.f26287d = a.x(this.f26288e, (h) k.g(hVar));
        this.f26289f = pVar;
        this.f26290g = i10;
        this.f26291h = i11;
    }

    private synchronized a s() {
        a aVar;
        aVar = this.f26287d;
        this.f26287d = null;
        this.f26288e = null;
        return aVar;
    }

    private static int t(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int u(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean x() {
        return f26286i;
    }

    @Override // p025b6.f
    public int A2() {
        return this.f26290g;
    }

    @Override // p025b6.e
    public int M() {
        return c.j(this.f26288e);
    }

    @Override // p025b6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVarS = s();
        if (aVarS != null) {
            aVarS.close();
        }
    }

    @Override // p025b6.a, p025b6.e
    public p d3() {
        return this.f26289f;
    }

    @Override // p025b6.f
    public int f2() {
        return this.f26291h;
    }

    @Override // p025b6.e, p025b6.m
    public int getHeight() {
        int i10;
        return (this.f26290g % 180 != 0 || (i10 = this.f26291h) == 5 || i10 == 7) ? u(this.f26288e) : t(this.f26288e);
    }

    @Override // p025b6.e, p025b6.m
    public int getWidth() {
        int i10;
        return (this.f26290g % 180 != 0 || (i10 = this.f26291h) == 5 || i10 == 7) ? t(this.f26288e) : u(this.f26288e);
    }

    @Override // p025b6.e
    public synchronized boolean isClosed() {
        return this.f26287d == null;
    }

    @Override // p025b6.f
    public synchronized a l0() {
        return a.e(this.f26287d);
    }

    @Override // p025b6.d
    public Bitmap n3() {
        return this.f26288e;
    }
}
