package p015ae;

import Ve.j;
import kotlin.jvm.internal.Intrinsics;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f19677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f19678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(f underlyingPropertyName, j underlyingType) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f19677a = underlyingPropertyName;
        this.f19678b = underlyingType;
    }

    @Override // p015ae.r0
    public boolean a(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.b(this.f19677a, name);
    }

    public final f c() {
        return this.f19677a;
    }

    public final j d() {
        return this.f19678b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f19677a + ", underlyingType=" + this.f19678b + ')';
    }
}
