package De;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public abstract void a(InterfaceC1788b interfaceC1788b);

    public abstract void b(InterfaceC1788b interfaceC1788b, InterfaceC1788b interfaceC1788b2);

    public abstract void c(InterfaceC1788b interfaceC1788b, InterfaceC1788b interfaceC1788b2);

    public void d(InterfaceC1788b member, Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.D0(overridden);
    }
}
