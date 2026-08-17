package Q5;

import O5.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class a implements O5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R5.a f9466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f9467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O5.c f9468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f9469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f9470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f9471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O5.b[] f9473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f9474i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f9475j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f9477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f9478m;

    public a(R5.a aVar, e eVar, Rect rect, boolean z10) {
        this.f9466a = aVar;
        this.f9467b = eVar;
        O5.c cVarD = eVar.d();
        this.f9468c = cVarD;
        int[] iArrQ = cVarD.Q();
        this.f9470e = iArrQ;
        aVar.a(iArrQ);
        this.f9472g = aVar.c(iArrQ);
        this.f9471f = aVar.b(iArrQ);
        this.f9469d = m(cVarD, rect);
        this.f9476k = z10;
        this.f9473h = new O5.b[cVarD.a()];
        for (int i10 = 0; i10 < this.f9468c.a(); i10++) {
            this.f9473h[i10] = this.f9468c.c(i10);
        }
        Paint paint = new Paint();
        this.f9477l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void l() {
        Bitmap bitmap = this.f9478m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9478m = null;
        }
    }

    private static Rect m(O5.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private void n(Canvas canvas, float f10, float f11, O5.b bVar) {
        if (bVar.f8379g == O5.b.EnumC0142b.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(bVar.f8376d * f10);
            int iCeil2 = (int) Math.ceil(bVar.f8377e * f11);
            int iCeil3 = (int) Math.ceil(bVar.f8374b * f10);
            int iCeil4 = (int) Math.ceil(bVar.f8375c * f11);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f9477l);
        }
    }

    private synchronized Bitmap o(int i10, int i11) {
        try {
            Bitmap bitmap = this.f9478m;
            if (bitmap != null && (bitmap.getWidth() < i10 || this.f9478m.getHeight() < i11)) {
                l();
            }
            if (this.f9478m == null) {
                this.f9478m = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f9478m.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f9478m;
    }

    private void p(Canvas canvas, O5.d dVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.f9476k) {
            float fMax = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / fMax);
            height = (int) (dVar.getHeight() / fMax);
            iB = (int) (dVar.b() / fMax);
            iC = (int) (dVar.c() / fMax);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            iB = dVar.b();
            iC = dVar.c();
        }
        synchronized (this) {
            Bitmap bitmapO = o(width, height);
            this.f9478m = bitmapO;
            dVar.a(width, height, bitmapO);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.f9478m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void q(Canvas canvas, O5.d dVar) {
        double dWidth = ((double) this.f9469d.width()) / ((double) this.f9468c.getWidth());
        double dHeight = ((double) this.f9469d.height()) / ((double) this.f9468c.getHeight());
        int iRound = (int) Math.round(((double) dVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) dVar.getHeight()) * dHeight);
        int iB = (int) (((double) dVar.b()) * dWidth);
        int iC = (int) (((double) dVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f9469d.width();
                int iHeight = this.f9469d.height();
                o(iWidth, iHeight);
                Bitmap bitmap = this.f9478m;
                if (bitmap != null) {
                    dVar.a(iRound, iRound2, bitmap);
                }
                this.f9474i.set(0, 0, iWidth, iHeight);
                this.f9475j.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.f9478m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f9474i, this.f9475j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void r(Canvas canvas, O5.d dVar, O5.b bVar, O5.b bVar2) {
        Rect rect = this.f9469d;
        if (rect == null || rect.width() <= 0 || this.f9469d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f9469d.width();
        if (bVar2 != null) {
            n(canvas, width, width, bVar2);
        }
        int width2 = dVar.getWidth();
        int height = dVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i10 = (int) (width2 * width);
        int i11 = (int) (height * width);
        int iB = (int) (dVar.b() * width);
        int iC = (int) (dVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i10 + iB, i11 + iC);
        if (bVar.f8378f == O5.b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f9477l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height);
            dVar.a(width2, height, bitmapO);
            canvas.drawBitmap(bitmapO, rect2, rect3, (Paint) null);
        }
    }

    private void s(Canvas canvas, O5.d dVar, O5.b bVar, O5.b bVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int width = this.f9468c.getWidth();
        int height = this.f9468c.getHeight();
        float f14 = width;
        float f15 = height;
        int width2 = dVar.getWidth();
        int height2 = dVar.getHeight();
        int iB = dVar.b();
        int iC = dVar.c();
        if (f14 > canvas.getWidth() || f15 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f16 = f14 / f15;
            if (iMin > iMin2) {
                f11 = iMin;
                f10 = f11 / f16;
            } else {
                f10 = iMin2;
                f11 = f10 * f16;
            }
            f12 = f11 / f14;
            f13 = f10 / f15;
            width2 = (int) Math.ceil(dVar.getWidth() * f12);
            height2 = (int) Math.ceil(dVar.getHeight() * f13);
            iB = (int) Math.ceil(dVar.b() * f12);
            iC = (int) Math.ceil(dVar.c() * f13);
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (bVar2 != null) {
            n(canvas, f12, f13, bVar2);
        }
        if (bVar.f8378f == O5.b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f9477l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height2);
            dVar.a(width2, height2, bitmapO);
            canvas.drawBitmap(bitmapO, rect, rect2, (Paint) null);
        }
    }

    @Override // O5.a
    public int a() {
        return this.f9468c.a();
    }

    @Override // O5.a
    public int b() {
        return this.f9468c.b();
    }

    @Override // O5.a
    public O5.b c(int i10) {
        return this.f9473h[i10];
    }

    @Override // O5.a
    public int d() {
        return this.f9472g;
    }

    @Override // O5.a
    public void e(int i10, Canvas canvas) {
        O5.d dVarP = this.f9468c.P(i10);
        try {
            if (dVarP.getWidth() > 0 && dVarP.getHeight() > 0) {
                if (this.f9468c.N()) {
                    q(canvas, dVarP);
                } else {
                    p(canvas, dVarP);
                }
            }
        } finally {
            dVarP.dispose();
        }
    }

    @Override // O5.a
    public O5.a f(Rect rect) {
        return m(this.f9468c, rect).equals(this.f9469d) ? this : new a(this.f9466a, this.f9467b, rect, this.f9476k);
    }

    @Override // O5.a
    public int g(int i10) {
        return this.f9470e[i10];
    }

    @Override // O5.a
    public int getHeight() {
        return this.f9468c.getHeight();
    }

    @Override // O5.a
    public int getWidth() {
        return this.f9468c.getWidth();
    }

    @Override // O5.a
    public int h() {
        return this.f9469d.height();
    }

    @Override // O5.a
    public void i(int i10, Canvas canvas) {
        O5.d dVarP = this.f9468c.P(i10);
        O5.b bVarC = this.f9468c.c(i10);
        O5.b bVarC2 = i10 == 0 ? null : this.f9468c.c(i10 - 1);
        try {
            if (dVarP.getWidth() > 0 && dVarP.getHeight() > 0) {
                if (this.f9468c.N()) {
                    s(canvas, dVarP, bVarC, bVarC2);
                } else {
                    r(canvas, dVarP, bVarC, bVarC2);
                }
            }
        } finally {
            dVarP.dispose();
        }
    }

    @Override // O5.a
    public int j() {
        return this.f9469d.width();
    }

    @Override // O5.a
    public e k() {
        return this.f9467b;
    }
}
