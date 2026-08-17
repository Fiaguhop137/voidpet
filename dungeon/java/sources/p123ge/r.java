package p123ge;

import kotlin.jvm.internal.Intrinsics;
import p302qe.h;
import p302qe.x;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC3444h implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f42398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f fVar, Class klass) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f42398c = klass;
    }

    @Override // p302qe.h
    public x b() {
        return E.f42351a.a(this.f42398c);
    }
}
