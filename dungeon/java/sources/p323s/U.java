package p323s;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f52645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52646b;

    static final class a extends o implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == U.this ? "(this)" : String.valueOf(obj);
        }
    }

    private U(int i10) {
        this.f52645a = i10 == 0 ? V.f52648a : new Object[i10];
    }

    public /* synthetic */ U(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String i(U u10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return u10.h(charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public final boolean a(Object obj) {
        return e(obj) >= 0;
    }

    public final Object b() {
        if (f()) {
            d.d("ObjectList is empty.");
        }
        return this.f52645a[0];
    }

    public final Object c(int i10) {
        if (i10 < 0 || i10 >= this.f52646b) {
            j(i10);
        }
        return this.f52645a[i10];
    }

    public final int d() {
        return this.f52646b;
    }

    public final int e(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f52645a;
            int i11 = this.f52646b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f52645a;
        int i12 = this.f52646b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof U) {
            U u10 = (U) obj;
            int i10 = u10.f52646b;
            int i11 = this.f52646b;
            if (i10 == i11) {
                Object[] objArr = this.f52645a;
                Object[] objArr2 = u10.f52645a;
                IntRange intRangeT = e.t(0, i11);
                int iG = intRangeT.g();
                int iH = intRangeT.h();
                if (iG > iH) {
                    return true;
                }
                while (Intrinsics.b(objArr[iG], objArr2[iG])) {
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

    public final boolean f() {
        return this.f52646b == 0;
    }

    public final boolean g() {
        return this.f52646b != 0;
    }

    public final String h(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f52645a;
        int i11 = this.f52646b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (function1 == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) function1.invoke(obj));
            }
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public int hashCode() {
        Object[] objArr = this.f52645a;
        int i10 = this.f52646b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final void j(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f52646b - 1);
        d.c(sb2.toString());
    }

    public String toString() {
        return i(this, null, "[", "]", 0, null, new a(), 25, null);
    }
}
