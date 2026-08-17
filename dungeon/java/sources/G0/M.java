package G0;

import C0.N0;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static final Executor d(Choreographer choreographer) {
        return new K(choreographer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new L(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, q qVar, G g10) {
        int iD = qVar.d();
        p.a aVar = p.f3783b;
        int i10 = 6;
        if (p.l(iD, aVar.a())) {
            if (!qVar.g()) {
                i10 = 0;
            }
        } else if (p.l(iD, aVar.e())) {
            i10 = 1;
        } else if (p.l(iD, aVar.c())) {
            i10 = 2;
        } else if (p.l(iD, aVar.d())) {
            i10 = 5;
        } else if (p.l(iD, aVar.f())) {
            i10 = 7;
        } else if (p.l(iD, aVar.g())) {
            i10 = 3;
        } else if (p.l(iD, aVar.h())) {
            i10 = 4;
        } else if (!p.l(iD, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        qVar.f();
        int iE = qVar.e();
        w.a aVar2 = w.f3812a;
        if (w.k(iE, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (w.k(iE, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (w.k(iE, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (w.k(iE, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (w.k(iE, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (w.k(iE, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (w.k(iE, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (w.k(iE, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!w.k(iE, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!qVar.g() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (p.l(qVar.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = qVar.c();
            v.a aVar3 = v.f3806a;
            if (v.f(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (v.f(iC, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (v.f(iC, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (qVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = N0.k(g10.g());
        editorInfo.initialSelEnd = N0.g(g10.g());
        p253o1.c.f(editorInfo, g10.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f.c().v(editorInfo);
        }
    }
}
