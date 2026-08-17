package p356te;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import p410we.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0679a f54682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f54683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f54684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f54685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f54686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f54687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f54688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f54689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f54690i;

    /* JADX INFO: renamed from: te.a$a, reason: collision with other inner class name */
    public enum EnumC0679a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map f54692c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54701a;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f54700k = Gd.a.a(e());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0680a f54691b = new C0680a(null);

        /* JADX INFO: renamed from: te.a$a$a, reason: collision with other inner class name */
        public static final class C0680a {
            private C0680a() {
            }

            public /* synthetic */ C0680a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0679a a(int i10) {
                EnumC0679a enumC0679a = (EnumC0679a) EnumC0679a.f54692c.get(Integer.valueOf(i10));
                return enumC0679a == null ? EnumC0679a.UNKNOWN : enumC0679a;
            }
        }

        static {
            EnumC0679a[] enumC0679aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(e.e(N.e(enumC0679aArrValues.length), 16));
            for (EnumC0679a enumC0679a : enumC0679aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0679a.f54701a), enumC0679a);
            }
            f54692c = linkedHashMap;
        }

        EnumC0679a(int i10) {
            this.f54701a = i10;
        }

        public static final EnumC0679a h(int i10) {
            return f54691b.a(i10);
        }
    }

    public a(EnumC0679a kind, c metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f54682a = kind;
        this.f54683b = metadataVersion;
        this.f54684c = strArr;
        this.f54685d = strArr2;
        this.f54686e = strArr3;
        this.f54687f = str;
        this.f54688g = i10;
        this.f54689h = str2;
        this.f54690i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f54684c;
    }

    public final String[] b() {
        return this.f54685d;
    }

    public final EnumC0679a c() {
        return this.f54682a;
    }

    public final c d() {
        return this.f54683b;
    }

    public final String e() {
        String str = this.f54687f;
        if (this.f54682a == EnumC0679a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f54684c;
        if (this.f54682a != EnumC0679a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List listE = strArr != null ? AbstractC3952n.e(strArr) : null;
        return listE == null ? CollectionsKt.l() : listE;
    }

    public final String[] g() {
        return this.f54686e;
    }

    public final boolean i() {
        return h(this.f54688g, 2);
    }

    public final boolean j() {
        return h(this.f54688g, 16) && !h(this.f54688g, 32);
    }

    public String toString() {
        return this.f54682a + " version=" + this.f54683b;
    }
}
