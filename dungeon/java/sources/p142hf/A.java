package p142hf;

import Ed.b;
import p177jf.d;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f42860a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f42861b;

    @Override // p177jf.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(y yVar) {
        if (this.f42860a >= 0) {
            return false;
        }
        this.f42860a = yVar.X();
        return true;
    }

    @Override // p177jf.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b[] b(y yVar) {
        long j10 = this.f42860a;
        this.f42860a = -1L;
        this.f42861b = null;
        return yVar.W(j10);
    }
}
