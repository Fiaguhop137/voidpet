package p026b7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.H;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p080e7.c;
import p080e7.e;
import p080e7.k;
import p080e7.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f26323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f26324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f26327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Path f26328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f26329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f26330l;

    public a(Context context, e eVar, c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26319a = context;
        this.f26320b = eVar;
        this.f26321c = cVar;
        this.f26322d = 0.8f;
        this.f26325g = true;
        this.f26327i = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f26326h);
        this.f26330l = paint;
    }

    private final RectF a() {
        float fB;
        float fB2;
        float fB3;
        c cVar = this.f26321c;
        RectF rectFA = cVar != null ? cVar.a(getLayoutDirection(), this.f26319a) : null;
        float fB4 = 0.0f;
        if (rectFA != null) {
            fB = H.f30189a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        if (rectFA != null) {
            fB2 = H.f30189a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        if (rectFA != null) {
            fB3 = H.f30189a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        if (rectFA != null) {
            fB4 = H.f30189a.b(rectFA.bottom);
        }
        return new RectF(fB, fB2, fB3, fB4);
    }

    private final Shader c() {
        List<p080e7.a> list = this.f26329k;
        Shader composeShader = null;
        if (list != null) {
            for (p080e7.a aVar : list) {
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                Shader shaderA = aVar.a(bounds);
                composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    private final void h() {
        k kVarD;
        boolean z10;
        Path path;
        l lVarA;
        l lVarA2;
        l lVarB;
        l lVarB2;
        l lVarD;
        l lVarD2;
        l lVarC;
        l lVarC2;
        e eVar;
        k kVar;
        if (this.f26325g) {
            this.f26325g = false;
            this.f26327i.set(getBounds());
            this.f26323e = a();
            e eVar2 = this.f26320b;
            if (eVar2 != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f26319a;
                H h10 = H.f30189a;
                kVarD = eVar2.d(layoutDirection, context, h10.f(getBounds().width()), h10.f(getBounds().height()));
            } else {
                kVarD = null;
            }
            this.f26324f = kVarD;
            RectF rectF = this.f26323e;
            float fB = 0.0f;
            if (Intrinsics.a(rectF != null ? Float.valueOf(rectF.left) : null, 0.0f)) {
                RectF rectF2 = this.f26323e;
                if (Intrinsics.a(rectF2 != null ? Float.valueOf(rectF2.top) : null, 0.0f)) {
                    RectF rectF3 = this.f26323e;
                    if (Intrinsics.a(rectF3 != null ? Float.valueOf(rectF3.right) : null, 0.0f)) {
                        RectF rectF4 = this.f26323e;
                        if (Intrinsics.a(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, 0.0f)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            k kVar2 = this.f26324f;
            if (kVar2 != null && kVar2.e() && (kVar = this.f26324f) != null && !kVar.f()) {
                Path path2 = this.f26328j;
                if (path2 == null) {
                    path2 = new Path();
                }
                this.f26328j = path2;
                path2.reset();
            }
            if (z10 && (eVar = this.f26320b) != null && eVar.c()) {
                RectF rectF5 = this.f26327i;
                float f10 = rectF5.left;
                float f11 = this.f26322d;
                rectF5.left = f10 + f11;
                rectF5.top += f11;
                rectF5.right -= f11;
                rectF5.bottom -= f11;
            }
            e eVar3 = this.f26320b;
            if (eVar3 == null || !eVar3.c()) {
                return;
            }
            k kVar3 = this.f26324f;
            if ((kVar3 == null || !kVar3.f()) && (path = this.f26328j) != null) {
                RectF rectF6 = this.f26327i;
                k kVar4 = this.f26324f;
                float fB2 = (kVar4 == null || (lVarC2 = kVar4.c()) == null) ? 0.0f : H.f30189a.b(lVarC2.a());
                k kVar5 = this.f26324f;
                float fB3 = (kVar5 == null || (lVarC = kVar5.c()) == null) ? 0.0f : H.f30189a.b(lVarC.b());
                k kVar6 = this.f26324f;
                float fB4 = (kVar6 == null || (lVarD2 = kVar6.d()) == null) ? 0.0f : H.f30189a.b(lVarD2.a());
                k kVar7 = this.f26324f;
                float fB5 = (kVar7 == null || (lVarD = kVar7.d()) == null) ? 0.0f : H.f30189a.b(lVarD.b());
                k kVar8 = this.f26324f;
                float fB6 = (kVar8 == null || (lVarB2 = kVar8.b()) == null) ? 0.0f : H.f30189a.b(lVarB2.a());
                k kVar9 = this.f26324f;
                float fB7 = (kVar9 == null || (lVarB = kVar9.b()) == null) ? 0.0f : H.f30189a.b(lVarB.b());
                k kVar10 = this.f26324f;
                float fB8 = (kVar10 == null || (lVarA2 = kVar10.a()) == null) ? 0.0f : H.f30189a.b(lVarA2.a());
                k kVar11 = this.f26324f;
                if (kVar11 != null && (lVarA = kVar11.a()) != null) {
                    fB = H.f30189a.b(lVarA.b());
                }
                path.addRoundRect(rectF6, new float[]{fB2, fB3, fB4, fB5, fB6, fB7, fB8, fB}, Path.Direction.CW);
            }
        }
    }

    public final int b() {
        return this.f26326h;
    }

    public final void d(int i10) {
        if (this.f26326h != i10) {
            this.f26326h = i10;
            this.f26330l.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        e eVar;
        l lVarC;
        l lVarC2;
        e eVar2;
        l lVarC3;
        l lVarC4;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        h();
        canvas.save();
        float fB = 0.0f;
        if (this.f26330l.getAlpha() != 0) {
            k kVar = this.f26324f;
            if (kVar == null || !kVar.f() || (eVar2 = this.f26320b) == null || !eVar2.c()) {
                e eVar3 = this.f26320b;
                if (eVar3 == null || !eVar3.c()) {
                    canvas.drawRect(this.f26327i, this.f26330l);
                } else {
                    Path path = this.f26328j;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.f26330l);
                }
            } else {
                RectF rectF = this.f26327i;
                k kVar2 = this.f26324f;
                float fB2 = (kVar2 == null || (lVarC4 = kVar2.c()) == null) ? 0.0f : H.f30189a.b(lVarC4.a());
                k kVar3 = this.f26324f;
                canvas.drawRoundRect(rectF, fB2, (kVar3 == null || (lVarC3 = kVar3.c()) == null) ? 0.0f : H.f30189a.b(lVarC3.b()), this.f26330l);
            }
        }
        this.f26330l.setAlpha(255);
        List list = this.f26329k;
        if (list != null && list != null && (!list.isEmpty())) {
            this.f26330l.setShader(c());
            k kVar4 = this.f26324f;
            if (kVar4 == null || !kVar4.f() || (eVar = this.f26320b) == null || !eVar.c()) {
                e eVar4 = this.f26320b;
                if (eVar4 == null || !eVar4.c()) {
                    canvas.drawRect(this.f26327i, this.f26330l);
                } else {
                    Path path2 = this.f26328j;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path2, this.f26330l);
                }
            } else {
                RectF rectF2 = this.f26327i;
                k kVar5 = this.f26324f;
                float fB3 = (kVar5 == null || (lVarC2 = kVar5.c()) == null) ? 0.0f : H.f30189a.b(lVarC2.a());
                k kVar6 = this.f26324f;
                if (kVar6 != null && (lVarC = kVar6.c()) != null) {
                    fB = H.f30189a.b(lVarC.b());
                }
                canvas.drawRoundRect(rectF2, fB3, fB, this.f26330l);
            }
            this.f26330l.setShader(null);
        }
        this.f26330l.setAlpha(Color.alpha(this.f26326h));
        canvas.restore();
    }

    public final void e(List list) {
        if (Intrinsics.b(this.f26329k, list)) {
            return;
        }
        this.f26329k = list;
        invalidateSelf();
    }

    public final void f(c cVar) {
        this.f26321c = cVar;
    }

    public final void g(e eVar) {
        this.f26320b = eVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f26330l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f26325g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f26325g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f26330l.setAlpha(Od.a.c((i10 / 255.0f) * (Color.alpha(this.f26326h) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
