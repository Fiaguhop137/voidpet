package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3105h extends p297q9.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    b f37054z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends q9.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f37055w;

        private b(b bVar) {
            super(bVar);
            this.f37055w = bVar.f37055w;
        }

        /* synthetic */ b(b bVar, a aVar) {
            this(bVar);
        }

        private b(p297q9.k kVar, RectF rectF) {
            super(kVar, null);
            this.f37055w = rectF;
        }

        /* synthetic */ b(p297q9.k kVar, RectF rectF, a aVar) {
            this(kVar, rectF);
        }

        @Override // q9.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC3105h abstractC3105hI0 = AbstractC3105h.i0(this);
            abstractC3105hI0.invalidateSelf();
            return abstractC3105hI0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    private static class c extends AbstractC3105h {
        c(b bVar) {
            super(bVar, null);
        }

        @Override // p297q9.g
        protected void r(Canvas canvas) {
            if (this.f37054z.f37055w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f37054z.f37055w);
            } else {
                canvas.clipRect(this.f37054z.f37055w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private AbstractC3105h(b bVar) {
        super(bVar);
        this.f37054z = bVar;
    }

    /* synthetic */ AbstractC3105h(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC3105h i0(b bVar) {
        return new c(bVar);
    }

    static AbstractC3105h j0(p297q9.k kVar) {
        if (kVar == null) {
            kVar = new p297q9.k();
        }
        return i0(new b(kVar, new RectF(), null));
    }

    boolean k0() {
        return !this.f37054z.f37055w.isEmpty();
    }

    void l0() {
        m0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void m0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f37054z.f37055w.left && f11 == this.f37054z.f37055w.top && f12 == this.f37054z.f37055w.right && f13 == this.f37054z.f37055w.bottom) {
            return;
        }
        this.f37054z.f37055w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // p297q9.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f37054z = new b(this.f37054z, (a) null);
        return this;
    }

    void n0(RectF rectF) {
        m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
