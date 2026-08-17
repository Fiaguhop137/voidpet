package p067dc;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f39947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o thisType, String name) {
        super(name);
        Intrinsics.checkNotNullParameter(thisType, "thisType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f39947d = thisType;
    }

    public final o d() {
        return this.f39947d;
    }
}
