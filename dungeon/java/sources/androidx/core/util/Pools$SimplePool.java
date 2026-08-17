package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;
import p199l1.e;

/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f23102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23103b;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f23102a = new Object[i10];
    }

    private final boolean b(Object obj) {
        int i10 = this.f23103b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23102a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // p199l1.e
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (b(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f23103b;
        Object[] objArr = this.f23102a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f23103b = i10 + 1;
        return true;
    }

    @Override // p199l1.e
    public Object acquire() {
        int i10 = this.f23103b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f23102a[i11];
        Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f23102a[i11] = null;
        this.f23103b--;
        return obj;
    }
}
