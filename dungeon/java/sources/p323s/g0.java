package p323s;

import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.a;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f52710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f52711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f52712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f52713d;

    public g0() {
        this(0, 1, null);
    }

    public g0(int i10) {
        if (i10 == 0) {
            this.f52711b = a.f54133a;
            this.f52712c = a.f54135c;
        } else {
            int iE = a.e(i10);
            this.f52711b = new int[iE];
            this.f52712c = new Object[iE];
        }
    }

    public /* synthetic */ g0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void b(int i10, Object obj) {
        int i11 = this.f52713d;
        if (i11 != 0 && i10 <= this.f52711b[i11 - 1]) {
            l(i10, obj);
            return;
        }
        if (this.f52710a && i11 >= this.f52711b.length) {
            h0.d(this);
        }
        int i12 = this.f52713d;
        if (i12 >= this.f52711b.length) {
            int iE = a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f52711b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f52711b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f52712c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f52712c = objArrCopyOf;
        }
        this.f52711b[i12] = i10;
        this.f52712c[i12] = obj;
        this.f52713d = i12 + 1;
    }

    public void c() {
        int i10 = this.f52713d;
        Object[] objArr = this.f52712c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f52713d = 0;
        this.f52710a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        g0 g0Var = (g0) objClone;
        g0Var.f52711b = (int[]) this.f52711b.clone();
        g0Var.f52712c = (Object[]) this.f52712c.clone();
        return g0Var;
    }

    public boolean e(int i10) {
        return g(i10) >= 0;
    }

    public Object f(int i10) {
        return h0.c(this, i10);
    }

    public int g(int i10) {
        if (this.f52710a) {
            h0.d(this);
        }
        return a.a(this.f52711b, this.f52713d, i10);
    }

    public int h(Object obj) {
        if (this.f52710a) {
            h0.d(this);
        }
        int i10 = this.f52713d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f52712c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int j(int i10) {
        if (this.f52710a) {
            h0.d(this);
        }
        return this.f52711b[i10];
    }

    public void l(int i10, Object obj) {
        int iA = a.a(this.f52711b, this.f52713d, i10);
        if (iA >= 0) {
            this.f52712c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f52713d && this.f52712c[i11] == h0.f52714a) {
            this.f52711b[i11] = i10;
            this.f52712c[i11] = obj;
            return;
        }
        if (this.f52710a && this.f52713d >= this.f52711b.length) {
            h0.d(this);
            i11 = ~a.a(this.f52711b, this.f52713d, i10);
        }
        int i12 = this.f52713d;
        if (i12 >= this.f52711b.length) {
            int iE = a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f52711b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f52711b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f52712c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f52712c = objArrCopyOf;
        }
        int i13 = this.f52713d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f52711b;
            int i14 = i11 + 1;
            AbstractC3952n.j(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f52712c;
            AbstractC3952n.l(objArr, objArr, i14, i11, this.f52713d);
        }
        this.f52711b[i11] = i10;
        this.f52712c[i11] = obj;
        this.f52713d++;
    }

    public int m() {
        if (this.f52710a) {
            h0.d(this);
        }
        return this.f52713d;
    }

    public Object n(int i10) {
        if (this.f52710a) {
            h0.d(this);
        }
        Object[] objArr = this.f52712c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        C4106f c4106f = C4106f.f52695a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f52713d * 28);
        sb2.append('{');
        int i10 = this.f52713d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
            sb2.append('=');
            Object objN = n(i11);
            if (objN != this) {
                sb2.append(objN);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
