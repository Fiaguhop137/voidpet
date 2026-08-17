package K8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f6041a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6042b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f6043c;

    b(int i10) {
    }

    public final b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f6041a.length;
        int i11 = this.f6042b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f6043c) {
            this.f6041a = Arrays.copyOf(this.f6041a, i10);
            this.f6043c = false;
        }
        Object[] objArr = this.f6041a;
        int i13 = this.f6042b;
        this.f6042b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
