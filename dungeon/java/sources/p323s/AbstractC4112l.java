package p323s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import p341t.d;

/* JADX INFO: renamed from: s.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4112l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f52735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52736b;

    private AbstractC4112l(int i10) {
        this.f52735a = i10 == 0 ? AbstractC4117q.a() : new int[i10];
    }

    public /* synthetic */ AbstractC4112l(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String d(AbstractC4112l abstractC4112l, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC4112l.c(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final int a() {
        if (this.f52736b == 0) {
            d.d("IntList is empty.");
        }
        return this.f52735a[0];
    }

    public final int b(int i10) {
        if (i10 < 0 || i10 >= this.f52736b) {
            d.c("Index must be between 0 and size");
        }
        return this.f52735a[i10];
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f52735a;
        int i11 = this.f52736b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final int e() {
        if (this.f52736b == 0) {
            d.d("IntList is empty.");
        }
        return this.f52735a[this.f52736b - 1];
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4112l) {
            AbstractC4112l abstractC4112l = (AbstractC4112l) obj;
            int i10 = abstractC4112l.f52736b;
            int i11 = this.f52736b;
            if (i10 == i11) {
                int[] iArr = this.f52735a;
                int[] iArr2 = abstractC4112l.f52735a;
                IntRange intRangeT = e.t(0, i11);
                int iG = intRangeT.g();
                int iH = intRangeT.h();
                if (iG > iH) {
                    return true;
                }
                while (iArr[iG] == iArr2[iG]) {
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
        int[] iArr = this.f52735a;
        int i10 = this.f52736b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return d(this, null, "[", "]", 0, null, 25, null);
    }
}
