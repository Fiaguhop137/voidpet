package Ne;

import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;

/* JADX INFO: renamed from: Ne.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1235i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p410we.d f8164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p374ue.c f8165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p410we.a f8166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f8167d;

    public C1235i(p410we.d nameResolver, p374ue.c classProto, p410we.a metadataVersion, h0 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f8164a = nameResolver;
        this.f8165b = classProto;
        this.f8166c = metadataVersion;
        this.f8167d = sourceElement;
    }

    public final p410we.d a() {
        return this.f8164a;
    }

    public final p374ue.c b() {
        return this.f8165b;
    }

    public final p410we.a c() {
        return this.f8166c;
    }

    public final h0 d() {
        return this.f8167d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235i)) {
            return false;
        }
        C1235i c1235i = (C1235i) obj;
        return Intrinsics.b(this.f8164a, c1235i.f8164a) && Intrinsics.b(this.f8165b, c1235i.f8165b) && Intrinsics.b(this.f8166c, c1235i.f8166c) && Intrinsics.b(this.f8167d, c1235i.f8167d);
    }

    public int hashCode() {
        return (((((this.f8164a.hashCode() * 31) + this.f8165b.hashCode()) * 31) + this.f8166c.hashCode()) * 31) + this.f8167d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f8164a + ", classProto=" + this.f8165b + ", metadataVersion=" + this.f8166c + ", sourceElement=" + this.f8167d + ')';
    }
}
