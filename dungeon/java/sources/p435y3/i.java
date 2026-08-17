package p435y3;

import Q3.F;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f57804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57805b;

    public i(Drawable drawable, boolean z10) {
        this.f57804a = drawable;
        this.f57805b = z10;
    }

    @Override // p435y3.n
    public long a() {
        return e.f(((long) F.f(this.f57804a)) * 4 * ((long) F.b(this.f57804a)), 0L);
    }

    @Override // p435y3.n
    public boolean b() {
        return this.f57805b;
    }

    @Override // p435y3.n
    public void c(Canvas canvas) {
        this.f57804a.draw(canvas);
    }

    public final Drawable d() {
        return this.f57804a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.b(this.f57804a, iVar.f57804a) && this.f57805b == iVar.f57805b;
    }

    @Override // p435y3.n
    public int getHeight() {
        return F.b(this.f57804a);
    }

    @Override // p435y3.n
    public int getWidth() {
        return F.f(this.f57804a);
    }

    public int hashCode() {
        return (this.f57804a.hashCode() * 31) + Boolean.hashCode(this.f57805b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f57804a + ", shareable=" + this.f57805b + ')';
    }
}
