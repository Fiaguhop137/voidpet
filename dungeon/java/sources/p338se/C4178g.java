package p338se;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: se.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4178g extends AbstractC4176e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f53585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f53586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f53587c;

    public C4178g(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f53585a = memberAnnotations;
        this.f53586b = propertyConstants;
        this.f53587c = annotationParametersDefaultValues;
    }

    @Override // p338se.AbstractC4176e.a
    public Map a() {
        return this.f53585a;
    }

    public final Map b() {
        return this.f53587c;
    }

    public final Map c() {
        return this.f53586b;
    }
}
