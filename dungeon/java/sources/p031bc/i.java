package p031bc;

import Gd.a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum i {
    Int8Array(0, 1, null),
    Int16Array(0, 1, null),
    Int32Array(0, 1, null),
    Uint8Array(0, 1, null),
    Uint8ClampedArray(0, 1, null),
    Uint16Array(0, 1, null),
    Uint32Array(0, 1, null),
    Float32Array(0, 1, null),
    Float64Array(0, 1, null),
    BigInt64Array(0, 1, null),
    BigUint64Array(0, 1, null);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26499n = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26500a;

    i(int i10) {
        this.f26500a = i10;
    }

    /* synthetic */ i(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? h.b() : i10);
    }

    public static EnumEntries g() {
        return f26499n;
    }

    public final int h() {
        return this.f26500a;
    }
}
