package p022b3;

import S2.k;
import T1.a;
import U1.AbstractC1459a;
import U1.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f26266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f26267c;

    public j(List list) {
        this.f26265a = Collections.unmodifiableList(new ArrayList(list));
        this.f26266b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f26266b;
            jArr[i11] = dVar.f26236b;
            jArr[i11 + 1] = dVar.f26237c;
        }
        long[] jArr2 = this.f26266b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f26267c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // S2.k
    public int e(long j10) {
        int iD = S.d(this.f26267c, j10, false, false);
        if (iD < this.f26267c.length) {
            return iD;
        }
        return -1;
    }

    @Override // S2.k
    public List g(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f26265a.size(); i10++) {
            long[] jArr = this.f26266b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f26265a.get(i10);
                a aVar = dVar.f26235a;
                if (aVar.f11948e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new i());
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f26235a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // S2.k
    public long h(int i10) {
        AbstractC1459a.a(i10 >= 0);
        AbstractC1459a.a(i10 < this.f26267c.length);
        return this.f26267c[i10];
    }

    @Override // S2.k
    public int i() {
        return this.f26267c.length;
    }
}
