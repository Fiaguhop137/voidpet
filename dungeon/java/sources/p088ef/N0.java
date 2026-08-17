package p088ef;

import Ed.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class N0 extends a implements B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N0 f40788b = new N0();

    private N0() {
        super(B0.f40749z1);
    }

    @Override // p088ef.B0
    public InterfaceC3312u O(InterfaceC3316w interfaceC3316w) {
        return O0.f40789a;
    }

    @Override // p088ef.B0
    public Object U(b bVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p088ef.B0
    public boolean a() {
        return true;
    }

    @Override // p088ef.B0
    public void d(CancellationException cancellationException) {
    }

    @Override // p088ef.B0
    public InterfaceC3286g0 k(boolean z10, boolean z11, Function1 function1) {
        return O0.f40789a;
    }

    @Override // p088ef.B0
    public CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p088ef.B0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // p088ef.B0
    public InterfaceC3286g0 u(Function1 function1) {
        return O0.f40789a;
    }
}
