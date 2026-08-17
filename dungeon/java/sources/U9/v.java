package U9;

import T8.L;
import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z1.f.a f13421b = p451z1.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z1.f.a f13422c = p451z1.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1.f.a f13423d = p451z1.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.c f13424a;

    public v(Context context, String str) {
        this.f13424a = new M9.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit a(long j10, p451z1.c cVar) {
        cVar.i(f13421b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(v vVar, String str, String str2, z1.f.a aVar, p451z1.c cVar) {
        vVar.getClass();
        z1.f.a aVar2 = f13423d;
        if (((String) M9.d.a(cVar, aVar2, "")).equals(str)) {
            z1.f.a aVarI = vVar.i(cVar, str);
            if (aVarI == null || aVarI.a().equals(str2)) {
                return null;
            }
            vVar.q(cVar, aVar, str);
            return null;
        }
        z1.f.a aVar3 = f13422c;
        long jLongValue = ((Long) M9.d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = vVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) M9.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(v vVar, p451z1.c cVar) {
        vVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                z1.f.a aVar = (z1.f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = vVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.i(aVar, L.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.h(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f13422c);
            return null;
        }
        cVar.i(f13422c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(v vVar, String str, p451z1.c cVar) {
        vVar.getClass();
        cVar.i(f13423d, str);
        vVar.l(cVar, str);
        return null;
    }

    private synchronized long e(p451z1.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) M9.d.a(cVar, f13422c, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((z1.f.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(p451z1.i.h(strA), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f13422c, Long.valueOf(j10));
        } catch (Throwable th) {
            throw th;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized z1.f.a i(p451z1.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return p451z1.i.h(((z1.f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(p451z1.c cVar, String str) {
        try {
            z1.f.a aVarI = i(cVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) M9.d.a(cVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarI);
            } else {
                cVar.i(aVarI, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void q(p451z1.c cVar, z1.f.a aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) M9.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void f() {
        this.f13424a.g(new t(this));
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f13424a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(w.a(((z1.f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void k() {
        this.f13424a.g(new u(this, h(System.currentTimeMillis())));
    }

    synchronized boolean m(long j10) {
        return n(f13421b, j10);
    }

    synchronized boolean n(z1.f.a aVar, long j10) {
        if (j(((Long) this.f13424a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f13424a.k(aVar, Long.valueOf(j10));
        return true;
    }

    synchronized void o(long j10, String str) {
        this.f13424a.g(new s(this, h(j10), str, p451z1.i.h(str)));
    }

    synchronized void p(long j10) {
        this.f13424a.g(new r(j10));
    }
}
