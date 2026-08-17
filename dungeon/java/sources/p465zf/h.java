package p465zf;

import If.InterfaceC1108j;
import kotlin.jvm.internal.Intrinsics;
import p339sf.F;
import p339sf.x;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f58716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1108j f58717d;

    public h(String str, long j10, InterfaceC1108j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f58715b = str;
        this.f58716c = j10;
        this.f58717d = source;
    }

    @Override // p339sf.F
    public InterfaceC1108j P3() {
        return this.f58717d;
    }

    @Override // p339sf.F
    public long d() {
        return this.f58716c;
    }

    @Override // p339sf.F
    public x e() {
        String str = this.f58715b;
        if (str != null) {
            return x.f54081e.c(str);
        }
        return null;
    }
}
