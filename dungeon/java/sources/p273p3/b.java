package p273p3;

import Ad.v;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1994q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p237n3.c;
import p237n3.f;
import p237n3.i;
import p237n3.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f50754i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f50755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f50756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f50757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f50759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f50760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50762h;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(i owner, Function0 onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f50755a = owner;
        this.f50756b = onAttach;
        this.f50757c = new c();
        this.f50758d = new LinkedHashMap();
        this.f50762h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, InterfaceC1994q interfaceC1994q, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(interfaceC1994q, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1987j.a.ON_START) {
            bVar.f50762h = true;
        } else if (event == AbstractC1987j.a.ON_STOP) {
            bVar.f50762h = false;
        }
    }

    public final Bundle c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f50761g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f50760f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = c.a(bundle);
        Bundle bundleC = c.b(bundleA, key) ? c.c(bundleA, key) : null;
        j.e(j.a(bundle), key);
        if (c.f(c.a(bundle))) {
            this.f50760f = null;
        }
        return bundleC;
    }

    public final f.b d(String key) {
        f.b bVar;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f50757c) {
            Iterator it = this.f50758d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (Intrinsics.b(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f50762h;
    }

    public final void f() {
        if (this.f50755a.y().b() != AbstractC1987j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f50759e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f50756b.invoke();
        this.f50755a.y().a(new p273p3.a(this));
        this.f50759e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f50759e) {
            f();
        }
        if (this.f50755a.y().b().g(AbstractC1987j.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f50755a.y().b()).toString());
        }
        if (this.f50761g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null) {
            Bundle bundleA = c.a(bundle);
            if (c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f50760f = bundleC;
        this.f50761g = true;
    }

    public final void i(Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Map mapI = N.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(v.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = p128h1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = j.a(bundleA);
        Bundle bundle = this.f50760f;
        if (bundle != null) {
            j.b(bundleA2, bundle);
        }
        synchronized (this.f50757c) {
            try {
                for (Map.Entry entry2 : this.f50758d.entrySet()) {
                    j.c(bundleA2, (String) entry2.getKey(), ((f.b) entry2.getValue()).a());
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c.f(c.a(bundleA))) {
            return;
        }
        j.c(j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, f.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.f50757c) {
            if (this.f50758d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f50758d.put(key, provider);
            Unit unit = Unit.f48228a;
        }
    }

    public final void k(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f50757c) {
        }
    }
}
