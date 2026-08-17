package L8;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: L8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1166o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f6485a = new AtomicReference();

    public static InterfaceC1162m a(Application application) {
        AtomicReference atomicReference = f6485a;
        InterfaceC1162m interfaceC1162m = (InterfaceC1162m) atomicReference.get();
        if (interfaceC1162m != null) {
            return interfaceC1162m;
        }
        C1171q0 c1171q0A = v0.a();
        c1171q0A.a(9);
        c1171q0A.b(application.getPackageName());
        v0 v0VarC = c1171q0A.c();
        p404w8.o oVarA = p404w8.o.a(application);
        p359u.G.a(atomicReference, null, new C(application, oVarA, B8.b.a(), new G(application, oVarA, new C1164n(application, v0VarC))));
        return (InterfaceC1162m) p170j8.r.l((InterfaceC1162m) atomicReference.get());
    }
}
