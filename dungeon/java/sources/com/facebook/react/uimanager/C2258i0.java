package com.facebook.react.uimanager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2258i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f30506e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f30507f = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f30508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f30509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30511d;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    public C2258i0() {
        this(0.0f, f30506e.b());
    }

    public C2258i0(float f10) {
        this(f10, f30506e.b());
    }

    public C2258i0(float f10, float[] spacing) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f30508a = f10;
        this.f30509b = spacing;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    public final float a(int i10) {
        float f10;
        if (i10 != 4 && i10 != 5) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                    f10 = Float.NaN;
                    break;
                default:
                    f10 = this.f30508a;
                    break;
            }
        } else {
            f10 = Float.NaN;
        }
        int i11 = this.f30510c;
        if (i11 != 0) {
            int[] iArr = f30507f;
            if ((iArr[i10] & i11) != 0) {
                return this.f30509b[i10];
            }
            if (this.f30511d) {
                char c10 = (i10 == 1 || i10 == 3) ? (char) 7 : (char) 6;
                if ((iArr[c10] & i11) != 0) {
                    return this.f30509b[c10];
                }
                if ((i11 & iArr[8]) != 0) {
                    return this.f30509b[8];
                }
            }
        }
        return f10;
    }

    public final float b(int i10) {
        return this.f30509b[i10];
    }

    public final boolean c(int i10, float f10) {
        int i11;
        if (C2269o.a(this.f30509b[i10], f10)) {
            return false;
        }
        this.f30509b[i10] = f10;
        if (com.facebook.yoga.g.a(f10)) {
            i11 = (~f30507f[i10]) & this.f30510c;
        } else {
            i11 = f30507f[i10] | this.f30510c;
        }
        this.f30510c = i11;
        int[] iArr = f30507f;
        this.f30511d = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0) ? false : true;
        return true;
    }
}
