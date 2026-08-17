package p176je;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p320re.C4087l;
import p320re.EnumC4086k;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4087l f47367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f47368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47369c;

    public w(C4087l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f47367a = nullabilityQualifier;
        this.f47368b = qualifierApplicabilityTypes;
        this.f47369c = z10;
    }

    public /* synthetic */ w(C4087l c4087l, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4087l, collection, (i10 & 4) != 0 ? c4087l.c() == EnumC4086k.NOT_NULL : z10);
    }

    public static /* synthetic */ w b(w wVar, C4087l c4087l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4087l = wVar.f47367a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f47368b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f47369c;
        }
        return wVar.a(c4087l, collection, z10);
    }

    public final w a(C4087l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new w(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f47369c;
    }

    public final C4087l d() {
        return this.f47367a;
    }

    public final Collection e() {
        return this.f47368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.b(this.f47367a, wVar.f47367a) && Intrinsics.b(this.f47368b, wVar.f47368b) && this.f47369c == wVar.f47369c;
    }

    public int hashCode() {
        return (((this.f47367a.hashCode() * 31) + this.f47368b.hashCode()) * 31) + Boolean.hashCode(this.f47369c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f47367a + ", qualifierApplicabilityTypes=" + this.f47368b + ", definitelyNotNull=" + this.f47369c + ')';
    }
}
