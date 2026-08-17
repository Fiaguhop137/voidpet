package p080e7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f40604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f40605b = new a("ALL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f40606c = new i("LEFT", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f40607d = new j("RIGHT", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f40608e = new l("TOP", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f40609f = new e("BOTTOM", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f40610g = new k("START", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f40611h = new g("END", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f40612i = new h("HORIZONTAL", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f40613j = new m("VERTICAL", 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f40614k = new d("BLOCK_START", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f40615l = new c("BLOCK_END", 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f40616m = new b("BLOCK", 11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ o[] f40617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f40618o;

    static final class a extends o {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 8;
        }
    }

    static final class b extends o {
        b(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 9;
        }
    }

    static final class c extends o {
        c(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 10;
        }
    }

    static final class d extends o {
        d(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 11;
        }
    }

    static final class e extends o {
        e(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 3;
        }
    }

    public static final class f {
        private f() {
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int i10) {
            switch (i10) {
                case 0:
                    return o.f40606c;
                case 1:
                    return o.f40608e;
                case 2:
                    return o.f40607d;
                case 3:
                    return o.f40609f;
                case 4:
                    return o.f40610g;
                case 5:
                    return o.f40611h;
                case 6:
                    return o.f40612i;
                case 7:
                    return o.f40613j;
                case 8:
                    return o.f40605b;
                case 9:
                    return o.f40616m;
                case 10:
                    return o.f40615l;
                case 11:
                    return o.f40614k;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i10);
            }
        }
    }

    static final class g extends o {
        g(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 5;
        }
    }

    static final class h extends o {
        h(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 6;
        }
    }

    static final class i extends o {
        i(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 0;
        }
    }

    static final class j extends o {
        j(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 2;
        }
    }

    static final class k extends o {
        k(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 4;
        }
    }

    static final class l extends o {
        l(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 1;
        }
    }

    static final class m extends o {
        m(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p080e7.o
        public int h() {
            return 7;
        }
    }

    static {
        o[] oVarArrE = e();
        f40617n = oVarArrE;
        f40618o = Gd.a.a(oVarArrE);
        f40604a = new f(null);
    }

    private o(String str, int i10) {
        super(str, i10);
    }

    public /* synthetic */ o(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ o[] e() {
        return new o[]{f40605b, f40606c, f40607d, f40608e, f40609f, f40610g, f40611h, f40612i, f40613j, f40614k, f40615l, f40616m};
    }

    public static EnumEntries g() {
        return f40618o;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f40617n.clone();
    }

    public abstract int h();
}
