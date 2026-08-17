package androidx.compose.ui.input.rotary;

import V.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
final class b extends k.c implements p252o0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Function1 f21544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Function1 f21545p;

    public b(Function1 function1, Function1 function2) {
        this.f21544o = function1;
        this.f21545p = function2;
    }

    public final void W1(Function1 function1) {
        this.f21544o = function1;
    }

    public final void X1(Function1 function1) {
        this.f21545p = function1;
    }

    @Override // p252o0.a
    public boolean Z0(p252o0.b bVar) {
        Function1 function1 = this.f21544o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(bVar)).booleanValue();
        }
        return false;
    }

    @Override // p252o0.a
    public boolean l1(p252o0.b bVar) {
        Function1 function1 = this.f21545p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(bVar)).booleanValue();
        }
        return false;
    }
}
