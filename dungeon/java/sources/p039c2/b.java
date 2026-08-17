package p039c2;

import C9.AbstractC0879w;
import U1.S;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f26760d;

    public b() {
        this(new Random());
    }

    b(Random random) {
        this.f26759c = new HashMap();
        this.f26760d = random;
        this.f26757a = new HashMap();
        this.f26758b = new HashMap();
    }

    private static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) S.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    private List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f26757a);
        h(jElapsedRealtime, this.f26758b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p057d2.b bVar = (p057d2.b) list.get(i10);
            if (!this.f26757a.containsKey(bVar.f39638b) && !this.f26758b.containsKey(Integer.valueOf(bVar.f39639c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(p057d2.b bVar, p057d2.b bVar2) {
        int iCompare = Integer.compare(bVar.f39639c, bVar2.f39639c);
        return iCompare != 0 ? iCompare : bVar.f39638b.compareTo(bVar2.f39638b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((p057d2.b) list.get(i10)).f39639c));
        }
        return hashSet.size();
    }

    private static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private p057d2.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((p057d2.b) list.get(i11)).f39640d;
        }
        int iNextInt = this.f26760d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            p057d2.b bVar = (p057d2.b) list.get(i13);
            i12 += bVar.f39640d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (p057d2.b) AbstractC0879w.d(list);
    }

    public void e(p057d2.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f39638b, jElapsedRealtime, this.f26757a);
        int i10 = bVar.f39639c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f26758b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(((p057d2.b) listC.get(i10)).f39639c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f26757a.clear();
        this.f26758b.clear();
        this.f26759c.clear();
    }

    public p057d2.b j(List list) {
        List listC = c(list);
        if (listC.size() < 2) {
            return (p057d2.b) AbstractC0879w.c(listC, null);
        }
        Collections.sort(listC, new a());
        ArrayList arrayList = new ArrayList();
        int i10 = ((p057d2.b) listC.get(0)).f39639c;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            p057d2.b bVar = (p057d2.b) listC.get(i11);
            if (i10 != bVar.f39639c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (p057d2.b) listC.get(0);
            }
            arrayList.add(new Pair(bVar.f39638b, Integer.valueOf(bVar.f39640d)));
        }
        p057d2.b bVar2 = (p057d2.b) this.f26759c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        p057d2.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f26759c.put(arrayList, bVarK);
        return bVarK;
    }
}
