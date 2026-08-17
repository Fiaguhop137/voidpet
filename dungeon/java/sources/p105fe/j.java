package p105fe;

import Ne.InterfaceC1248w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements InterfaceC1248w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f41887b = new j();

    private j() {
    }

    @Override // Ne.InterfaceC1248w
    public void a(InterfaceC1788b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // Ne.InterfaceC1248w
    public void b(InterfaceC1791e descriptor, List unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
