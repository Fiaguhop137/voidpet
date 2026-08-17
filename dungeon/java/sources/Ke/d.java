package Ke;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f6190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f6191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f6192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f6193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f6194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f6195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f6196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f6197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f6198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f6199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f6200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f6201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f6202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f6203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f6204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f6205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f6206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f6207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f6208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f6209z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6211b;

    public static final class a {

        /* JADX INFO: renamed from: Ke.d$a$a, reason: collision with other inner class name */
        private static final class C0116a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f6212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f6213b;

            public C0116a(int i10, String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f6212a = i10;
                this.f6213b = name;
            }

            public final int a() {
                return this.f6212a;
            }

            public final String b() {
                return this.f6213b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = d.f6187d;
            d.f6187d <<= 1;
            return i10;
        }

        public final int b() {
            return d.f6194k;
        }

        public final int c() {
            return d.f6195l;
        }

        public final int d() {
            return d.f6192i;
        }

        public final int e() {
            return d.f6188e;
        }

        public final int f() {
            return d.f6191h;
        }

        public final int g() {
            return d.f6189f;
        }

        public final int h() {
            return d.f6190g;
        }

        public final int i() {
            return d.f6193j;
        }
    }

    static {
        a.C0116a c0116a;
        a.C0116a c0116a2;
        a aVar = new a(null);
        f6186c = aVar;
        f6187d = 1;
        int iJ = aVar.j();
        f6188e = iJ;
        int iJ2 = aVar.j();
        f6189f = iJ2;
        int iJ3 = aVar.j();
        f6190g = iJ3;
        int iJ4 = aVar.j();
        f6191h = iJ4;
        int iJ5 = aVar.j();
        f6192i = iJ5;
        int iJ6 = aVar.j();
        f6193j = iJ6;
        int iJ7 = aVar.j() - 1;
        f6194k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f6195l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f6196m = i11;
        int i12 = iJ5 | iJ6;
        f6197n = i12;
        f6198o = new d(iJ7, null, 2, null);
        f6199p = new d(i12, null, 2, null);
        f6200q = new d(iJ, null, 2, null);
        f6201r = new d(iJ2, null, 2, null);
        f6202s = new d(iJ3, null, 2, null);
        f6203t = new d(i10, null, 2, null);
        f6204u = new d(iJ4, null, 2, null);
        f6205v = new d(iJ5, null, 2, null);
        f6206w = new d(iJ6, null, 2, null);
        f6207x = new d(i11, null, 2, null);
        Field[] fields = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i13 = dVar.f6211b;
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0116a2 = new a.C0116a(i13, name);
            } else {
                c0116a2 = null;
            }
            if (c0116a2 != null) {
                arrayList2.add(c0116a2);
            }
        }
        f6208y = arrayList2;
        Field[] fields2 = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                c0116a = new a.C0116a(iIntValue, name2);
            } else {
                c0116a = null;
            }
            if (c0116a != null) {
                arrayList5.add(c0116a);
            }
        }
        f6209z = arrayList5;
    }

    public d(int i10, List excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f6210a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f6211b = i10;
    }

    public /* synthetic */ d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt.l() : list);
    }

    public final boolean a(int i10) {
        return (i10 & this.f6211b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return Intrinsics.b(this.f6210a, dVar.f6210a) && this.f6211b == dVar.f6211b;
    }

    public int hashCode() {
        return (this.f6210a.hashCode() * 31) + this.f6211b;
    }

    public final List l() {
        return this.f6210a;
    }

    public final int m() {
        return this.f6211b;
    }

    public final d n(int i10) {
        int i11 = i10 & this.f6211b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f6210a);
    }

    public String toString() {
        Object next;
        Iterator it = f6208y.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a.C0116a) next).a() != this.f6211b);
        a.C0116a c0116a = (a.C0116a) next;
        String strB = c0116a != null ? c0116a.b() : null;
        if (strB == null) {
            List<a.C0116a> list = f6209z;
            ArrayList arrayList = new ArrayList();
            for (a.C0116a c0116a2 : list) {
                String strB2 = a(c0116a2.a()) ? c0116a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = CollectionsKt.s0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f6210a + ')';
    }
}
