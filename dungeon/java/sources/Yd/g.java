package Yd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17813c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f17814d = new g(CollectionsKt.o(f.a.f17809f, f.d.f17812f, f.b.f17810f, f.c.f17811f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17816b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f17814d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f17817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17818b;

        public b(f kind, int i10) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f17817a = kind;
            this.f17818b = i10;
        }

        public final f a() {
            return this.f17817a;
        }

        public final int b() {
            return this.f17818b;
        }

        public final f c() {
            return this.f17817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f17817a, bVar.f17817a) && this.f17818b == bVar.f17818b;
        }

        public int hashCode() {
            return (this.f17817a.hashCode() * 31) + Integer.hashCode(this.f17818b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f17817a + ", arity=" + this.f17818b + ')';
        }
    }

    public g(List kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f17815a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            p464ze.c cVarB = ((f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f17816b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(p464ze.c packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        b bVarC = c(packageFqName, className);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(p464ze.c packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<f> list = (List) this.f17816b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (StringsKt.O(className, fVar.a(), false, 2, null)) {
                String strSubstring = className.substring(fVar.a().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(fVar, numD.intValue());
                }
            }
        }
        return null;
    }
}
