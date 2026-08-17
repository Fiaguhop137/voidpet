package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC3952n;

/* JADX INFO: renamed from: androidx.compose.ui.layout.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1842e implements C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C[] f21590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f21591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f21592e;

    public C1842e(String str, C[] cArr) {
        this.f21589b = str;
        this.f21590c = cArr;
        r.a aVar = r.f21673a;
        ArrayList arrayList = new ArrayList(cArr.length);
        for (C c10 : cArr) {
            arrayList.add(c10.a());
        }
        r[] rVarArr = (r[]) arrayList.toArray(new r[0]);
        this.f21591d = t.b(aVar, (r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        r.a aVar2 = r.f21673a;
        C[] cArr2 = this.f21590c;
        ArrayList arrayList2 = new ArrayList(cArr2.length);
        for (C c11 : cArr2) {
            arrayList2.add(c11.b());
        }
        r[] rVarArr2 = (r[]) arrayList2.toArray(new r[0]);
        this.f21592e = t.b(aVar2, (r[]) Arrays.copyOf(rVarArr2, rVarArr2.length));
    }

    @Override // androidx.compose.ui.layout.C
    public r a() {
        return this.f21591d;
    }

    @Override // androidx.compose.ui.layout.C
    public r b() {
        return this.f21592e;
    }

    public String toString() {
        String str = this.f21589b;
        return str == null ? AbstractC3952n.n0(this.f21590c, null, "innermostOf(", ")", 0, null, null, 57, null) : str;
    }
}
