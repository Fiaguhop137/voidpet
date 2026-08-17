package p261o9;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p297q9.g;
import p297q9.k;
import p297q9.n;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f50459a;

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f50460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f50461b;

        public b(b bVar) {
            this.f50460a = (g) bVar.f50460a.getConstantState().newDrawable();
            this.f50461b = bVar.f50461b;
        }

        public b(g gVar) {
            this.f50460a = gVar;
            this.f50461b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this), null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.f50459a = bVar;
    }

    /* synthetic */ a(b bVar, C0598a c0598a) {
        this(bVar);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f50459a = new b(this.f50459a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f50459a;
        if (bVar.f50461b) {
            bVar.f50460a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f50459a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f50459a.f50460a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f50459a.f50460a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f50459a.f50460a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = p261o9.b.e(iArr);
        b bVar = this.f50459a;
        if (bVar.f50461b == zE) {
            return zOnStateChange;
        }
        bVar.f50461b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f50459a.f50460a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f50459a.f50460a.setColorFilter(colorFilter);
    }

    @Override // p297q9.n
    public void setShapeAppearanceModel(k kVar) {
        this.f50459a.f50460a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f50459a.f50460a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f50459a.f50460a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f50459a.f50460a.setTintMode(mode);
    }
}
