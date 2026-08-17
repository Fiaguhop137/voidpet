package p329s5;

import I5.m;
import V4.k;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: s5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4166f extends AbstractC4161a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Drawable[] f53322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f53323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f53324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f53325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f53326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f53327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f53328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int[] f53329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int[] f53330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f53331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean[] f53332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f53333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f53334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f53335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f53336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f53337x;

    public C4166f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f53337x = true;
        k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f53322i = drawableArr;
        this.f53329p = new int[drawableArr.length];
        this.f53330q = new int[drawableArr.length];
        this.f53331r = 255;
        this.f53332s = new boolean[drawableArr.length];
        this.f53333t = 0;
        this.f53323j = z10;
        this.f53324k = z10 ? 255 : 0;
        this.f53325l = i10;
        t();
    }

    private void h(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f53333t++;
        if (this.f53337x) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f53333t--;
        drawable.draw(canvas);
    }

    private void q() {
        if (this.f53335v) {
            this.f53335v = false;
            m mVar = this.f53334u;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void r() {
        int i10;
        if (!this.f53335v && (i10 = this.f53325l) >= 0) {
            boolean[] zArr = this.f53332s;
            if (i10 < zArr.length && zArr[i10]) {
                this.f53335v = true;
                m mVar = this.f53334u;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f53336w && this.f53326m == 2 && this.f53332s[this.f53325l]) {
            m mVar = this.f53334u;
            if (mVar != null) {
                mVar.b();
            }
            this.f53336w = false;
        }
    }

    private void t() {
        this.f53326m = 2;
        Arrays.fill(this.f53329p, this.f53324k);
        this.f53329p[0] = 255;
        Arrays.fill(this.f53330q, this.f53324k);
        this.f53330q[0] = 255;
        Arrays.fill(this.f53332s, this.f53323j);
        this.f53332s[0] = true;
    }

    private boolean v(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f53322i.length; i10++) {
            boolean z11 = this.f53332s[i10];
            int i11 = z11 ? 1 : -1;
            int[] iArr = this.f53330q;
            int i12 = (int) (this.f53329p[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z11 && iArr[i10] < 255) {
                z10 = false;
            }
            if (!z11 && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zV;
        Drawable[] drawableArr;
        int i10 = this.f53326m;
        int i11 = 0;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                k.i(this.f53327n > 0);
                zV = v((o() - this.f53328o) / this.f53327n);
                this.f53326m = zV ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f53322i;
                if (i11 < drawableArr.length) {
                    break;
                }
                h(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f53330q[i11] * this.f53331r)) / 255.0d));
                i11++;
            }
            if (z10) {
                invalidateSelf();
            } else {
                q();
                s();
            }
        }
        System.arraycopy(this.f53330q, 0, this.f53329p, 0, this.f53322i.length);
        this.f53328o = o();
        zV = v(this.f53327n == 0 ? 1.0f : 0.0f);
        r();
        this.f53326m = zV ? 2 : 1;
        z10 = zV;
        while (true) {
            drawableArr = this.f53322i;
            if (i11 < drawableArr.length) {
                break;
                break;
            } else {
                h(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f53330q[i11] * this.f53331r)) / 255.0d));
                i11++;
            }
        }
        if (z10) {
            invalidateSelf();
        } else {
            q();
            s();
        }
    }

    public void g() {
        this.f53333t++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53331r;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f53333t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f53333t--;
        invalidateSelf();
    }

    public void k() {
        this.f53326m = 0;
        Arrays.fill(this.f53332s, true);
        invalidateSelf();
    }

    public void l(int i10) {
        this.f53326m = 0;
        this.f53332s[i10] = true;
        invalidateSelf();
    }

    public void m(int i10) {
        this.f53326m = 0;
        this.f53332s[i10] = false;
        invalidateSelf();
    }

    public void n() {
        this.f53326m = 2;
        for (int i10 = 0; i10 < this.f53322i.length; i10++) {
            this.f53330q[i10] = this.f53332s[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long o() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f53331r != i10) {
            this.f53331r = i10;
            invalidateSelf();
        }
    }

    public void u(int i10) {
        this.f53327n = i10;
        if (this.f53326m == 1) {
            this.f53326m = 0;
        }
    }
}
