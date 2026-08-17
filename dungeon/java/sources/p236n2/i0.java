package p236n2;

import U1.AbstractC1459a;
import U1.InterfaceC1470l;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1470l f49808c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f49807b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49806a = -1;

    public i0(InterfaceC1470l interfaceC1470l) {
        this.f49808c = interfaceC1470l;
    }

    public void a(int i10, Object obj) {
        if (this.f49806a == -1) {
            AbstractC1459a.g(this.f49807b.size() == 0);
            this.f49806a = 0;
        }
        if (this.f49807b.size() > 0) {
            SparseArray sparseArray = this.f49807b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC1459a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC1470l interfaceC1470l = this.f49808c;
                SparseArray sparseArray2 = this.f49807b;
                interfaceC1470l.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f49807b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f49807b.size(); i10++) {
            this.f49808c.accept(this.f49807b.valueAt(i10));
        }
        this.f49806a = -1;
        this.f49807b.clear();
    }

    public void c(int i10) {
        for (int size = this.f49807b.size() - 1; size >= 0 && i10 < this.f49807b.keyAt(size); size--) {
            this.f49808c.accept(this.f49807b.valueAt(size));
            this.f49807b.removeAt(size);
        }
        this.f49806a = this.f49807b.size() > 0 ? Math.min(this.f49806a, this.f49807b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f49807b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f49807b.keyAt(i12)) {
                return;
            }
            this.f49808c.accept(this.f49807b.valueAt(i11));
            this.f49807b.removeAt(i11);
            int i13 = this.f49806a;
            if (i13 > 0) {
                this.f49806a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object e(int i10) {
        if (this.f49806a == -1) {
            this.f49806a = 0;
        }
        while (true) {
            int i11 = this.f49806a;
            if (i11 <= 0 || i10 >= this.f49807b.keyAt(i11)) {
                break;
            }
            this.f49806a--;
        }
        while (this.f49806a < this.f49807b.size() - 1 && i10 >= this.f49807b.keyAt(this.f49806a + 1)) {
            this.f49806a++;
        }
        return this.f49807b.valueAt(this.f49806a);
    }

    public Object f() {
        SparseArray sparseArray = this.f49807b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f49807b.size() == 0;
    }
}
