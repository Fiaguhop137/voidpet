package p033be;

import Ad.j;
import Ad.m;
import Re.AbstractC1388d0;
import Re.S;
import Xd.i;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f26537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f26538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f26541e;

    public l(i builtIns, c fqName, Map allValueArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f26537a = builtIns;
        this.f26538b = fqName;
        this.f26539c = allValueArguments;
        this.f26540d = z10;
        this.f26541e = j.a(m.PUBLICATION, new k(this));
    }

    public /* synthetic */ l(i iVar, c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1388d0 c(l lVar) {
        return lVar.f26537a.p(lVar.f()).q();
    }

    @Override // p033be.c
    public Map a() {
        return this.f26539c;
    }

    @Override // p033be.c
    public c f() {
        return this.f26538b;
    }

    @Override // p033be.c
    public S getType() {
        Object value = this.f26541e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (S) value;
    }

    @Override // p033be.c
    public h0 k() {
        h0 NO_SOURCE = h0.f19733a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }
}
