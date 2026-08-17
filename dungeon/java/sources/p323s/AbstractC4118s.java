package p323s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import p341t.d;

/* JADX INFO: renamed from: s.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4118s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f52761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52762b;

    private AbstractC4118s(int i10) {
        this.f52761a = i10 == 0 ? AbstractC4122w.a() : new long[i10];
    }

    public /* synthetic */ AbstractC4118s(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String c(AbstractC4118s abstractC4118s, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC4118s.b(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final long a(int i10) {
        if (i10 < 0 || i10 >= this.f52762b) {
            d.c("Index must be between 0 and size");
        }
        return this.f52761a[i10];
    }

    public final String b(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f52761a;
        int i11 = this.f52762b;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(j10);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4118s) {
            AbstractC4118s abstractC4118s = (AbstractC4118s) obj;
            int i10 = abstractC4118s.f52762b;
            int i11 = this.f52762b;
            if (i10 == i11) {
                long[] jArr = this.f52761a;
                long[] jArr2 = abstractC4118s.f52761a;
                IntRange intRangeT = e.t(0, i11);
                int iG = intRangeT.g();
                int iH = intRangeT.h();
                if (iG > iH) {
                    return true;
                }
                while (jArr[iG] == jArr2[iG]) {
                    if (iG == iH) {
                        return true;
                    }
                    iG++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.f52761a;
        int i10 = this.f52762b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return c(this, null, "[", "]", 0, null, 25, null);
    }
}
