package p025b6;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f26294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26295e;

    public j(Drawable drawable) {
        this.f26294d = drawable;
    }

    @Override // p025b6.e
    public int M() {
        return getWidth() * getHeight() * 4;
    }

    @Override // p025b6.g
    public Drawable U2() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f26294d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // p025b6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26294d = null;
        this.f26295e = true;
    }

    @Override // p025b6.e, p025b6.m
    public int getHeight() {
        Drawable drawable = this.f26294d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p025b6.e, p025b6.m
    public int getWidth() {
        Drawable drawable = this.f26294d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p025b6.e
    public boolean isClosed() {
        return this.f26295e;
    }
}
