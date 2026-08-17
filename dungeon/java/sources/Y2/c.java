package Y2;

import U1.AbstractC1459a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f16850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f16851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f16854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f16855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f16856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f16857m;

    private c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f16845a = str;
        this.f16846b = str2;
        this.f16853i = str4;
        this.f16850f = gVar;
        this.f16851g = strArr;
        this.f16847c = str2 != null;
        this.f16848d = j10;
        this.f16849e = j11;
        this.f16852h = (String) AbstractC1459a.e(str3);
        this.f16854j = cVar;
        this.f16855k = new HashMap();
        this.f16856l = new HashMap();
    }

    private void b(Map map, T1.a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f16850f, this.f16851g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f16854j, map, i12);
            if ("p".equals(this.f16845a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f16845a);
        boolean zEquals2 = "div".equals(this.f16845a);
        if (z10 || zEquals || (zEquals2 && this.f16853i != null)) {
            long j10 = this.f16848d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f16849e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f16857m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f16857m.size(); i10++) {
            ((c) this.f16857m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            T1.a.b bVar = new T1.a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC1459a.e(((T1.a.b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f16852h)) {
            str = this.f16852h;
        }
        if (m(j10) && "div".equals(this.f16845a) && this.f16853i != null) {
            list.add(new Pair(str, this.f16853i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f16852h) ? str : this.f16852h;
            Iterator it = this.f16856l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f16855k.containsKey(str3) ? ((Integer) this.f16855k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (T1.a.b) AbstractC1459a.e((T1.a.b) map3.get(str3)), iIntValue, iIntValue2, ((e) AbstractC1459a.e((e) map2.get(str2))).f16881j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        this.f16855k.clear();
        this.f16856l.clear();
        if ("metadata".equals(this.f16845a)) {
            return;
        }
        if (!"".equals(this.f16852h)) {
            str = this.f16852h;
        }
        String str2 = str;
        if (this.f16847c && z10) {
            k(str2, map).append((CharSequence) AbstractC1459a.e(this.f16846b));
            return;
        }
        if ("br".equals(this.f16845a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f16855k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC1459a.e(((T1.a.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f16845a);
            int i10 = 0;
            while (i10 < g()) {
                f(i10).p(j10, z10 || zEquals, str2, map);
                i10++;
                j10 = j10;
                map = map;
            }
            Map map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                this.f16856l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC1459a.e(((T1.a.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f16857m == null) {
            this.f16857m = new ArrayList();
        }
        this.f16857m.add(cVar);
    }

    public c f(int i10) {
        List list = this.f16857m;
        if (list != null) {
            return (c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f16857m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j10, this.f16852h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f16852h, treeMap);
        o(j10, map, map2, this.f16852h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) AbstractC1459a.e((e) map2.get(pair.first));
                arrayList2.add(new T1.a.b().f(bitmapDecodeByteArray).k(eVar.f16873b).l(0).h(eVar.f16874c, 0).i(eVar.f16876e).n(eVar.f16877f).g(eVar.f16878g).r(eVar.f16881j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) AbstractC1459a.e((e) map2.get(entry.getKey()));
            T1.a.b bVar = (T1.a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC1459a.e(bVar.e()));
            bVar.h(eVar2.f16874c, eVar2.f16875d);
            bVar.i(eVar2.f16876e);
            bVar.k(eVar2.f16873b);
            bVar.n(eVar2.f16877f);
            bVar.q(eVar2.f16880i, eVar2.f16879h);
            bVar.r(eVar2.f16881j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f16851g;
    }

    public boolean m(long j10) {
        long j11 = this.f16848d;
        if (j11 == -9223372036854775807L && this.f16849e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f16849e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f16849e) {
            return j11 <= j10 && j10 < this.f16849e;
        }
        return true;
    }
}
