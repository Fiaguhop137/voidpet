package p157ic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ic.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3606n extends AbstractC3613v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3606n(Object convertedValue) {
        super(null);
        Intrinsics.checkNotNullParameter(convertedValue, "convertedValue");
        this.f43936a = convertedValue;
    }

    public final Object a() {
        return this.f43936a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3606n) && Intrinsics.b(this.f43936a, ((C3606n) obj).f43936a);
    }

    public int hashCode() {
        return this.f43936a.hashCode();
    }

    public String toString() {
        return "ConvertedValue(convertedValue=" + this.f43936a + ")";
    }
}
