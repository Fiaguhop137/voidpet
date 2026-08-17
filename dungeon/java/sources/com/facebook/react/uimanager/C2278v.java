package com.facebook.react.uimanager;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2278v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2278v f30663a = new C2278v();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.v$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30664a;

        static {
            int[] iArr = new int[com.facebook.yoga.h.values().length];
            try {
                iArr[com.facebook.yoga.h.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.yoga.h.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30664a = iArr;
        }
    }

    static {
        p348t6.b.a("LayoutDirectionUtil", p348t6.a.ERROR);
    }

    private C2278v() {
    }

    public static final int a(com.facebook.yoga.h direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i10 = a.f30664a[direction.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 2 : 1;
        }
        return 0;
    }
}
