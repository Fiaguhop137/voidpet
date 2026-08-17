package L8;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements p350t8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1162m f6446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1152h f6447b;

    public U(InterfaceC1162m interfaceC1162m, C1152h c1152h) {
        this.f6446a = interfaceC1162m;
        this.f6447b = c1152h;
    }

    @Override // p350t8.f
    public final Task a() {
        return this.f6446a.zzc();
    }

    @Override // p350t8.f
    public final Task b() {
        return this.f6446a.b();
    }
}
