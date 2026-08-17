package p436y4;

import L4.k;
import L4.l;
import android.graphics.Bitmap;
import p310r4.r;
import p310r4.v;
import p328s4.d;

/* JADX INFO: loaded from: classes.dex */
public class f implements v, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f57888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f57889b;

    public f(Bitmap bitmap, d dVar) {
        this.f57888a = (Bitmap) k.e(bitmap, "Bitmap must not be null");
        this.f57889b = (d) k.e(dVar, "BitmapPool must not be null");
    }

    public static f d(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // p310r4.v
    public int a() {
        return l.i(this.f57888a);
    }

    @Override // p310r4.v
    public Class b() {
        return Bitmap.class;
    }

    @Override // p310r4.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f57888a;
    }

    @Override // p310r4.r
    public void initialize() {
        this.f57888a.prepareToDraw();
    }

    @Override // p310r4.v
    public void recycle() {
        this.f57889b.c(this.f57888a);
    }
}
