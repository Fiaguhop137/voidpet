package p435y3;

import Q3.AbstractC1336b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4352a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f57783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57784b;

    public C4352a(Bitmap bitmap, boolean z10) {
        this.f57783a = bitmap;
        this.f57784b = z10;
    }

    @Override // p435y3.n
    public long a() {
        return AbstractC1336b.a(this.f57783a);
    }

    @Override // p435y3.n
    public boolean b() {
        return this.f57784b;
    }

    @Override // p435y3.n
    public void c(Canvas canvas) {
        canvas.drawBitmap(this.f57783a, 0.0f, 0.0f, (Paint) null);
    }

    public final Bitmap d() {
        return this.f57783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4352a)) {
            return false;
        }
        C4352a c4352a = (C4352a) obj;
        return Intrinsics.b(this.f57783a, c4352a.f57783a) && this.f57784b == c4352a.f57784b;
    }

    @Override // p435y3.n
    public int getHeight() {
        return this.f57783a.getHeight();
    }

    @Override // p435y3.n
    public int getWidth() {
        return this.f57783a.getWidth();
    }

    public int hashCode() {
        return (this.f57783a.hashCode() * 31) + Boolean.hashCode(this.f57784b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f57783a + ", shareable=" + this.f57784b + ')';
    }
}
