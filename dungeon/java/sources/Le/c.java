package Le;

import Re.S;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1787a f6625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p464ze.f f6626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1787a declarationDescriptor, S receiverType, p464ze.f fVar, g gVar) {
        super(receiverType, gVar);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f6625c = declarationDescriptor;
        this.f6626d = fVar;
    }

    @Override // Le.f
    public p464ze.f a() {
        return this.f6626d;
    }

    public InterfaceC1787a c() {
        return this.f6625c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
