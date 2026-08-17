package com.facebook.imagepipeline.memory;

import V4.k;
import android.util.SparseIntArray;
import p079e6.E;
import p079e6.F;
import p079e6.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f28943k;

    f(Y4.d dVar, E e10, F f10) {
        super(dVar, e10, f10);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(e10.f40481c);
        this.f28943k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f28943k;
            if (i10 >= iArr.length) {
                t();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void l(v vVar) {
        k.g(vVar);
        vVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int p(v vVar) {
        k.g(vVar);
        return vVar.a();
    }

    int D() {
        return this.f28943k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean v(v vVar) {
        k.g(vVar);
        return !vVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f28943k) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int q(int i10) {
        return i10;
    }
}
