package If;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1112n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q f5540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f5541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f5542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f5543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f5544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f5545h;

    public C1112n(boolean z10, boolean z11, Q q10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f5538a = z10;
        this.f5539b = z11;
        this.f5540c = q10;
        this.f5541d = l10;
        this.f5542e = l11;
        this.f5543f = l12;
        this.f5544g = l13;
        this.f5545h = kotlin.collections.N.t(extras);
    }

    public /* synthetic */ C1112n(boolean z10, boolean z11, Q q10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : q10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? kotlin.collections.N.i() : map);
    }

    public static /* synthetic */ C1112n b(C1112n c1112n, boolean z10, boolean z11, Q q10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c1112n.f5538a;
        }
        if ((i10 & 2) != 0) {
            z11 = c1112n.f5539b;
        }
        if ((i10 & 4) != 0) {
            q10 = c1112n.f5540c;
        }
        if ((i10 & 8) != 0) {
            l10 = c1112n.f5541d;
        }
        if ((i10 & 16) != 0) {
            l11 = c1112n.f5542e;
        }
        if ((i10 & 32) != 0) {
            l12 = c1112n.f5543f;
        }
        if ((i10 & 64) != 0) {
            l13 = c1112n.f5544g;
        }
        if ((i10 & 128) != 0) {
            map = c1112n.f5545h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c1112n.a(z10, z11, q10, l10, l15, l16, l14, map2);
    }

    public final C1112n a(boolean z10, boolean z11, Q q10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new C1112n(z10, z11, q10, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f5543f;
    }

    public final Long d() {
        return this.f5541d;
    }

    public final Q e() {
        return this.f5540c;
    }

    public final boolean f() {
        return this.f5539b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f5538a) {
            arrayList.add("isRegularFile");
        }
        if (this.f5539b) {
            arrayList.add("isDirectory");
        }
        if (this.f5541d != null) {
            arrayList.add("byteCount=" + this.f5541d);
        }
        if (this.f5542e != null) {
            arrayList.add("createdAt=" + this.f5542e);
        }
        if (this.f5543f != null) {
            arrayList.add("lastModifiedAt=" + this.f5543f);
        }
        if (this.f5544g != null) {
            arrayList.add("lastAccessedAt=" + this.f5544g);
        }
        if (!this.f5545h.isEmpty()) {
            arrayList.add("extras=" + this.f5545h);
        }
        return CollectionsKt.s0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}
