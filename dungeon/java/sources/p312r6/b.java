package p312r6;

import kotlin.jvm.internal.Intrinsics;
import p199l1.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f52398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52399b;

    public b(int i10) {
        this.f52398a = new Object[i10];
    }

    @Override // p199l1.e
    public synchronized boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i10 = this.f52399b;
        Object[] objArr = this.f52398a;
        if (i10 == objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f52399b = i10 + 1;
        return true;
    }

    @Override // p199l1.e
    public synchronized Object acquire() {
        int i10 = this.f52399b;
        if (i10 == 0) {
            return null;
        }
        int i11 = i10 - 1;
        this.f52399b = i11;
        Object obj = this.f52398a[i11];
        Intrinsics.d(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.f52398a[i11] = null;
        return obj;
    }

    public final synchronized void b() {
        try {
            int i10 = this.f52399b;
            for (int i11 = 0; i11 < i10; i11++) {
                this.f52398a[i11] = null;
            }
            this.f52399b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
