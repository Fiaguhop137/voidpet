package L8;

import java.util.Arrays;

/* JADX INFO: renamed from: L8.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1163m0 extends AbstractC1165n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f6480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f6482c;

    AbstractC1163m0(int i10) {
        AbstractC1161l0.a(i10, "initialCapacity");
        this.f6480a = new Object[i10];
        this.f6481b = 0;
    }

    private final void c(int i10) {
        int length = this.f6480a.length;
        int iA = AbstractC1165n0.a(length, this.f6481b + i10);
        if (iA > length || this.f6482c) {
            this.f6480a = Arrays.copyOf(this.f6480a, iA);
            this.f6482c = false;
        }
    }

    public final AbstractC1163m0 b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f6480a;
        int i10 = this.f6481b;
        this.f6481b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
