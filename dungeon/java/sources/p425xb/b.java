package p425xb;

import If.InterfaceC1107i;
import If.K;
import kotlin.jvm.internal.Intrinsics;
import p339sf.D;
import p339sf.x;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f57450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f57451c;

    public b(D requestBody, c progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f57450b = requestBody;
        this.f57451c = progressListener;
    }

    @Override // p339sf.D
    public long a() {
        return this.f57450b.a();
    }

    @Override // p339sf.D
    public x b() {
        return this.f57450b.b();
    }

    @Override // p339sf.D
    public void f(InterfaceC1107i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC1107i interfaceC1107iC = K.c(new d(sink, this, this.f57451c));
        this.f57450b.f(interfaceC1107iC);
        interfaceC1107iC.flush();
    }
}
