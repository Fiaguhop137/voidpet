package com.facebook.react.views.text;

import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f31119h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31120a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31121b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31122c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31123d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f31124e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f31125f = v.UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f31126g = Float.NaN;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final t a(t child) {
        Intrinsics.checkNotNullParameter(child, "child");
        t tVar = new t();
        tVar.f31120a = this.f31120a;
        tVar.f31121b = !Float.isNaN(child.f31121b) ? child.f31121b : this.f31121b;
        tVar.f31122c = !Float.isNaN(child.f31122c) ? child.f31122c : this.f31122c;
        tVar.f31123d = !Float.isNaN(child.f31123d) ? child.f31123d : this.f31123d;
        tVar.m(!Float.isNaN(child.f31126g) ? child.f31126g : this.f31126g);
        tVar.f31124e = !Float.isNaN(child.f31124e) ? child.f31124e : this.f31124e;
        v vVar = child.f31125f;
        if (vVar == v.UNSET) {
            vVar = this.f31125f;
        }
        tVar.f31125f = vVar;
        return tVar;
    }

    public final boolean b() {
        return this.f31120a;
    }

    public final int c() {
        float f10 = !Float.isNaN(this.f31121b) ? this.f31121b : 14.0f;
        return (int) (this.f31120a ? Math.ceil(H.l(f10, f())) : Math.ceil(H.i(f10)));
    }

    public final float d() {
        if (Float.isNaN(this.f31123d)) {
            return Float.NaN;
        }
        return (this.f31120a ? H.l(this.f31123d, f()) : H.i(this.f31123d)) / c();
    }

    public final float e() {
        if (Float.isNaN(this.f31122c)) {
            return Float.NaN;
        }
        float fL = this.f31120a ? H.l(this.f31122c, f()) : H.i(this.f31122c);
        if (!Float.isNaN(this.f31124e)) {
            float f10 = this.f31124e;
            if (f10 > fL) {
                return f10;
            }
        }
        return fL;
    }

    public final float f() {
        if (Float.isNaN(this.f31126g)) {
            return 0.0f;
        }
        return this.f31126g;
    }

    public final float g() {
        return this.f31126g;
    }

    public final void h(boolean z10) {
        this.f31120a = z10;
    }

    public final void i(float f10) {
        this.f31121b = f10;
    }

    public final void j(float f10) {
        this.f31124e = f10;
    }

    public final void k(float f10) {
        this.f31123d = f10;
    }

    public final void l(float f10) {
        this.f31122c = f10;
    }

    public final void m(float f10) {
        if (f10 == 0.0f || f10 >= 1.0f || Float.isNaN(f10)) {
            this.f31126g = f10;
        } else {
            W4.a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f31126g = Float.NaN;
        }
    }

    public String toString() {
        return StringsKt.j("\n    TextAttributes {\n      getAllowFontScaling(): " + this.f31120a + "\n      getFontSize(): " + this.f31121b + "\n      getEffectiveFontSize(): " + c() + "\n      getHeightOfTallestInlineViewOrImage(): " + this.f31124e + "\n      getLetterSpacing(): " + this.f31123d + "\n      getEffectiveLetterSpacing(): " + d() + "\n      getLineHeight(): " + this.f31122c + "\n      getEffectiveLineHeight(): " + e() + "\n      getTextTransform(): " + this.f31125f + "\n      getMaxFontSizeMultiplier(): " + this.f31126g + "\n      getEffectiveMaxFontSizeMultiplier(): " + f() + "\n    }\n  ");
    }
}
