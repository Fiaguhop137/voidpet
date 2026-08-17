package Je;

import Qe.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f5805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qe.b f5806b;

    public b(n storageManager, Iterable samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f5805a = samWithReceiverResolvers;
        this.f5806b = storageManager.h();
    }
}
