package p079e6;

import V4.k;
import Z4.h;
import android.graphics.Bitmap;
import p222m6.c;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f40493e;

    class a implements h {
        a() {
        }

        @Override // Z4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public g(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f40491c = i10;
        this.f40492d = i11;
        this.f40493e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iJ = c.j(bitmap);
        k.c(this.f40489a > 0, "No bitmaps registered.");
        long j10 = iJ;
        k.d(j10 <= this.f40490b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iJ), Long.valueOf(this.f40490b));
        this.f40490b -= j10;
        this.f40489a--;
    }

    public synchronized int b() {
        return this.f40489a;
    }

    public synchronized int c() {
        return this.f40491c;
    }

    public synchronized int d() {
        return this.f40492d;
    }

    public h e() {
        return this.f40493e;
    }

    public synchronized long f() {
        return this.f40490b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iJ = c.j(bitmap);
        int i10 = this.f40489a;
        if (i10 < this.f40491c) {
            long j10 = this.f40490b;
            long j11 = iJ;
            if (j10 + j11 <= this.f40492d) {
                this.f40489a = i10 + 1;
                this.f40490b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
