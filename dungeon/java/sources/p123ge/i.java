package p123ge;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4072a;
import p302qe.InterfaceC4074c;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC3444h implements InterfaceC4074c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Annotation f42383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, Annotation annotation) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f42383c = annotation;
    }

    @Override // p302qe.InterfaceC4074c
    public InterfaceC4072a a() {
        return new C3443g(this.f42383c);
    }
}
