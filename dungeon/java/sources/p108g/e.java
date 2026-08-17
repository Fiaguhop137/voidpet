package p108g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1991n;
import androidx.lifecycle.InterfaceC1994q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.o;
import kotlin.sequences.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f41912h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f41913a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f41914b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f41915c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f41916d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f41917e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f41918f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f41919g = new Bundle();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p108g.b f41920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p126h.a f41921b;

        public a(p108g.b callback, p126h.a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f41920a = callback;
            this.f41921b = contract;
        }

        public final p108g.b a() {
            return this.f41920a;
        }

        public final p126h.a b() {
            return this.f41921b;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1987j f41922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f41923b;

        public c(AbstractC1987j lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f41922a = lifecycle;
            this.f41923b = new ArrayList();
        }

        public final void a(InterfaceC1991n observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f41922a.a(observer);
            this.f41923b.add(observer);
        }

        public final void b() {
            Iterator it = this.f41923b.iterator();
            while (it.hasNext()) {
                this.f41922a.d((InterfaceC1991n) it.next());
            }
            this.f41923b.clear();
        }
    }

    static final class d extends o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f41924a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(kotlin.random.c.f48371a.d(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: g.e$e, reason: collision with other inner class name */
    public static final class C0481e extends p108g.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p126h.a f41927c;

        C0481e(String str, p126h.a aVar) {
            this.f41926b = str;
            this.f41927c = aVar;
        }

        @Override // p108g.c
        public void b(Object obj, Y0.c cVar) throws Exception {
            Object obj2 = e.this.f41914b.get(this.f41926b);
            p126h.a aVar = this.f41927c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f41916d.add(this.f41926b);
                try {
                    e.this.i(iIntValue, this.f41927c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f41916d.remove(this.f41926b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p108g.c
        public void c() {
            e.this.p(this.f41926b);
        }
    }

    public static final class f extends p108g.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p126h.a f41930c;

        f(String str, p126h.a aVar) {
            this.f41929b = str;
            this.f41930c = aVar;
        }

        @Override // p108g.c
        public void b(Object obj, Y0.c cVar) throws Exception {
            Object obj2 = e.this.f41914b.get(this.f41929b);
            p126h.a aVar = this.f41930c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f41916d.add(this.f41929b);
                try {
                    e.this.i(iIntValue, this.f41930c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f41916d.remove(this.f41929b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p108g.c
        public void c() {
            e.this.p(this.f41929b);
        }
    }

    private final void d(int i10, String str) {
        this.f41913a.put(Integer.valueOf(i10), str);
        this.f41914b.put(str, Integer.valueOf(i10));
    }

    private final void g(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f41916d.contains(str)) {
            this.f41918f.remove(str);
            this.f41919g.putParcelable(str, new p108g.a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f41916d.remove(str);
        }
    }

    private final int h() {
        for (Number number : k.r(d.f41924a)) {
            if (!this.f41913a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(e this$0, String key, p108g.b callback, p126h.a contract, InterfaceC1994q interfaceC1994q, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(interfaceC1994q, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC1987j.a.ON_START != event) {
            if (AbstractC1987j.a.ON_STOP == event) {
                this$0.f41917e.remove(key);
                return;
            } else {
                if (AbstractC1987j.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f41917e.put(key, new a(callback, contract));
        if (this$0.f41918f.containsKey(key)) {
            Object obj = this$0.f41918f.get(key);
            this$0.f41918f.remove(key);
            callback.a(obj);
        }
        p108g.a aVar = (p108g.a) p128h1.b.a(this$0.f41919g, key, p108g.a.class);
        if (aVar != null) {
            this$0.f41919g.remove(key);
            callback.a(contract.c(aVar.j(), aVar.f()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f41914b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f41913a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f41917e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        String str = (String) this.f41913a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f41917e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f41919g.remove(str);
            this.f41918f.put(str, obj);
            return true;
        }
        p108g.b bVarA = aVar.a();
        Intrinsics.d(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f41916d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public abstract void i(int i10, p126h.a aVar, Object obj, Y0.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f41916d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f41919g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f41914b.containsKey(str)) {
                Integer num = (Integer) this.f41914b.remove(str);
                if (!this.f41919g.containsKey(str)) {
                    K.c(this.f41913a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f41914b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f41914b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f41916d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f41919g));
    }

    public final p108g.c l(String key, InterfaceC1994q lifecycleOwner, p126h.a contract, p108g.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1987j abstractC1987jY = lifecycleOwner.y();
        if (abstractC1987jY.b().g(AbstractC1987j.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + abstractC1987jY.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f41915c.get(key);
        if (cVar == null) {
            cVar = new c(abstractC1987jY);
        }
        cVar.a(new p108g.d(this, key, callback, contract));
        this.f41915c.put(key, cVar);
        return new C0481e(key, contract);
    }

    public final p108g.c m(String key, p126h.a contract, p108g.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f41917e.put(key, new a(callback, contract));
        if (this.f41918f.containsKey(key)) {
            Object obj = this.f41918f.get(key);
            this.f41918f.remove(key);
            callback.a(obj);
        }
        p108g.a aVar = (p108g.a) p128h1.b.a(this.f41919g, key, p108g.a.class);
        if (aVar != null) {
            this.f41919g.remove(key);
            callback.a(contract.c(aVar.j(), aVar.f()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f41916d.contains(key) && (num = (Integer) this.f41914b.remove(key)) != null) {
            this.f41913a.remove(num);
        }
        this.f41917e.remove(key);
        if (this.f41918f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f41918f.get(key));
            this.f41918f.remove(key);
        }
        if (this.f41919g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((p108g.a) p128h1.b.a(this.f41919g, key, p108g.a.class)));
            this.f41919g.remove(key);
        }
        c cVar = (c) this.f41915c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f41915c.remove(key);
        }
    }
}
