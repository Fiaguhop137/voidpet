package p170j8;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2342k;
import p135h8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f46879a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2342k f46880b;

    public J(C2342k c2342k) {
        r.l(c2342k);
        this.f46880b = c2342k;
    }

    public final int a(Context context, int i10) {
        return this.f46879a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        r.l(context);
        r.l(fVar);
        int iH = 0;
        if (!fVar.e()) {
            return 0;
        }
        int iM = fVar.m();
        int iA = a(context, iM);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f46879a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f46879a.keyAt(i10);
            if (iKeyAt > iM && this.f46879a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iH == -1) {
            iH = this.f46880b.h(context, iM);
        }
        this.f46879a.put(iM, iH);
        return iH;
    }

    public final void c() {
        this.f46879a.clear();
    }
}
