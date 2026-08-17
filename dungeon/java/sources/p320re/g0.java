package p320re;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f52530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f52533d;

    public g0(r0 r0Var, List parametersInfo, String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f52530a = r0Var;
        this.f52531b = parametersInfo;
        this.f52532c = str;
        g0 g0Var = null;
        if (str != null) {
            r0 r0VarA = r0Var != null ? r0Var.a() : null;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                r0 r0Var2 = (r0) it.next();
                arrayList.add(r0Var2 != null ? r0Var2.a() : null);
            }
            g0Var = new g0(r0VarA, arrayList, null);
        }
        this.f52533d = g0Var;
    }

    public final String a() {
        return this.f52532c;
    }

    public final List b() {
        return this.f52531b;
    }

    public final r0 c() {
        return this.f52530a;
    }

    public final g0 d() {
        return this.f52533d;
    }
}
