package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p329s5.p;
import p329s5.q;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f30748l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final q f30749m = new i();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return i.f30749m;
        }
    }

    @Override // p329s5.p
    public void b(Matrix outTransform, Rect parentRect, int i10, int i11, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float fH = kotlin.ranges.e.h(Math.min(f12, f13), 1.0f);
        float f14 = parentRect.left;
        float f15 = parentRect.top;
        outTransform.setScale(fH, fH);
        outTransform.postTranslate(Math.round(f14), Math.round(f15));
    }

    public String toString() {
        return "start_inside";
    }
}
