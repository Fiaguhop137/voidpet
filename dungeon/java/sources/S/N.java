package S;

import kotlin.collections.AbstractC3952n;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f11314b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q.y[] f11315c = new Q.y[16];

    private final int b(Object obj, int i10) {
        int i11 = this.f11313a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f11314b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    Q.y yVar = this.f11315c[i13];
                    return obj == (yVar != null ? yVar.get() : null) ? i13 : c(i13, obj, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i10, Object obj, int i11) {
        int i12 = i10 - 1;
        while (true) {
            if (-1 >= i12 || this.f11314b[i12] != i11) {
                break;
            }
            Q.y yVar = this.f11315c[i12];
            if ((yVar != null ? yVar.get() : null) == obj) {
                return i12;
            }
            i12--;
        }
        int i13 = i10 + 1;
        int i14 = this.f11313a;
        while (i13 < i14) {
            if (this.f11314b[i13] != i11) {
                return -(i13 + 1);
            }
            Q.y yVar2 = this.f11315c[i13];
            if ((yVar2 != null ? yVar2.get() : null) == obj) {
                return i13;
            }
            i13++;
        }
        i13 = this.f11313a;
        return -(i13 + 1);
    }

    public final boolean a(Object obj) {
        int iB;
        int i10 = this.f11313a;
        int iA = Q.s.a(obj);
        if (i10 > 0) {
            iB = b(obj, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        Q.y[] yVarArr = this.f11315c;
        int length = yVarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            Q.y[] yVarArr2 = new Q.y[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(yVarArr, i11, yVarArr2, i13, i10 - i11);
            System.arraycopy(this.f11315c, 0, yVarArr2, 0, i11);
            AbstractC3952n.j(this.f11314b, iArr, i13, i11, i10);
            AbstractC3952n.o(this.f11314b, iArr, 0, 0, i11, 6, null);
            this.f11315c = yVarArr2;
            this.f11314b = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(yVarArr, i11, yVarArr, i14, i10 - i11);
            int[] iArr2 = this.f11314b;
            AbstractC3952n.j(iArr2, iArr2, i14, i11, i10);
        }
        this.f11315c[i11] = new Q.y(obj);
        this.f11314b[i11] = iA;
        this.f11313a++;
        return true;
    }

    public final int[] d() {
        return this.f11314b;
    }

    public final int e() {
        return this.f11313a;
    }

    public final Q.y[] f() {
        return this.f11315c;
    }

    public final void g(int i10) {
        this.f11313a = i10;
    }
}
