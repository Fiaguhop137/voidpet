package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends p329s5.g implements p275p5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f30720e = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // p275p5.d
    public void a(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // p275p5.d
    public void f(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // p329s5.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        x(i10, 10000);
        return super.onLevelChange(i10);
    }

    @Override // p275p5.d
    public void r(String id2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public abstract void x(int i10, int i11);
}
