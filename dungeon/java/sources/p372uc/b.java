package p372uc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends CodedException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f55046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String id2) {
        super("Failed to handle notification " + id2 + ", it has already been handled.", null, 2, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f55046c = id2;
    }
}
