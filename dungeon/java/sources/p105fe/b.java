package p105fe;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;
import p015ae.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation f41878b;

    public b(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f41878b = annotation;
    }

    @Override // p015ae.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f19734a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f41878b;
    }
}
