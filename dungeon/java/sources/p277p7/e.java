package p277p7;

import com.facebook.soloader.E;

/* JADX INFO: loaded from: classes2.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f50852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50853b = 0;

    public e(h... hVarArr) {
        this.f50852a = hVarArr;
    }

    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        h[] hVarArr;
        do {
            i10 = this.f50853b;
            hVarArr = this.f50852a;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f50853b = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
