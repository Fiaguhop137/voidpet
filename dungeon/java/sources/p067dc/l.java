package p067dc;

import kotlin.jvm.internal.Intrinsics;
import p013ac.s;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f39945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f39946c;

    public l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f39944a = name;
    }

    public final k a() {
        return new k(this.f39944a, this.f39945b, this.f39946c);
    }

    public final void b(s sVar) {
        this.f39945b = sVar;
    }

    public final void c(s sVar) {
        this.f39946c = sVar;
    }
}
