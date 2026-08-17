package L8;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements p350t8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1152h f6445a;

    public T(C1152h c1152h) {
        this.f6445a = c1152h;
    }

    @Override // p350t8.a
    public final Task a(String str, int i10) {
        return this.f6445a.b(new M(str, i10));
    }

    @Override // p350t8.a
    public final Task b() {
        return this.f6445a.b(Q.f6443a);
    }

    @Override // p350t8.a
    public final Task c(String str) {
        return this.f6445a.b(new K(str));
    }

    @Override // p350t8.a
    public final Task d(String str) {
        return this.f6445a.b(new J(str));
    }
}
