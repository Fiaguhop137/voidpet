package M1;

import Ad.v;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p128h1.c;
import p142hf.t;
import p237n3.f;
import p237n3.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f6783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f.b f6784e;

    public b(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f6780a = N.v(initialState);
        this.f6781b = new LinkedHashMap();
        this.f6782c = new LinkedHashMap();
        this.f6783d = new LinkedHashMap();
        this.f6784e = new a(this);
    }

    public /* synthetic */ b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? N.i() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle c(b bVar) {
        Pair[] pairArr;
        for (Map.Entry entry : N.t(bVar.f6783d).entrySet()) {
            bVar.d((String) entry.getKey(), ((t) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : N.t(bVar.f6781b).entrySet()) {
            bVar.d((String) entry2.getKey(), ((f.b) entry2.getValue()).a());
        }
        Map map = bVar.f6780a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(v.a((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        j.a(bundleA);
        return bundleA;
    }

    public final f.b b() {
        return this.f6784e;
    }

    public final void d(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f6780a.put(key, obj);
        t tVar = (t) this.f6782c.get(key);
        if (tVar != null) {
            tVar.setValue(obj);
        }
        t tVar2 = (t) this.f6783d.get(key);
        if (tVar2 != null) {
            tVar2.setValue(obj);
        }
    }
}
