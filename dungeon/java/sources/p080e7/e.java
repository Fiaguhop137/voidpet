package p080e7;

import Ad.n;
import android.content.Context;
import com.facebook.react.uimanager.C2281y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2281y f40548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2281y f40549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2281y f40550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2281y f40551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2281y f40552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2281y f40553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2281y f40554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2281y f40555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2281y f40556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2281y f40557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2281y f40558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2281y f40559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C2281y f40560m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40561a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f40561a = iArr;
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public e(C2281y c2281y, C2281y c2281y2, C2281y c2281y3, C2281y c2281y4, C2281y c2281y5, C2281y c2281y6, C2281y c2281y7, C2281y c2281y8, C2281y c2281y9, C2281y c2281y10, C2281y c2281y11, C2281y c2281y12, C2281y c2281y13) {
        this.f40548a = c2281y;
        this.f40549b = c2281y2;
        this.f40550c = c2281y3;
        this.f40551d = c2281y4;
        this.f40552e = c2281y5;
        this.f40553f = c2281y6;
        this.f40554g = c2281y7;
        this.f40555h = c2281y8;
        this.f40556i = c2281y9;
        this.f40557j = c2281y10;
        this.f40558k = c2281y11;
        this.f40559l = c2281y12;
        this.f40560m = c2281y13;
    }

    public /* synthetic */ e(C2281y c2281y, C2281y c2281y2, C2281y c2281y3, C2281y c2281y4, C2281y c2281y5, C2281y c2281y6, C2281y c2281y7, C2281y c2281y8, C2281y c2281y9, C2281y c2281y10, C2281y c2281y11, C2281y c2281y12, C2281y c2281y13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c2281y, (i10 & 2) != 0 ? null : c2281y2, (i10 & 4) != 0 ? null : c2281y3, (i10 & 8) != 0 ? null : c2281y4, (i10 & 16) != 0 ? null : c2281y5, (i10 & 32) != 0 ? null : c2281y6, (i10 & 64) != 0 ? null : c2281y7, (i10 & 128) != 0 ? null : c2281y8, (i10 & 256) != 0 ? null : c2281y9, (i10 & 512) != 0 ? null : c2281y10, (i10 & 1024) != 0 ? null : c2281y11, (i10 & 2048) != 0 ? null : c2281y12, (i10 & 4096) != 0 ? null : c2281y13);
    }

    private final k a(l lVar, l lVar2, l lVar3, l lVar4, float f10, float f11) {
        float fB = lVar.b() + lVar3.b();
        float fA = lVar.a() + lVar2.a();
        float fB2 = lVar2.b() + lVar4.b();
        float fA2 = lVar3.a() + lVar4.a();
        float fMin = fB > 0.0f ? Math.min(f11 / fB, 1.0f) : 0.0f;
        float fMin2 = fA > 0.0f ? Math.min(f10 / fA, 1.0f) : 0.0f;
        float fMin3 = fB2 > 0.0f ? Math.min(f11 / fB2, 1.0f) : 0.0f;
        float fMin4 = fA2 > 0.0f ? Math.min(f10 / fA2, 1.0f) : 0.0f;
        return new k(new l(lVar.a() * Math.min(fMin2, fMin), lVar.b() * Math.min(fMin2, fMin)), new l(lVar2.a() * Math.min(fMin3, fMin2), lVar2.b() * Math.min(fMin3, fMin2)), new l(lVar3.a() * Math.min(fMin4, fMin), lVar3.b() * Math.min(fMin4, fMin)), new l(lVar4.a() * Math.min(fMin4, fMin3), lVar4.b() * Math.min(fMin4, fMin3)));
    }

    public final C2281y b(d property) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f40561a[property.ordinal()]) {
            case 1:
                return this.f40548a;
            case 2:
                return this.f40549b;
            case 3:
                return this.f40550c;
            case 4:
                return this.f40551d;
            case 5:
                return this.f40552e;
            case 6:
                return this.f40553f;
            case 7:
                return this.f40554g;
            case 8:
                return this.f40555h;
            case 9:
                return this.f40556i;
            case 10:
                return this.f40557j;
            case 11:
                return this.f40558k;
            case 12:
                return this.f40559l;
            case 13:
                return this.f40560m;
            default:
                throw new n();
        }
    }

    public final boolean c() {
        return (this.f40548a == null && this.f40549b == null && this.f40550c == null && this.f40551d == null && this.f40552e == null && this.f40553f == null && this.f40554g == null && this.f40555h == null && this.f40556i == null && this.f40557j == null && this.f40558k == null && this.f40559l == null && this.f40560m == null) ? false : true;
    }

    public final k d(int i10, Context context, float f10, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        l lVar = new l(0.0f, 0.0f);
        if (i10 == 0) {
            C2281y c2281y = this.f40557j;
            if (c2281y == null && (c2281y = this.f40553f) == null && (c2281y = this.f40549b) == null) {
                c2281y = this.f40548a;
            }
            l lVar2 = c2281y != null ? new l(c2281y, f10, f11) : lVar;
            C2281y c2281y2 = this.f40559l;
            if (c2281y2 == null && (c2281y2 = this.f40554g) == null && (c2281y2 = this.f40550c) == null) {
                c2281y2 = this.f40548a;
            }
            l lVar3 = c2281y2 != null ? new l(c2281y2, f10, f11) : lVar;
            C2281y c2281y3 = this.f40558k;
            if (c2281y3 == null && (c2281y3 = this.f40555h) == null && (c2281y3 = this.f40551d) == null) {
                c2281y3 = this.f40548a;
            }
            l lVar4 = c2281y3 != null ? new l(c2281y3, f10, f11) : lVar;
            C2281y c2281y4 = this.f40560m;
            if (c2281y4 == null && (c2281y4 = this.f40556i) == null && (c2281y4 = this.f40552e) == null) {
                c2281y4 = this.f40548a;
            }
            if (c2281y4 != null) {
                lVar = new l(c2281y4, f10, f11);
            }
            return a(lVar2, lVar3, lVar4, lVar, f10, f11);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f29937a.a().d(context)) {
            C2281y c2281y5 = this.f40559l;
            if (c2281y5 == null && (c2281y5 = this.f40554g) == null && (c2281y5 = this.f40550c) == null) {
                c2281y5 = this.f40548a;
            }
            l lVar5 = c2281y5 != null ? new l(c2281y5, f10, f11) : lVar;
            C2281y c2281y6 = this.f40557j;
            if (c2281y6 == null && (c2281y6 = this.f40553f) == null && (c2281y6 = this.f40549b) == null) {
                c2281y6 = this.f40548a;
            }
            l lVar6 = c2281y6 != null ? new l(c2281y6, f10, f11) : lVar;
            C2281y c2281y7 = this.f40560m;
            if (c2281y7 == null && (c2281y7 = this.f40556i) == null && (c2281y7 = this.f40552e) == null) {
                c2281y7 = this.f40548a;
            }
            l lVar7 = c2281y7 != null ? new l(c2281y7, f10, f11) : lVar;
            C2281y c2281y8 = this.f40558k;
            if (c2281y8 == null && (c2281y8 = this.f40555h) == null && (c2281y8 = this.f40551d) == null) {
                c2281y8 = this.f40548a;
            }
            if (c2281y8 != null) {
                lVar = new l(c2281y8, f10, f11);
            }
            return a(lVar5, lVar6, lVar7, lVar, f10, f11);
        }
        C2281y c2281y9 = this.f40559l;
        if (c2281y9 == null && (c2281y9 = this.f40554g) == null && (c2281y9 = this.f40549b) == null) {
            c2281y9 = this.f40548a;
        }
        l lVar8 = c2281y9 != null ? new l(c2281y9, f10, f11) : lVar;
        C2281y c2281y10 = this.f40557j;
        if (c2281y10 == null && (c2281y10 = this.f40553f) == null && (c2281y10 = this.f40550c) == null) {
            c2281y10 = this.f40548a;
        }
        l lVar9 = c2281y10 != null ? new l(c2281y10, f10, f11) : lVar;
        C2281y c2281y11 = this.f40560m;
        if (c2281y11 == null && (c2281y11 = this.f40555h) == null && (c2281y11 = this.f40551d) == null) {
            c2281y11 = this.f40548a;
        }
        l lVar10 = c2281y11 != null ? new l(c2281y11, f10, f11) : lVar;
        C2281y c2281y12 = this.f40558k;
        if (c2281y12 == null && (c2281y12 = this.f40556i) == null && (c2281y12 = this.f40552e) == null) {
            c2281y12 = this.f40548a;
        }
        if (c2281y12 != null) {
            lVar = new l(c2281y12, f10, f11);
        }
        return a(lVar8, lVar9, lVar10, lVar, f10, f11);
    }

    public final void e(d property, C2281y c2281y) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f40561a[property.ordinal()]) {
            case 1:
                this.f40548a = c2281y;
                return;
            case 2:
                this.f40549b = c2281y;
                return;
            case 3:
                this.f40550c = c2281y;
                return;
            case 4:
                this.f40551d = c2281y;
                return;
            case 5:
                this.f40552e = c2281y;
                return;
            case 6:
                this.f40553f = c2281y;
                return;
            case 7:
                this.f40554g = c2281y;
                return;
            case 8:
                this.f40555h = c2281y;
                return;
            case 9:
                this.f40556i = c2281y;
                return;
            case 10:
                this.f40557j = c2281y;
                return;
            case 11:
                this.f40558k = c2281y;
                return;
            case 12:
                this.f40559l = c2281y;
                return;
            case 13:
                this.f40560m = c2281y;
                return;
            default:
                throw new n();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f40548a, eVar.f40548a) && Intrinsics.b(this.f40549b, eVar.f40549b) && Intrinsics.b(this.f40550c, eVar.f40550c) && Intrinsics.b(this.f40551d, eVar.f40551d) && Intrinsics.b(this.f40552e, eVar.f40552e) && Intrinsics.b(this.f40553f, eVar.f40553f) && Intrinsics.b(this.f40554g, eVar.f40554g) && Intrinsics.b(this.f40555h, eVar.f40555h) && Intrinsics.b(this.f40556i, eVar.f40556i) && Intrinsics.b(this.f40557j, eVar.f40557j) && Intrinsics.b(this.f40558k, eVar.f40558k) && Intrinsics.b(this.f40559l, eVar.f40559l) && Intrinsics.b(this.f40560m, eVar.f40560m);
    }

    public int hashCode() {
        C2281y c2281y = this.f40548a;
        int iHashCode = (c2281y == null ? 0 : c2281y.hashCode()) * 31;
        C2281y c2281y2 = this.f40549b;
        int iHashCode2 = (iHashCode + (c2281y2 == null ? 0 : c2281y2.hashCode())) * 31;
        C2281y c2281y3 = this.f40550c;
        int iHashCode3 = (iHashCode2 + (c2281y3 == null ? 0 : c2281y3.hashCode())) * 31;
        C2281y c2281y4 = this.f40551d;
        int iHashCode4 = (iHashCode3 + (c2281y4 == null ? 0 : c2281y4.hashCode())) * 31;
        C2281y c2281y5 = this.f40552e;
        int iHashCode5 = (iHashCode4 + (c2281y5 == null ? 0 : c2281y5.hashCode())) * 31;
        C2281y c2281y6 = this.f40553f;
        int iHashCode6 = (iHashCode5 + (c2281y6 == null ? 0 : c2281y6.hashCode())) * 31;
        C2281y c2281y7 = this.f40554g;
        int iHashCode7 = (iHashCode6 + (c2281y7 == null ? 0 : c2281y7.hashCode())) * 31;
        C2281y c2281y8 = this.f40555h;
        int iHashCode8 = (iHashCode7 + (c2281y8 == null ? 0 : c2281y8.hashCode())) * 31;
        C2281y c2281y9 = this.f40556i;
        int iHashCode9 = (iHashCode8 + (c2281y9 == null ? 0 : c2281y9.hashCode())) * 31;
        C2281y c2281y10 = this.f40557j;
        int iHashCode10 = (iHashCode9 + (c2281y10 == null ? 0 : c2281y10.hashCode())) * 31;
        C2281y c2281y11 = this.f40558k;
        int iHashCode11 = (iHashCode10 + (c2281y11 == null ? 0 : c2281y11.hashCode())) * 31;
        C2281y c2281y12 = this.f40559l;
        int iHashCode12 = (iHashCode11 + (c2281y12 == null ? 0 : c2281y12.hashCode())) * 31;
        C2281y c2281y13 = this.f40560m;
        return iHashCode12 + (c2281y13 != null ? c2281y13.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.f40548a + ", topLeft=" + this.f40549b + ", topRight=" + this.f40550c + ", bottomLeft=" + this.f40551d + ", bottomRight=" + this.f40552e + ", topStart=" + this.f40553f + ", topEnd=" + this.f40554g + ", bottomStart=" + this.f40555h + ", bottomEnd=" + this.f40556i + ", startStart=" + this.f40557j + ", startEnd=" + this.f40558k + ", endStart=" + this.f40559l + ", endEnd=" + this.f40560m + ")";
    }
}
