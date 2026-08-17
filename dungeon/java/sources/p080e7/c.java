package p080e7;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.react.modules.i18nmanager.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float[] f40532a = new Float[o.values().length];

    public final RectF a(int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 == 0) {
            Float f10 = this.f40532a[o.f40610g.ordinal()];
            float fFloatValue = (f10 == null && (f10 = this.f40532a[o.f40606c.ordinal()]) == null && (f10 = this.f40532a[o.f40612i.ordinal()]) == null && (f10 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.f40532a[o.f40614k.ordinal()];
            float fFloatValue2 = (f11 == null && (f11 = this.f40532a[o.f40608e.ordinal()]) == null && (f11 = this.f40532a[o.f40616m.ordinal()]) == null && (f11 = this.f40532a[o.f40613j.ordinal()]) == null && (f11 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.f40532a[o.f40611h.ordinal()];
            float fFloatValue3 = (f12 == null && (f12 = this.f40532a[o.f40607d.ordinal()]) == null && (f12 = this.f40532a[o.f40612i.ordinal()]) == null && (f12 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.f40532a[o.f40615l.ordinal()];
            return new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f13 == null && (f13 = this.f40532a[o.f40609f.ordinal()]) == null && (f13 = this.f40532a[o.f40616m.ordinal()]) == null && (f13 = this.f40532a[o.f40613j.ordinal()]) == null && (f13 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f13.floatValue());
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (a.f29937a.a().d(context)) {
            Float f14 = this.f40532a[o.f40611h.ordinal()];
            float fFloatValue4 = (f14 == null && (f14 = this.f40532a[o.f40607d.ordinal()]) == null && (f14 = this.f40532a[o.f40612i.ordinal()]) == null && (f14 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f14.floatValue();
            Float f15 = this.f40532a[o.f40614k.ordinal()];
            float fFloatValue5 = (f15 == null && (f15 = this.f40532a[o.f40608e.ordinal()]) == null && (f15 = this.f40532a[o.f40616m.ordinal()]) == null && (f15 = this.f40532a[o.f40613j.ordinal()]) == null && (f15 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f15.floatValue();
            Float f16 = this.f40532a[o.f40610g.ordinal()];
            float fFloatValue6 = (f16 == null && (f16 = this.f40532a[o.f40606c.ordinal()]) == null && (f16 = this.f40532a[o.f40612i.ordinal()]) == null && (f16 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f16.floatValue();
            Float f17 = this.f40532a[o.f40615l.ordinal()];
            return new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f17 == null && (f17 = this.f40532a[o.f40609f.ordinal()]) == null && (f17 = this.f40532a[o.f40616m.ordinal()]) == null && (f17 = this.f40532a[o.f40613j.ordinal()]) == null && (f17 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f17.floatValue());
        }
        Float f18 = this.f40532a[o.f40611h.ordinal()];
        float fFloatValue7 = (f18 == null && (f18 = this.f40532a[o.f40606c.ordinal()]) == null && (f18 = this.f40532a[o.f40612i.ordinal()]) == null && (f18 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f18.floatValue();
        Float f19 = this.f40532a[o.f40614k.ordinal()];
        float fFloatValue8 = (f19 == null && (f19 = this.f40532a[o.f40608e.ordinal()]) == null && (f19 = this.f40532a[o.f40616m.ordinal()]) == null && (f19 = this.f40532a[o.f40613j.ordinal()]) == null && (f19 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f19.floatValue();
        Float f20 = this.f40532a[o.f40610g.ordinal()];
        float fFloatValue9 = (f20 == null && (f20 = this.f40532a[o.f40607d.ordinal()]) == null && (f20 = this.f40532a[o.f40612i.ordinal()]) == null && (f20 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f20.floatValue();
        Float f21 = this.f40532a[o.f40615l.ordinal()];
        return new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f21 == null && (f21 = this.f40532a[o.f40609f.ordinal()]) == null && (f21 = this.f40532a[o.f40616m.ordinal()]) == null && (f21 = this.f40532a[o.f40613j.ordinal()]) == null && (f21 = this.f40532a[o.f40605b.ordinal()]) == null) ? 0.0f : f21.floatValue());
    }

    public final void b(o edge, Float f10) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        this.f40532a[edge.ordinal()] = f10;
    }
}
