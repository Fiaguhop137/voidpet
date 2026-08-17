package J3;

import Ad.q;
import Ad.r;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p088ef.InterfaceC3299n;
import p339sf.E;
import p339sf.InterfaceC4186e;
import p339sf.InterfaceC4187f;

/* JADX INFO: loaded from: classes.dex */
final class c implements InterfaceC4187f, Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4186e f5736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3299n f5737b;

    public c(InterfaceC4186e interfaceC4186e, InterfaceC3299n interfaceC3299n) {
        this.f5736a = interfaceC4186e;
        this.f5737b = interfaceC3299n;
    }

    public void a(Throwable th) {
        try {
            this.f5736a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // p339sf.InterfaceC4187f
    public void f(InterfaceC4186e interfaceC4186e, IOException iOException) {
        if (interfaceC4186e.J1()) {
            return;
        }
        InterfaceC3299n interfaceC3299n = this.f5737b;
        q.a aVar = q.f327b;
        interfaceC3299n.resumeWith(q.b(r.a(iOException)));
    }

    @Override // p339sf.InterfaceC4187f
    public void g(InterfaceC4186e interfaceC4186e, E e10) {
        this.f5737b.resumeWith(q.b(e10));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.f48228a;
    }
}
