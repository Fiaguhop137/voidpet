package p254o2;

import U1.AbstractC1477t;
import p236n2.b0;
import p380v2.C4251n;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f50326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0[] f50327b;

    public c(int[] iArr, b0[] b0VarArr) {
        this.f50326a = iArr;
        this.f50327b = b0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f50327b.length];
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f50327b;
            if (i10 >= b0VarArr.length) {
                return iArr;
            }
            iArr[i10] = b0VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (b0 b0Var : this.f50327b) {
            b0Var.c0(j10);
        }
    }

    @Override // o2.f.b
    public O f(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f50326a;
            if (i12 >= iArr.length) {
                AbstractC1477t.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C4251n();
            }
            if (i11 == iArr[i12]) {
                return this.f50327b[i12];
            }
            i12++;
        }
    }
}
