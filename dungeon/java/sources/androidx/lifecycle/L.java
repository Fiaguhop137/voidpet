package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class L implements n3.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237n3.f f24291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f24293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f24294d;

    public L(p237n3.f savedStateRegistry, U viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f24291a = savedStateRegistry;
        this.f24294d = Ad.j.b(new K(viewModelStoreOwner));
    }

    private final M d() {
        return (M) this.f24294d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M f(U u10) {
        return J.e(u10);
    }

    @Override // n3.f.b
    public Bundle a() {
        Pair[] pairArr;
        Map mapI = kotlin.collections.N.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(Ad.v.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = p237n3.j.a(bundleA);
        Bundle bundle = this.f24293c;
        if (bundle != null) {
            p237n3.j.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((G) entry2.getValue()).a().a();
            if (!p237n3.c.f(p237n3.c.a(bundleA3))) {
                p237n3.j.c(bundleA2, str, bundleA3);
            }
        }
        this.f24292b = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.f24293c;
        if (bundle == null || !p237n3.c.b(p237n3.c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = p237n3.c.d(p237n3.c.a(bundle), key);
        if (bundleD == null) {
            Map mapI = kotlin.collections.N.i();
            if (mapI.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(Ad.v.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleD = p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            p237n3.j.a(bundleD);
        }
        p237n3.j.e(p237n3.j.a(bundle), key);
        if (p237n3.c.f(p237n3.c.a(bundle))) {
            this.f24293c = null;
        }
        return bundleD;
    }

    public final void e() {
        Pair[] pairArr;
        if (this.f24292b) {
            return;
        }
        Bundle bundleA = this.f24291a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapI = kotlin.collections.N.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(Ad.v.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA2 = p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA3 = p237n3.j.a(bundleA2);
        Bundle bundle = this.f24293c;
        if (bundle != null) {
            p237n3.j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            p237n3.j.b(bundleA3, bundleA);
        }
        this.f24293c = bundleA2;
        this.f24292b = true;
        d();
    }
}
