package io.sentry.android.replay;

import android.content.Context;
import io.sentry.B3;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45498g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f45501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f45502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45504f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? Math.max(16, i10 - i11) : i10 + (16 - i11);
        }

        public final s b(Context context, B3 sessionReplay, int i10, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f10 = i11;
            float f11 = i10;
            Pair pairA = Ad.v.a(Integer.valueOf(a(Od.a.c((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.l().sizeScale))), Integer.valueOf(a(Od.a.c((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.l().sizeScale))));
            int iIntValue = ((Number) pairA.getFirst()).intValue();
            int iIntValue2 = ((Number) pairA.getSecond()).intValue();
            return new s(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.c(), sessionReplay.l().bitRate);
        }
    }

    public s(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f45499a = i10;
        this.f45500b = i11;
        this.f45501c = f10;
        this.f45502d = f11;
        this.f45503e = i12;
        this.f45504f = i13;
    }

    public final int a() {
        return this.f45504f;
    }

    public final int b() {
        return this.f45503e;
    }

    public final int c() {
        return this.f45500b;
    }

    public final int d() {
        return this.f45499a;
    }

    public final float e() {
        return this.f45501c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f45499a == sVar.f45499a && this.f45500b == sVar.f45500b && Float.compare(this.f45501c, sVar.f45501c) == 0 && Float.compare(this.f45502d, sVar.f45502d) == 0 && this.f45503e == sVar.f45503e && this.f45504f == sVar.f45504f;
    }

    public final float f() {
        return this.f45502d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f45499a) * 31) + Integer.hashCode(this.f45500b)) * 31) + Float.hashCode(this.f45501c)) * 31) + Float.hashCode(this.f45502d)) * 31) + Integer.hashCode(this.f45503e)) * 31) + Integer.hashCode(this.f45504f);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f45499a + ", recordingHeight=" + this.f45500b + ", scaleFactorX=" + this.f45501c + ", scaleFactorY=" + this.f45502d + ", frameRate=" + this.f45503e + ", bitRate=" + this.f45504f + ')';
    }
}
