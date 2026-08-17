package p450z0;

import Ad.InterfaceC0795e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class y extends o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f58377a = new y();

    public y() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4362a invoke(C4362a c4362a, C4362a c4362a2) {
        String strB;
        InterfaceC0795e interfaceC0795eA;
        if (c4362a == null || (strB = c4362a.b()) == null) {
            strB = c4362a2.b();
        }
        if (c4362a == null || (interfaceC0795eA = c4362a.a()) == null) {
            interfaceC0795eA = c4362a2.a();
        }
        return new C4362a(strB, interfaceC0795eA);
    }
}
