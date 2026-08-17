package Q5;

import O5.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O5.a f9486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f9488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9489d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9490a;

        static {
            int[] iArr = new int[c.values().length];
            f9490a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9490a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9490a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9490a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a(int i10, Bitmap bitmap);

        Z4.a b(int i10);
    }

    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(O5.a aVar, boolean z10, b bVar) {
        this.f9486a = aVar;
        this.f9487b = bVar;
        this.f9489d = z10;
        Paint paint = new Paint();
        this.f9488c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, O5.b bVar) {
        int i10 = bVar.f8374b;
        int i11 = bVar.f8375c;
        canvas.drawRect(i10, i11, i10 + bVar.f8376d, i11 + bVar.f8377e, this.f9488c);
    }

    private c b(int i10) {
        O5.b bVarC = this.f9486a.c(i10);
        O5.b.EnumC0142b enumC0142b = bVarC.f8379g;
        if (enumC0142b == O5.b.EnumC0142b.DISPOSE_DO_NOT) {
            return c.REQUIRED;
        }
        if (enumC0142b == O5.b.EnumC0142b.DISPOSE_TO_BACKGROUND) {
            return c(bVarC) ? c.NOT_REQUIRED : c.REQUIRED;
        }
        return enumC0142b == O5.b.EnumC0142b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(O5.b bVar) {
        return bVar.f8374b == 0 && bVar.f8375c == 0 && bVar.f8376d == this.f9486a.j() && bVar.f8377e == this.f9486a.h();
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        O5.b bVarC = this.f9486a.c(i10);
        O5.b bVarC2 = this.f9486a.c(i10 - 1);
        if (bVarC.f8378f == O5.b.a.NO_BLEND && c(bVarC)) {
            return true;
        }
        return bVarC2.f8379g == O5.b.EnumC0142b.DISPOSE_TO_BACKGROUND && c(bVarC2);
    }

    private void e(Bitmap bitmap) {
        e eVarK = this.f9486a.k();
        if (eVarK == null) {
            return;
        }
        eVarK.c();
    }

    private int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f9490a[b(i10).ordinal()];
            if (i11 == 1) {
                O5.b bVarC = this.f9486a.c(i10);
                Z4.a aVarB = this.f9487b.b(i10);
                if (aVarB != null) {
                    try {
                        canvas.drawBitmap((Bitmap) aVarB.m(), 0.0f, 0.0f, (Paint) null);
                        if (bVarC.f8379g == O5.b.EnumC0142b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, bVarC);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f9489d) {
                            aVarB.close();
                        }
                    }
                }
                if (d(i10)) {
                    return i10;
                }
                i10--;
            } else {
                if (i11 == 2) {
                    return i10 + 1;
                }
                if (i11 == 3) {
                    return i10;
                }
                i10--;
            }
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f9486a.i(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        if (this.f9489d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iF = !d(i10) ? f(i10 - 1, canvas) : i10; iF < i10; iF++) {
            O5.b bVarC = this.f9486a.c(iF);
            O5.b.EnumC0142b enumC0142b = bVarC.f8379g;
            if (enumC0142b != O5.b.EnumC0142b.DISPOSE_TO_PREVIOUS) {
                if (bVarC.f8378f == O5.b.a.NO_BLEND) {
                    a(canvas, bVarC);
                }
                this.f9486a.e(iF, canvas);
                this.f9487b.a(iF, bitmap);
                if (enumC0142b == O5.b.EnumC0142b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, bVarC);
                }
            }
        }
        O5.b bVarC2 = this.f9486a.c(i10);
        if (bVarC2.f8378f == O5.b.a.NO_BLEND) {
            a(canvas, bVarC2);
        }
        this.f9486a.e(i10, canvas);
        e(bitmap);
    }
}
