package Se;

import Re.S;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f11640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f11641b;

    public u(S type, u uVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f11640a = type;
        this.f11641b = uVar;
    }

    public final u a() {
        return this.f11641b;
    }

    public final S b() {
        return this.f11640a;
    }
}
