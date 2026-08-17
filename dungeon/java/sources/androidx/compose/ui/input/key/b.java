package androidx.compose.ui.input.key;

import V.k;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import p180k0.e;

/* JADX INFO: loaded from: classes.dex */
final class b extends k.c implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Function1 f21534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Function1 f21535p;

    public b(Function1 function1, Function1 function2) {
        this.f21534o = function1;
        this.f21535p = function2;
    }

    @Override // p180k0.e
    public boolean B0(KeyEvent keyEvent) {
        Function1 function1 = this.f21535p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(p180k0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p180k0.e
    public boolean P0(KeyEvent keyEvent) {
        Function1 function1 = this.f21534o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(p180k0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void W1(Function1 function1) {
        this.f21534o = function1;
    }

    public final void X1(Function1 function1) {
        this.f21535p = function1;
    }
}
