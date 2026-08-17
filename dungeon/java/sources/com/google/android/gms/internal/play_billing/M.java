package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f34477a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f34478b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    L f34479c;

    public final M a(Object obj, Object obj2) {
        int i10 = this.f34478b + 1;
        Object[] objArr = this.f34477a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 > length) {
                length = length + (length >> 1) + 1;
                if (length < i11) {
                    int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.f34477a = Arrays.copyOf(objArr, length);
        }
        F.a(obj, obj2);
        Object[] objArr2 = this.f34477a;
        int i12 = this.f34478b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f34478b = i12 + 1;
        return this;
    }

    public final N b() {
        L l10 = this.f34479c;
        if (l10 != null) {
            throw l10.a();
        }
        Y yG = Y.g(this.f34478b, this.f34477a, this);
        L l11 = this.f34479c;
        if (l11 == null) {
            return yG;
        }
        throw l11.a();
    }
}
