package p111g2;

import R1.E;
import R1.r;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f42054n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f42056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f42057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f42058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f42059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f42060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f42061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f42062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f42063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f42064m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f42065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f42066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f42068d;

        public a(Uri uri, r rVar, String str, String str2) {
            this.f42065a = uri;
            this.f42066b = rVar;
            this.f42067c = str;
            this.f42068d = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f42069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f42070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f42072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f42073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f42074f;

        public b(Uri uri, r rVar, String str, String str2, String str3, String str4) {
            this.f42069a = uri;
            this.f42070b = rVar;
            this.f42071c = str;
            this.f42072d = str2;
            this.f42073e = str3;
            this.f42074f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new r.b().j0("0").W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(r rVar) {
            return new b(this.f42069a, rVar, this.f42071c, this.f42072d, this.f42073e, this.f42074f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f42054n = new i("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String str, List list, List list2, List list3, List list4, List list5, List list6, r rVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f42055d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f42056e = Collections.unmodifiableList(list2);
        this.f42057f = Collections.unmodifiableList(list3);
        this.f42058g = Collections.unmodifiableList(list4);
        this.f42059h = Collections.unmodifiableList(list5);
        this.f42060i = Collections.unmodifiableList(list6);
        this.f42061j = rVar;
        this.f42062k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f42063l = Collections.unmodifiableMap(map);
        this.f42064m = Collections.unmodifiableList(list8);
    }

    private static void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f42065a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List d(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                E e10 = (E) list2.get(i12);
                if (e10.f9911b == i10 && e10.f9912c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static i e(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new i("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f42069a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // p182k2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i a(List list) {
        String str = this.f42075a;
        List list2 = this.f42076b;
        List listD = d(this.f42056e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new i(str, list2, listD, list3, d(this.f42058g, 1, list), d(this.f42059h, 2, list), list3, this.f42061j, this.f42062k, this.f42077c, this.f42063l, this.f42064m);
    }
}
