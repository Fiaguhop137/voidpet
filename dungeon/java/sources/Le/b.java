package Le;

import Re.S;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1791e f6623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p464ze.f f6624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1791e classDescriptor, S receiverType, p464ze.f fVar, g gVar) {
        super(receiverType, gVar);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f6623c = classDescriptor;
        this.f6624d = fVar;
    }

    @Override // Le.f
    public p464ze.f a() {
        return this.f6624d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f6623c + " }";
    }
}
