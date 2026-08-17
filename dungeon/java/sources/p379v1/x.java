package p379v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f55922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f55922b = readException;
    }

    public final Throwable b() {
        return this.f55922b;
    }
}
