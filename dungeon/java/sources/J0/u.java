package J0;

import C0.AbstractC0829i;
import C0.C0819d;
import C0.S0;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f5678a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap f5679b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f5680c = new WeakHashMap();

    public final ClickableSpan a(C0819d.c cVar) {
        WeakHashMap weakHashMap = this.f5680c;
        Object lVar = weakHashMap.get(cVar);
        if (lVar == null) {
            lVar = new l((AbstractC0829i) cVar.g());
            weakHashMap.put(cVar, lVar);
        }
        return (ClickableSpan) lVar;
    }

    public final URLSpan b(C0819d.c cVar) {
        WeakHashMap weakHashMap = this.f5679b;
        Object uRLSpan = weakHashMap.get(cVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((AbstractC0829i.b) cVar.g()).c());
            weakHashMap.put(cVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan c(S0 s10) {
        WeakHashMap weakHashMap = this.f5678a;
        Object uRLSpan = weakHashMap.get(s10);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(s10.a());
            weakHashMap.put(s10, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
