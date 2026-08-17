package p323s;

import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.a;
import p341t.d;

/* JADX INFO: renamed from: s.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4123x implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f52775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f52776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f52777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f52778d;

    public C4123x() {
        this(0, 1, null);
    }

    public C4123x(int i10) {
        if (i10 == 0) {
            this.f52776b = a.f54134b;
            this.f52777c = a.f54135c;
        } else {
            int iF = a.f(i10);
            this.f52776b = new long[iF];
            this.f52777c = new Object[iF];
        }
    }

    public /* synthetic */ C4123x(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void b() {
        int i10 = this.f52778d;
        Object[] objArr = this.f52777c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f52778d = 0;
        this.f52775a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4123x clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C4123x c4123x = (C4123x) objClone;
        c4123x.f52776b = (long[]) this.f52776b.clone();
        c4123x.f52777c = (Object[]) this.f52777c.clone();
        return c4123x;
    }

    public boolean d(long j10) {
        return f(j10) >= 0;
    }

    public Object e(long j10) {
        int iB = a.b(this.f52776b, this.f52778d, j10);
        if (iB < 0 || this.f52777c[iB] == AbstractC4124y.f52779a) {
            return null;
        }
        return this.f52777c[iB];
    }

    public int f(long j10) {
        if (this.f52775a) {
            int i10 = this.f52778d;
            long[] jArr = this.f52776b;
            Object[] objArr = this.f52777c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC4124y.f52779a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f52775a = false;
            this.f52778d = i11;
        }
        return a.b(this.f52776b, this.f52778d, j10);
    }

    public boolean g() {
        return n() == 0;
    }

    public long h(int i10) {
        if (!(i10 >= 0 && i10 < this.f52778d)) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f52775a) {
            int i11 = this.f52778d;
            long[] jArr = this.f52776b;
            Object[] objArr = this.f52777c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC4124y.f52779a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f52775a = false;
            this.f52778d = i12;
        }
        return this.f52776b[i10];
    }

    public void j(long j10, Object obj) {
        int iB = a.b(this.f52776b, this.f52778d, j10);
        if (iB >= 0) {
            this.f52777c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f52778d && this.f52777c[i10] == AbstractC4124y.f52779a) {
            this.f52776b[i10] = j10;
            this.f52777c[i10] = obj;
            return;
        }
        if (this.f52775a) {
            int i11 = this.f52778d;
            long[] jArr = this.f52776b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f52777c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC4124y.f52779a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f52775a = false;
                this.f52778d = i12;
                i10 = ~a.b(this.f52776b, i12, j10);
            }
        }
        int i14 = this.f52778d;
        if (i14 >= this.f52776b.length) {
            int iF = a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f52776b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f52776b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f52777c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f52777c = objArrCopyOf;
        }
        int i15 = this.f52778d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f52776b;
            int i16 = i10 + 1;
            AbstractC3952n.k(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f52777c;
            AbstractC3952n.l(objArr2, objArr2, i16, i10, this.f52778d);
        }
        this.f52776b[i10] = j10;
        this.f52777c[i10] = obj;
        this.f52778d++;
    }

    public void l(long j10) {
        int iB = a.b(this.f52776b, this.f52778d, j10);
        if (iB < 0 || this.f52777c[iB] == AbstractC4124y.f52779a) {
            return;
        }
        this.f52777c[iB] = AbstractC4124y.f52779a;
        this.f52775a = true;
    }

    public void m(int i10) {
        if (this.f52777c[i10] != AbstractC4124y.f52779a) {
            this.f52777c[i10] = AbstractC4124y.f52779a;
            this.f52775a = true;
        }
    }

    public int n() {
        if (this.f52775a) {
            int i10 = this.f52778d;
            long[] jArr = this.f52776b;
            Object[] objArr = this.f52777c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC4124y.f52779a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f52775a = false;
            this.f52778d = i11;
        }
        return this.f52778d;
    }

    public Object o(int i10) {
        if (!(i10 >= 0 && i10 < this.f52778d)) {
            d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f52775a) {
            int i11 = this.f52778d;
            long[] jArr = this.f52776b;
            Object[] objArr = this.f52777c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC4124y.f52779a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f52775a = false;
            this.f52778d = i12;
        }
        return this.f52777c[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f52778d * 28);
        sb2.append('{');
        int i10 = this.f52778d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            Object objO = o(i11);
            if (objO != sb2) {
                sb2.append(objO);
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
