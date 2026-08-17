package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1981d implements InterfaceC1991n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1984g[] f24337a;

    public C1981d(InterfaceC1984g[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f24337a = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC1991n
    public void f(InterfaceC1994q source, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new x();
        InterfaceC1984g[] interfaceC1984gArr = this.f24337a;
        if (interfaceC1984gArr.length > 0) {
            InterfaceC1984g interfaceC1984g = interfaceC1984gArr[0];
            throw null;
        }
        if (interfaceC1984gArr.length <= 0) {
            return;
        }
        InterfaceC1984g interfaceC1984g2 = interfaceC1984gArr[0];
        throw null;
    }
}
