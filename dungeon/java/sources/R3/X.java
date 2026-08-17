package R3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p323s.C4102b;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10729a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10730b = new C4102b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10731c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator f10732d = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p199l1.d dVar, p199l1.d dVar2) {
            float fFloatValue = ((Float) dVar.f48589b).floatValue();
            float fFloatValue2 = ((Float) dVar2.f48589b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f10) {
        if (this.f10729a) {
            p077e4.k kVar = (p077e4.k) this.f10731c.get(str);
            if (kVar == null) {
                kVar = new p077e4.k();
                this.f10731c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator it = this.f10730b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    void b(boolean z10) {
        this.f10729a = z10;
    }
}
