package p015ae;

import java.util.List;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(List underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f19688a = underlyingPropertyNamesToTypes;
        this.f19689b = N.r(c());
    }

    @Override // p015ae.r0
    public boolean a(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f19689b.containsKey(name);
    }

    public List c() {
        return this.f19688a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
