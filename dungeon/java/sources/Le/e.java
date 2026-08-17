package Le;

import Re.AbstractC1388d0;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1791e f6628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f6629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1791e f6630c;

    public e(InterfaceC1791e classDescriptor, e eVar) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f6628a = classDescriptor;
        this.f6629b = eVar == null ? this : eVar;
        this.f6630c = classDescriptor;
    }

    @Override // Le.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1388d0 getType() {
        AbstractC1388d0 abstractC1388d0Q = this.f6628a.q();
        Intrinsics.checkNotNullExpressionValue(abstractC1388d0Q, "getDefaultType(...)");
        return abstractC1388d0Q;
    }

    public boolean equals(Object obj) {
        InterfaceC1791e interfaceC1791e = this.f6628a;
        e eVar = obj instanceof e ? (e) obj : null;
        return Intrinsics.b(interfaceC1791e, eVar != null ? eVar.f6628a : null);
    }

    public int hashCode() {
        return this.f6628a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // Le.h
    public final InterfaceC1791e u() {
        return this.f6628a;
    }
}
