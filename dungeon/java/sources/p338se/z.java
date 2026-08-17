package p338se;

import Ne.C1250y;
import Pe.InterfaceC1291s;
import Pe.r;
import kotlin.jvm.internal.Intrinsics;
import p015ae.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements InterfaceC1291s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f53651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1250y f53652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f53654e;

    public z(x binaryClass, C1250y c1250y, boolean z10, r abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f53651b = binaryClass;
        this.f53652c = c1250y;
        this.f53653d = z10;
        this.f53654e = abiStability;
    }

    @Override // Pe.InterfaceC1291s
    public String a() {
        return "Class '" + this.f53651b.d().a().a() + '\'';
    }

    @Override // p015ae.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f19734a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final x d() {
        return this.f53651b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f53651b;
    }
}
