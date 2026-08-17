package p401w5;

import V4.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p151i6.b;
import p383v5.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends ImageView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f56623g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.C0726a f56624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f56625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f56626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f56629f;

    public c(Context context) {
        super(context);
        this.f56624a = new a.C0726a();
        this.f56625b = 0.0f;
        this.f56627d = false;
        this.f56628e = false;
        this.f56629f = null;
        c(context);
    }

    private void c(Context context) {
        boolean zD;
        try {
            if (b.d()) {
                b.a("DraweeView#init");
            }
            if (this.f56627d) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z10 = true;
            this.f56627d = true;
            this.f56626c = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f56623g || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.f56628e = z10;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f56628e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        f56623g = z10;
    }

    protected void a() {
        this.f56626c.j();
    }

    protected void b() {
        this.f56626c.k();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f56625b;
    }

    public a getController() {
        return this.f56626c.e();
    }

    public Object getExtraData() {
        return this.f56629f;
    }

    public p383v5.b getHierarchy() {
        return this.f56626c.g();
    }

    public Drawable getTopLevelDrawable() {
        return this.f56626c.h();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0726a c0726a = this.f56624a;
        c0726a.f56615a = i10;
        c0726a.f56616b = i11;
        a.b(c0726a, this.f56625b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0726a c0726a2 = this.f56624a;
        super.onMeasure(c0726a2.f56615a, c0726a2.f56616b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f56626c.l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.f56625b) {
            return;
        }
        this.f56625b = f10;
        requestLayout();
    }

    public void setController(a aVar) {
        this.f56626c.o(aVar);
        super.setImageDrawable(this.f56626c.h());
    }

    public void setExtraData(Object obj) {
        this.f56629f = obj;
    }

    public void setHierarchy(p383v5.b bVar) {
        this.f56626c.p(bVar);
        super.setImageDrawable(this.f56626c.h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f56626c.n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f56626c.n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f56626c.n();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f56626c.n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.f56628e = z10;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b bVar = this.f56626c;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
