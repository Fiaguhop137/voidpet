package p123ge;

import kotlin.jvm.internal.Intrinsics;
import p302qe.o;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends AbstractC3444h implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f42404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, Object value) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42404c = value;
    }

    @Override // p302qe.o
    public Object getValue() {
        return this.f42404c;
    }
}
