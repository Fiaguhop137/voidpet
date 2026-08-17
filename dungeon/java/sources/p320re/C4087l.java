package p320re;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: re.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4087l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC4086k f52554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52555b;

    public C4087l(EnumC4086k qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f52554a = qualifier;
        this.f52555b = z10;
    }

    public /* synthetic */ C4087l(EnumC4086k enumC4086k, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4086k, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ C4087l b(C4087l c4087l, EnumC4086k enumC4086k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4086k = c4087l.f52554a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4087l.f52555b;
        }
        return c4087l.a(enumC4086k, z10);
    }

    public final C4087l a(EnumC4086k qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new C4087l(qualifier, z10);
    }

    public final EnumC4086k c() {
        return this.f52554a;
    }

    public final boolean d() {
        return this.f52555b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4087l)) {
            return false;
        }
        C4087l c4087l = (C4087l) obj;
        return this.f52554a == c4087l.f52554a && this.f52555b == c4087l.f52555b;
    }

    public int hashCode() {
        return (this.f52554a.hashCode() * 31) + Boolean.hashCode(this.f52555b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f52554a + ", isForWarningOnly=" + this.f52555b + ')';
    }
}
