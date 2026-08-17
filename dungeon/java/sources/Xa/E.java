package Xa;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1623d f15408a = new C1623d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15409b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f15410c = Ad.j.b(new Xa.D());

    public static final class A extends E {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f15411h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f15412i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f15413j = EnumC1656p.SkuNotFound.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f15415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f15416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f15417g;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return A.f15413j;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String sku) {
            super(null);
            Intrinsics.checkNotNullParameter(sku, "sku");
            this.f15414d = sku;
            String strG = EnumC1656p.SkuNotFound.g();
            this.f15415e = strG;
            this.f15416f = strG;
            this.f15417g = "SKU not found";
        }

        @Override // Xa.E
        public String d() {
            return this.f15416f;
        }

        public final String g() {
            return this.f15414d;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return this.f15417g;
        }
    }

    public static final class B extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final B f15418d = new B();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15419e = "sku-offer-mismatch";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15420f = "SKU and offer token count mismatch";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15421g = 8;

        private B() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15419e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15420f;
        }
    }

    public static final class C extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C f15422d = new C();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15426h;

        static {
            String strG = EnumC1656p.Unknown.g();
            f15423e = strG;
            f15424f = strG;
            f15425g = "Unknown error";
            f15426h = 8;
        }

        private C() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15424f;
        }

        public final String f() {
            return f15423e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15425g;
        }
    }

    public static final class D extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final D f15427d = new D();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15431h;

        static {
            String strG = EnumC1656p.UserCancelled.g();
            f15428e = strG;
            f15429f = strG;
            f15430g = "User cancelled the operation";
            f15431h = 8;
        }

        private D() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15429f;
        }

        public final String f() {
            return f15428e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15430g;
        }
    }

    /* JADX INFO: renamed from: Xa.E$E, reason: collision with other inner class name */
    public static final class C0209E extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0209E f15432d = new C0209E();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15436h;

        static {
            String strG = EnumC1656p.TransactionValidationFailed.g();
            f15433e = strG;
            f15434f = strG;
            f15435g = "Verification failed";
            f15436h = 8;
        }

        private C0209E() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15434f;
        }

        public final String f() {
            return f15433e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15435g;
        }
    }

    /* JADX INFO: renamed from: Xa.E$a, reason: case insensitive filesystem */
    public static final class C1620a extends E {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0210a f15437h = new C0210a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f15438i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f15439j = EnumC1656p.BillingUnavailable.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f15441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f15442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f15443g;

        /* JADX INFO: renamed from: Xa.E$a$a, reason: collision with other inner class name */
        public static final class C0210a {
            private C0210a() {
            }

            public /* synthetic */ C0210a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1620a(String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.f15440d = details;
            String strG = EnumC1656p.BillingUnavailable.g();
            this.f15441e = strG;
            this.f15442f = strG;
            this.f15443g = details;
        }

        @Override // Xa.E
        public String d() {
            return this.f15442f;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return this.f15443g;
        }
    }

    /* JADX INFO: renamed from: Xa.E$b, reason: case insensitive filesystem */
    public static final class C1621b extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1621b f15444d = new C1621b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15447g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15448h;

        static {
            String strG = EnumC1656p.ServiceError.g();
            f15445e = strG;
            f15446f = strG;
            f15447g = "Billing error";
            f15448h = 8;
        }

        private C1621b() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15446f;
        }

        public final String f() {
            return f15445e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15447g;
        }
    }

    /* JADX INFO: renamed from: Xa.E$c, reason: case insensitive filesystem */
    public static final class C1622c extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1622c f15449d = new C1622c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15453h;

        static {
            String strG = EnumC1656p.BillingUnavailable.g();
            f15450e = strG;
            f15451f = strG;
            f15452g = "Billing API version is not supported";
            f15453h = 8;
        }

        private C1622c() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15451f;
        }

        public final String f() {
            return f15450e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15452g;
        }
    }

    /* JADX INFO: renamed from: Xa.E$d, reason: case insensitive filesystem */
    public static final class C1623d {
        private C1623d() {
        }

        public /* synthetic */ C1623d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map c() {
            return (Map) E.f15410c.getValue();
        }

        public final String a(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            String str = (String) c().get(code);
            return str == null ? "Unknown error occurred" : str;
        }

        public final Map b() {
            return c();
        }

        public final String d(E error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return error.d();
        }
    }

    public static final class e extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f15454d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15458h;

        static {
            String strG = EnumC1656p.DeveloperError.g();
            f15455e = strG;
            f15456f = strG;
            f15457g = "Invalid arguments provided to the API";
            f15458h = 8;
        }

        private e() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15456f;
        }

        public final String f() {
            return f15455e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15457g;
        }
    }

    public static final class f extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f15459d = new f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15460e = "empty-sku-list";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15461f = "SKU list cannot be empty";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15462g = 8;

        private f() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15460e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15461f;
        }
    }

    public static final class g extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f15463d = new g();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15467h;

        static {
            String strG = EnumC1656p.FeatureNotSupported.g();
            f15464e = strG;
            f15465f = strG;
            f15466g = "Requested feature is not supported by Play Store";
            f15467h = 8;
        }

        private g() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15465f;
        }

        public final String f() {
            return f15464e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15466g;
        }
    }

    public static final class h extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f15468d = new h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15472h;

        static {
            String strG = EnumC1656p.InitConnection.g();
            f15469e = strG;
            f15470f = strG;
            f15471g = "Failed to initialize billing connection";
            f15472h = 8;
        }

        private h() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15470f;
        }

        public final String f() {
            return f15469e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15471g;
        }
    }

    public static final class i extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f15473d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15477h;

        static {
            String strG = EnumC1656p.PurchaseVerificationFailed.g();
            f15474e = strG;
            f15475f = strG;
            f15476g = "Purchase verification failed";
            f15477h = 8;
        }

        private i() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15475f;
        }

        public final String f() {
            return f15474e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15476g;
        }
    }

    public static final class j extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f15478d = new j();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15482h;

        static {
            String strG = EnumC1656p.AlreadyOwned.g();
            f15479e = strG;
            f15480f = strG;
            f15481g = "Item is already owned";
            f15482h = 8;
        }

        private j() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15480f;
        }

        public final String f() {
            return f15479e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15481g;
        }
    }

    public static final class k extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f15483d = new k();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15487h;

        static {
            String strG = EnumC1656p.ItemNotOwned.g();
            f15484e = strG;
            f15485f = strG;
            f15486g = "Item is not owned";
            f15487h = 8;
        }

        private k() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15485f;
        }

        public final String f() {
            return f15484e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15486g;
        }
    }

    public static final class l extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final l f15488d = new l();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15492h;

        static {
            String strG = EnumC1656p.ItemUnavailable.g();
            f15489e = strG;
            f15490f = strG;
            f15491g = "Requested product is not available for purchase";
            f15492h = 8;
        }

        private l() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15490f;
        }

        public final String f() {
            return f15489e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15491g;
        }
    }

    public static final class m extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m f15493d = new m();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15497h;

        static {
            String strG = EnumC1656p.ActivityUnavailable.g();
            f15494e = strG;
            f15495f = strG;
            f15496g = "Current activity is not available";
            f15497h = 8;
        }

        private m() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15495f;
        }

        public final String f() {
            return f15494e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15496g;
        }
    }

    public static final class n extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f15498d = new n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15502h;

        static {
            String strG = EnumC1656p.NetworkError.g();
            f15499e = strG;
            f15500f = strG;
            f15501g = "Network connection error";
            f15502h = 8;
        }

        private n() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15500f;
        }

        public final String f() {
            return f15499e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15501g;
        }
    }

    public static final class o extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final o f15503d = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15504e = "not-prepared";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15505f = "Billing client not ready";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15506g = 8;

        private o() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15504e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15505f;
        }
    }

    public static final class p extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final p f15507d = new p();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15511h;

        static {
            String strG = EnumC1656p.UserError.g();
            f15508e = strG;
            f15509f = strG;
            f15510g = "Payment not allowed";
            f15511h = 8;
        }

        private p() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15509f;
        }

        public final String f() {
            return f15508e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15510g;
        }
    }

    public static final class q extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f15512d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f15513e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15514f = EnumC1656p.SkuNotFound.g();

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return q.f15514f;
            }
        }
    }

    public static final class r extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final r f15515d = new r();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15519h;

        static {
            String strG = EnumC1656p.UserCancelled.g();
            f15516e = strG;
            f15517f = strG;
            f15518g = "Purchase was cancelled by the user";
            f15519h = 8;
        }

        private r() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15517f;
        }

        public final String f() {
            return f15516e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15518g;
        }
    }

    public static final class s extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final s f15520d = new s();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15524h;

        static {
            String strG = EnumC1656p.DeferredPayment.g();
            f15521e = strG;
            f15522f = strG;
            f15523g = "Purchase was deferred";
            f15524h = 8;
        }

        private s() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15522f;
        }

        public final String f() {
            return f15521e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15523g;
        }
    }

    public static final class t extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f15525d = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15527f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15528g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15529h;

        static {
            String strG = EnumC1656p.PurchaseError.g();
            f15526e = strG;
            f15527f = strG;
            f15528g = "Purchase failed";
            f15529h = 8;
        }

        private t() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15527f;
        }

        public final String f() {
            return f15526e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15528g;
        }
    }

    public static final class u extends E {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f15530g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15531h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f15532i = EnumC1656p.PurchaseVerificationFailed.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f15534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f15535f;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String providerError) {
            super(null);
            Intrinsics.checkNotNullParameter(providerError, "providerError");
            this.f15533d = providerError;
            this.f15534e = EnumC1656p.PurchaseVerificationFailed.g();
            this.f15535f = "Purchase verification failed: " + providerError;
        }

        @Override // Xa.E
        public String d() {
            return this.f15534e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return this.f15535f;
        }
    }

    public static final class v extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v f15536d = new v();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15540h;

        static {
            String strG = EnumC1656p.QueryProduct.g();
            f15537e = strG;
            f15538f = strG;
            f15539g = "Failed to query product";
            f15540h = 8;
        }

        private v() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15538f;
        }

        public final String f() {
            return f15537e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15539g;
        }
    }

    public static final class w extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final w f15541d = new w();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15545h;

        static {
            String strG = EnumC1656p.SyncError.g();
            f15542e = strG;
            f15543f = strG;
            f15544g = "Restore failed";
            f15545h = 8;
        }

        private w() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15543f;
        }

        public final String f() {
            return f15542e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15544g;
        }
    }

    public static final class x extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final x f15546d = new x();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15550h;

        static {
            String strG = EnumC1656p.ServiceDisconnected.g();
            f15547e = strG;
            f15548f = strG;
            f15549g = "Play Store service is not connected";
            f15550h = 8;
        }

        private x() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15548f;
        }

        public final String f() {
            return f15547e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15549g;
        }
    }

    public static final class y extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final y f15551d = new y();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15552e = "service-timeout";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15553f = "The request has reached the maximum timeout before billing service responds";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15554g = 8;

        private y() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15552e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15553f;
        }
    }

    public static final class z extends E {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final z f15555d = new z();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f15556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f15557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f15558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15559h;

        static {
            String strG = EnumC1656p.ServiceError.g();
            f15556e = strG;
            f15557f = strG;
            f15558g = "Billing service is unavailable";
            f15559h = 8;
        }

        private z() {
            super(null);
        }

        @Override // Xa.E
        public String d() {
            return f15557f;
        }

        public final String f() {
            return f15556e;
        }

        @Override // Xa.E, java.lang.Throwable
        public String getMessage() {
            return f15558g;
        }
    }

    private E() {
    }

    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map c() {
        return kotlin.collections.N.l(Ad.v.a(q.f15512d.a(), "Product not found"), Ad.v.a(t.f15525d.f(), "Purchase failed"), Ad.v.a(r.f15515d.f(), "Purchase was cancelled by the user"), Ad.v.a(s.f15520d.f(), "Purchase was deferred"), Ad.v.a(n.f15498d.f(), "Network connection error"), Ad.v.a(C.f15422d.f(), "Unknown error"), Ad.v.a("not-prepared", "Billing client not ready"), Ad.v.a(h.f15468d.f(), "Failed to initialize billing connection"), Ad.v.a(v.f15536d.f(), "Failed to query product"), Ad.v.a("empty-sku-list", "SKU list cannot be empty"), Ad.v.a(A.f15411h.a(), "SKU not found"), Ad.v.a("sku-offer-mismatch", "SKU and offer token count mismatch"), Ad.v.a(D.f15427d.f(), "User cancelled the operation"), Ad.v.a(j.f15478d.f(), "Item is already owned"), Ad.v.a(k.f15483d.f(), "Item is not owned"), Ad.v.a(z.f15555d.f(), "Billing service is unavailable"), Ad.v.a(C1622c.f15449d.f(), "Billing API version is not supported"), Ad.v.a(l.f15488d.f(), "Requested product is not available for purchase"), Ad.v.a(e.f15454d.f(), "Invalid arguments provided to the API"), Ad.v.a(g.f15463d.f(), "Requested feature is not supported by Play Store"), Ad.v.a(x.f15546d.f(), "Play Store service is not connected"), Ad.v.a("service-timeout", "The request has reached the maximum timeout before billing service responds"), Ad.v.a(p.f15507d.f(), "Payment not allowed"), Ad.v.a(C1621b.f15444d.f(), "Billing error"), Ad.v.a(i.f15473d.f(), "Purchase verification failed"), Ad.v.a(C0209E.f15432d.f(), "Verification failed"), Ad.v.a(w.f15541d.f(), "Restore failed"), Ad.v.a(m.f15493d.f(), "Current activity is not available"));
    }

    public abstract String d();

    public final Map e() {
        Pair pairA = Ad.v.a("code", f15408a.d(this));
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        return kotlin.collections.N.l(pairA, Ad.v.a("message", message), Ad.v.a("platform", "android"));
    }

    @Override // java.lang.Throwable
    public abstract String getMessage();
}
