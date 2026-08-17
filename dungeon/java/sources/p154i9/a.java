package p154i9;

import android.content.Context;
import android.graphics.Color;
import p020b1.AbstractC2044c;
import p243n9.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f43762f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f43767e;

    public a(Context context) {
        this(b.b(context, Y8.a.f17007x, false), p118g9.a.b(context, Y8.a.f17006w, 0), p118g9.a.b(context, Y8.a.f17005v, 0), p118g9.a.b(context, Y8.a.f17002s, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f43763a = z10;
        this.f43764b = i10;
        this.f43765c = i11;
        this.f43766d = i12;
        this.f43767e = f10;
    }

    private boolean e(int i10) {
        return AbstractC2044c.k(i10, 255) == this.f43766d;
    }

    public float a(float f10) {
        float f11 = this.f43767e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = p118g9.a.j(AbstractC2044c.k(i10, 255), this.f43764b, fA);
        if (fA > 0.0f && (i11 = this.f43765c) != 0) {
            iJ = p118g9.a.i(iJ, AbstractC2044c.k(i11, f43762f));
        }
        return AbstractC2044c.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f43763a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f43763a;
    }
}
