package p079e6;

import Y4.d;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final A f40517a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f40520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40521e;

    public t(int i10, int i11, F f10, d dVar) {
        this.f40518b = i10;
        this.f40519c = i11;
        this.f40520d = f10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap h(int i10) {
        this.f40520d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i10) {
        Bitmap bitmap;
        while (this.f40521e > i10 && (bitmap = (Bitmap) this.f40517a.pop()) != null) {
            int iA = this.f40517a.a(bitmap);
            this.f40521e -= iA;
            this.f40520d.b(iA);
        }
    }

    @Override // Y4.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f40521e;
            int i12 = this.f40518b;
            if (i11 > i12) {
                k(i12);
            }
            Bitmap bitmap = (Bitmap) this.f40517a.get(i10);
            if (bitmap == null) {
                return h(i10);
            }
            int iA = this.f40517a.a(bitmap);
            this.f40521e -= iA;
            this.f40520d.e(iA);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Y4.f, Z4.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.f40517a.a(bitmap);
        if (iA <= this.f40519c) {
            this.f40520d.c(iA);
            this.f40517a.put(bitmap);
            synchronized (this) {
                this.f40521e += iA;
            }
        }
    }
}
