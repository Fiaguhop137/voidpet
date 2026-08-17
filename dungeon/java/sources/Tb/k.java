package Tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1991n;
import androidx.lifecycle.InterfaceC1994q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p085ec.b f12412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Random f12413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f12414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f12416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f12417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f12418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f12419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f12420i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f12421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p108g.b f12422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Tb.d f12423c;

        public a(e fallbackCallback, p108g.b bVar, Tb.d contract) {
            Intrinsics.checkNotNullParameter(fallbackCallback, "fallbackCallback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f12421a = fallbackCallback;
            this.f12422b = bVar;
            this.f12423c = contract;
        }

        public final Tb.d a() {
            return this.f12423c;
        }

        public final e b() {
            return this.f12421a;
        }

        public final p108g.b c() {
            return this.f12422b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f12421a, aVar.f12421a) && Intrinsics.b(this.f12422b, aVar.f12422b) && Intrinsics.b(this.f12423c, aVar.f12423c);
        }

        public int hashCode() {
            int iHashCode = this.f12421a.hashCode() * 31;
            p108g.b bVar = this.f12422b;
            return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f12423c.hashCode();
        }

        public String toString() {
            return "CallbacksAndContract(fallbackCallback=" + this.f12421a + ", mainCallback=" + this.f12422b + ", contract=" + this.f12423c + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1987j f12424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f12425b;

        public b(AbstractC1987j lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f12424a = lifecycle;
            this.f12425b = new ArrayList();
        }

        public final void a(InterfaceC1991n observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f12424a.a(observer);
            this.f12425b.add(observer);
        }

        public final void b() {
            Iterator it = this.f12425b.iterator();
            while (it.hasNext()) {
                this.f12424a.d((InterfaceC1991n) it.next());
            }
            this.f12425b.clear();
        }

        public final AbstractC1987j c() {
            return this.f12424a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12426a;

        static {
            int[] iArr = new int[AbstractC1987j.a.values().length];
            try {
                iArr[AbstractC1987j.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1987j.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12426a = iArr;
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Tb.d f12427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tb.d f12428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f12429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f12430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f12431e;

        d(Tb.d dVar, k kVar, String str, e eVar) {
            this.f12428b = dVar;
            this.f12429c = kVar;
            this.f12430d = str;
            this.f12431e = eVar;
            this.f12427a = dVar;
        }

        @Override // Tb.f
        public void b(Serializable input, p108g.b callback) throws Exception {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Integer num = (Integer) this.f12429c.f12415d.get(this.f12430d);
            if (num == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f12428b + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch()");
            }
            int iIntValue = num.intValue();
            this.f12429c.f12418g.put(this.f12430d, new a(this.f12431e, callback, this.f12428b));
            this.f12429c.f12419h.put(this.f12430d, input);
            this.f12429c.f12417f.add(this.f12430d);
            try {
                this.f12429c.k(iIntValue, this.f12428b, input);
            } catch (Exception e10) {
                this.f12429c.f12417f.remove(this.f12430d);
                throw e10;
            }
        }
    }

    public k(p085ec.b currentActivityProvider) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f12412a = currentActivityProvider;
        this.f12413b = new Random();
        this.f12414c = new HashMap();
        this.f12415d = new HashMap();
        this.f12416e = new HashMap();
        this.f12417f = new ArrayList();
        this.f12418g = new HashMap();
        this.f12419h = new HashMap();
        this.f12420i = new Bundle();
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        AbstractC1987j abstractC1987jC;
        b bVar = (b) this.f12416e.get(str);
        AbstractC1987j.b bVarB = (bVar == null || (abstractC1987jC = bVar.c()) == null) ? null : abstractC1987jC.b();
        if ((aVar != null ? aVar.c() : null) != null && this.f12417f.contains(str)) {
            Object obj = this.f12419h.get(str);
            Intrinsics.d(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
            aVar.c().a(aVar.a().a((Serializable) obj, i10, intent));
            this.f12417f.remove(str);
            return;
        }
        if (bVarB == null || !bVarB.g(AbstractC1987j.b.STARTED) || aVar == null || !this.f12417f.contains(str)) {
            this.f12420i.putParcelable(str, new p108g.a(i10, intent));
            return;
        }
        Object obj2 = this.f12419h.get(str);
        Intrinsics.d(obj2, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
        Serializable serializable = (Serializable) obj2;
        aVar.b().a(serializable, aVar.a().a(serializable, i10, intent));
        this.f12417f.remove(str);
    }

    private final int i() {
        int iNextInt = this.f12413b.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f12414c.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.f12413b.nextInt(2147418112);
        }
    }

    private final androidx.appcompat.app.c j() {
        Activity activityA = this.f12412a.a();
        androidx.appcompat.app.c cVar = activityA instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) activityA : null;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Current Activity is not available at the moment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(k kVar, int i10, IntentSender.SendIntentException sendIntentException) {
        kVar.g(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(k kVar, String str, InterfaceC1994q interfaceC1994q, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(interfaceC1994q, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = c.f12426a[event.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            kVar.q(str);
            return;
        }
        a aVar = (a) kVar.f12418g.get(str);
        if (aVar == null) {
            return;
        }
        Bundle bundle = kVar.f12420i;
        p108g.a aVar2 = (p108g.a) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, p108g.a.class) : bundle.getParcelable(str));
        if (aVar2 != null) {
            kVar.f12420i.remove(str);
            Object obj = kVar.f12419h.get(str);
            Intrinsics.d(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.register");
            Serializable serializable = (Serializable) obj;
            Object objA = aVar.a().a(serializable, aVar2.j(), aVar2.f());
            if (aVar.c() != null) {
                aVar.c().a(objA);
            } else {
                aVar.b().a(serializable, objA);
            }
        }
    }

    public final boolean g(int i10, int i11, Intent intent) {
        String str = (String) this.f12414c.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f12418g.get(str));
        return true;
    }

    public final void k(int i10, Tb.d contract, Serializable input) {
        Bundle bundleExtra;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentB = contract.b(j(), input);
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        String action = intentB.getAction();
        if (action == null) {
            i11 = i10;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1837081951) {
                if (iHashCode == -591152331 && action.equals("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", p108g.g.class) : intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    Intrinsics.c(parcelableExtra);
                    p108g.g gVar = (p108g.g) parcelableExtra;
                    try {
                        i12 = i10;
                        try {
                            Y0.b.v(j(), gVar.l(), i12, gVar.f(), gVar.j(), gVar.k(), 0, bundle);
                            Unit unit = Unit.f48228a;
                            return;
                        } catch (IntentSender.SendIntentException e10) {
                            e = e10;
                            new Handler(Looper.getMainLooper()).post(new j(this, i12, e));
                            return;
                        }
                    } catch (IntentSender.SendIntentException e11) {
                        e = e11;
                        i12 = i10;
                    }
                }
                i11 = i10;
            } else {
                i11 = i10;
                if (action.equals("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")) {
                    String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    Y0.b.s(j(), stringArrayExtra, i11);
                    return;
                }
            }
        }
        Y0.b.u(j(), intentB, i11, bundle);
    }

    public final void m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n nVarE = new n(context).d("launchedKeys", this.f12417f).e("keyToRequestCode", this.f12415d);
        Map map = this.f12419h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f12417f.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        nVarE.f("keyToParamsForFallbackCallback", linkedHashMap).b("pendingResult", this.f12420i).c("random", this.f12413b).h();
    }

    public final f n(String key, InterfaceC1994q lifecycleOwner, Tb.d contract, e fallbackCallback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(fallbackCallback, "fallbackCallback");
        AbstractC1987j abstractC1987jY = lifecycleOwner.y();
        this.f12418g.put(key, new a(fallbackCallback, null, contract));
        if (this.f12415d.get(key) == null) {
            int i10 = i();
            this.f12414c.put(Integer.valueOf(i10), key);
            this.f12415d.put(key, Integer.valueOf(i10));
            Unit unit = Unit.f48228a;
        }
        i iVar = new i(this, key);
        b bVar = (b) this.f12416e.get(key);
        if (bVar == null) {
            bVar = new b(abstractC1987jY);
        }
        bVar.a(iVar);
        this.f12416e.put(key, bVar);
        return new d(contract, this, key, fallbackCallback);
    }

    public final void p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        ArrayList arrayListL = nVar.l("launchedKeys");
        if (arrayListL != null) {
            this.f12417f = arrayListL;
        }
        Map mapN = nVar.n("keyToParamsForFallbackCallback");
        if (mapN != null) {
            this.f12419h.putAll(mapN);
        }
        Bundle bundleI = nVar.i("pendingResult");
        if (bundleI != null) {
            this.f12420i.putAll(bundleI);
        }
        Serializable serializableK = nVar.k("random");
        if (serializableK != null) {
            this.f12413b = (Random) serializableK;
        }
        Map mapM = nVar.m("keyToRequestCode");
        if (mapM != null) {
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                this.f12415d.put(str, Integer.valueOf(iIntValue));
                this.f12414c.put(Integer.valueOf(iIntValue), str);
            }
        }
    }

    public final void q(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f12417f.contains(key) && (num = (Integer) this.f12415d.remove(key)) != null) {
        }
        this.f12418g.remove(key);
        if (this.f12420i.containsKey(key)) {
            Bundle bundle = this.f12420i;
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + " : " + (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(key, p108g.a.class) : bundle.getParcelable(key)));
            this.f12420i.remove(key);
        }
        b bVar = (b) this.f12416e.get(key);
        if (bVar != null) {
            bVar.b();
        }
    }
}
