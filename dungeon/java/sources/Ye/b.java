package Ye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public final g a(InterfaceC1811z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f17832b;
    }

    public abstract List b();
}
