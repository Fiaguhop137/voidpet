package M3;

import N4.f;
import N4.g;
import android.graphics.Canvas;
import p435y3.n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f6797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f6798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6800d;

    public e(g gVar, f fVar, int i10, int i11) {
        this.f6797a = gVar;
        this.f6798b = fVar;
        this.f6799c = i10;
        this.f6800d = i11;
    }

    @Override // p435y3.n
    public long a() {
        return 2048L;
    }

    @Override // p435y3.n
    public boolean b() {
        return true;
    }

    @Override // p435y3.n
    public void c(Canvas canvas) {
        this.f6797a.o(canvas, this.f6798b);
    }

    @Override // p435y3.n
    public int getHeight() {
        return this.f6800d;
    }

    @Override // p435y3.n
    public int getWidth() {
        return this.f6799c;
    }
}
