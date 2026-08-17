package A3;

import Ad.AbstractC0793c;
import Ad.r;
import If.AbstractC1113o;
import If.AbstractC1114p;
import If.InterfaceC1107i;
import If.InterfaceC1108j;
import If.K;
import If.Q;
import If.Y;
import Q3.AbstractC1337c;
import Q3.j;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p088ef.AbstractC3293k;
import p088ef.O;
import p088ef.P;
import p088ef.W0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f160t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Regex f161u = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q f166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q f167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q f168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC1107i f174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f180s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0003c f181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean[] f183c;

        public b(C0003c c0003c) {
            this.f181a = c0003c;
            this.f183c = new boolean[c.this.f165d];
        }

        private final void d(boolean z10) {
            Object obj = c.this.f171j;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    if (this.f182b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.b(this.f181a.b(), this)) {
                        cVar.u(this, z10);
                    }
                    this.f182b = true;
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarF;
            Object obj = c.this.f171j;
            c cVar = c.this;
            synchronized (obj) {
                b();
                dVarF = cVar.F(this.f181a.d());
            }
            return dVarF;
        }

        public final void e() {
            if (Intrinsics.b(this.f181a.b(), this)) {
                this.f181a.m(true);
            }
        }

        public final Q f(int i10) {
            Q q10;
            Object obj = c.this.f171j;
            c cVar = c.this;
            synchronized (obj) {
                if (this.f182b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f183c[i10] = true;
                Object obj2 = this.f181a.c().get(i10);
                j.b(cVar.f180s, (Q) obj2, false, 2, null);
                q10 = (Q) obj2;
            }
            return q10;
        }

        public final C0003c g() {
            return this.f181a;
        }

        public final boolean[] h() {
            return this.f183c;
        }
    }

    /* JADX INFO: renamed from: A3.c$c, reason: collision with other inner class name */
    public final class C0003c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f192h;

        public C0003c(String str) {
            this.f185a = str;
            this.f186b = new long[c.this.f165d];
            this.f187c = new ArrayList(c.this.f165d);
            this.f188d = new ArrayList(c.this.f165d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = c.this.f165d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f187c.add(c.this.f162a.u(sb2.toString()));
                sb2.append(".tmp");
                this.f188d.add(c.this.f162a.u(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.f187c;
        }

        public final b b() {
            return this.f191g;
        }

        public final ArrayList c() {
            return this.f188d;
        }

        public final String d() {
            return this.f185a;
        }

        public final long[] e() {
            return this.f186b;
        }

        public final int f() {
            return this.f192h;
        }

        public final boolean g() {
            return this.f189e;
        }

        public final boolean h() {
            return this.f190f;
        }

        public final void i(b bVar) {
            this.f191g = bVar;
        }

        public final void j(List list) throws IOException {
            if (list.size() != c.this.f165d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f186b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f192h = i10;
        }

        public final void l(boolean z10) {
            this.f189e = z10;
        }

        public final void m(boolean z10) {
            this.f190f = z10;
        }

        public final d n() {
            if (!this.f189e || this.f191g != null || this.f190f) {
                return null;
            }
            ArrayList arrayList = this.f187c;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!cVar.f180s.j((Q) arrayList.get(i10))) {
                    try {
                        cVar.Z(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f192h++;
            return c.this.new d(this);
        }

        public final void o(InterfaceC1107i interfaceC1107i) {
            for (long j10 : this.f186b) {
                interfaceC1107i.writeByte(32).Y1(j10);
            }
        }
    }

    public final class d implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0003c f194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f195b;

        public d(C0003c c0003c) {
            this.f194a = c0003c;
        }

        public final b a() {
            b bVarZ;
            Object obj = c.this.f171j;
            c cVar = c.this;
            synchronized (obj) {
                close();
                bVarZ = cVar.z(this.f194a.d());
            }
            return bVarZ;
        }

        public final Q b(int i10) {
            if (this.f195b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Q) this.f194a.a().get(i10);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.f195b) {
                return;
            }
            this.f195b = true;
            Object obj = c.this.f171j;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    C0003c c0003c = this.f194a;
                    c0003c.k(c0003c.f() - 1);
                    if (this.f194a.f() == 0 && this.f194a.h()) {
                        cVar.Z(this.f194a);
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends AbstractC1114p {
        e(AbstractC1113o abstractC1113o) {
            super(abstractC1113o);
        }

        @Override // If.AbstractC1114p, If.AbstractC1113o
        public Y p(Q q10, boolean z10) {
            Q qR = q10.r();
            if (qR != null) {
                d(qR);
            }
            return super.p(q10, z10);
        }
    }

    static final class f extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197a;

        f(Ed.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return c.this.new f(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((f) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Fd.b.e();
            if (this.f197a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Object obj2 = c.this.f171j;
            c cVar = c.this;
            synchronized (obj2) {
                if (!cVar.f176o || cVar.f177p) {
                    return Unit.f48228a;
                }
                try {
                    cVar.c0();
                } catch (IOException unused) {
                    cVar.f178q = true;
                }
                try {
                    if (cVar.K()) {
                        cVar.h0();
                    }
                } catch (IOException unused2) {
                    cVar.f179r = true;
                    cVar.f174m = K.c(K.b());
                }
                return Unit.f48228a;
            }
        }
    }

    public c(AbstractC1113o abstractC1113o, Q q10, p088ef.K k10, long j10, int i10, int i11) {
        this.f162a = q10;
        this.f163b = j10;
        this.f164c = i10;
        this.f165d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f166e = q10.u("journal");
        this.f167f = q10.u("journal.tmp");
        this.f168g = q10.u("journal.bkp");
        this.f169h = AbstractC1337c.b(0, 0.0f, 3, null);
        this.f170i = P.a(W0.b(null, 1, null).P(p088ef.K.q0(k10, 1, null, 2, null)));
        this.f171j = new Object();
        this.f180s = new e(abstractC1113o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K() {
        return this.f173l >= 2000;
    }

    private final void L() {
        AbstractC3293k.d(this.f170i, null, null, new f(null), 3, null);
    }

    private final InterfaceC1107i O() {
        return K.c(new A3.d(this.f180s.a(this.f166e), new A3.b(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(c cVar, IOException iOException) {
        cVar.f175n = true;
        return Unit.f48228a;
    }

    private final void S() {
        Iterator it = this.f169h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0003c c0003c = (C0003c) it.next();
            int i10 = 0;
            if (c0003c.b() == null) {
                int i11 = this.f165d;
                while (i10 < i11) {
                    j10 += c0003c.e()[i10];
                    i10++;
                }
            } else {
                c0003c.i(null);
                int i12 = this.f165d;
                while (i10 < i12) {
                    this.f180s.h((Q) c0003c.a().get(i10));
                    this.f180s.h((Q) c0003c.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f172k = j10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    private final void U() throws Throwable {
        InterfaceC1108j interfaceC1108jD = K.d(this.f180s.q(this.f166e));
        try {
            String strB1 = interfaceC1108jD.B1();
            String strB2 = interfaceC1108jD.B1();
            String strB3 = interfaceC1108jD.B1();
            String strB4 = interfaceC1108jD.B1();
            String strB5 = interfaceC1108jD.B1();
            if (!Intrinsics.b("libcore.io.DiskLruCache", strB1) || !Intrinsics.b("1", strB2) || !Intrinsics.b(String.valueOf(this.f164c), strB3) || !Intrinsics.b(String.valueOf(this.f165d), strB4) || strB5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strB1 + ", " + strB2 + ", " + strB3 + ", " + strB4 + ", " + strB5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    V(interfaceC1108jD.B1());
                    i10++;
                } catch (EOFException unused) {
                    this.f173l = i10 - this.f169h.size();
                    if (interfaceC1108jD.z2()) {
                        this.f174m = O();
                    } else {
                        h0();
                    }
                    Unit unit = Unit.f48228a;
                    if (interfaceC1108jD != null) {
                        try {
                            interfaceC1108jD.close();
                        } catch (Throwable th) {
                            th = th;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC1108jD != null) {
                try {
                    interfaceC1108jD.close();
                } catch (Throwable th3) {
                    AbstractC0793c.a(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    private final void V(String str) throws IOException {
        String strSubstring;
        int iG0 = StringsKt.g0(str, ' ', 0, false, 6, null);
        if (iG0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iG0 + 1;
        int iG1 = StringsKt.g0(str, ' ', i10, false, 4, null);
        if (iG1 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iG0 == 6 && StringsKt.O(str, "REMOVE", false, 2, null)) {
                this.f169h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iG1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Map map = this.f169h;
        Object c0003c = map.get(strSubstring);
        if (c0003c == null) {
            c0003c = new C0003c(strSubstring);
            map.put(strSubstring, c0003c);
        }
        C0003c c0003c2 = (C0003c) c0003c;
        if (iG1 != -1 && iG0 == 5 && StringsKt.O(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iG1 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List listJ0 = StringsKt.J0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            c0003c2.l(true);
            c0003c2.i(null);
            c0003c2.j(listJ0);
            return;
        }
        if (iG1 == -1 && iG0 == 5 && StringsKt.O(str, "DIRTY", false, 2, null)) {
            c0003c2.i(new b(c0003c2));
            return;
        }
        if (iG1 == -1 && iG0 == 4 && StringsKt.O(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(C0003c c0003c) {
        InterfaceC1107i interfaceC1107i;
        if (c0003c.f() > 0 && (interfaceC1107i = this.f174m) != null) {
            interfaceC1107i.Z0("DIRTY");
            interfaceC1107i.writeByte(32);
            interfaceC1107i.Z0(c0003c.d());
            interfaceC1107i.writeByte(10);
            interfaceC1107i.flush();
        }
        if (c0003c.f() > 0 || c0003c.b() != null) {
            c0003c.m(true);
            return true;
        }
        int i10 = this.f165d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f180s.h((Q) c0003c.a().get(i11));
            this.f172k -= c0003c.e()[i11];
            c0003c.e()[i11] = 0;
        }
        this.f173l++;
        InterfaceC1107i interfaceC1107i2 = this.f174m;
        if (interfaceC1107i2 != null) {
            interfaceC1107i2.Z0("REMOVE");
            interfaceC1107i2.writeByte(32);
            interfaceC1107i2.Z0(c0003c.d());
            interfaceC1107i2.writeByte(10);
            interfaceC1107i2.flush();
        }
        this.f169h.remove(c0003c.d());
        if (K()) {
            L();
        }
        return true;
    }

    private final boolean b0() {
        for (C0003c c0003c : this.f169h.values()) {
            if (!c0003c.h()) {
                Z(c0003c);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        while (this.f172k > this.f163b) {
            if (!b0()) {
                return;
            }
        }
        this.f178q = false;
    }

    private final void e0(String str) {
        if (f161u.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        Throwable th;
        synchronized (this.f171j) {
            try {
                InterfaceC1107i interfaceC1107i = this.f174m;
                if (interfaceC1107i != null) {
                    interfaceC1107i.close();
                }
                InterfaceC1107i interfaceC1107iC = K.c(this.f180s.p(this.f167f, false));
                try {
                    interfaceC1107iC.Z0("libcore.io.DiskLruCache").writeByte(10);
                    interfaceC1107iC.Z0("1").writeByte(10);
                    interfaceC1107iC.Y1(this.f164c).writeByte(10);
                    interfaceC1107iC.Y1(this.f165d).writeByte(10);
                    interfaceC1107iC.writeByte(10);
                    for (C0003c c0003c : this.f169h.values()) {
                        if (c0003c.b() != null) {
                            interfaceC1107iC.Z0("DIRTY");
                            interfaceC1107iC.writeByte(32);
                            interfaceC1107iC.Z0(c0003c.d());
                            interfaceC1107iC.writeByte(10);
                        } else {
                            interfaceC1107iC.Z0("CLEAN");
                            interfaceC1107iC.writeByte(32);
                            interfaceC1107iC.Z0(c0003c.d());
                            c0003c.o(interfaceC1107iC);
                            interfaceC1107iC.writeByte(10);
                        }
                    }
                    Unit unit = Unit.f48228a;
                    if (interfaceC1107iC != null) {
                        try {
                            interfaceC1107iC.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    th = null;
                } catch (Throwable th3) {
                    if (interfaceC1107iC != null) {
                        try {
                            interfaceC1107iC.close();
                        } catch (Throwable th4) {
                            AbstractC0793c.a(th3, th4);
                        }
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f180s.j(this.f166e)) {
                    this.f180s.c(this.f166e, this.f168g);
                    this.f180s.c(this.f167f, this.f166e);
                    this.f180s.h(this.f168g);
                } else {
                    this.f180s.c(this.f167f, this.f166e);
                }
                this.f174m = O();
                this.f173l = 0;
                this.f175n = false;
                this.f179r = false;
                Unit unit2 = Unit.f48228a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private final void t() {
        if (this.f177p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(b bVar, boolean z10) {
        synchronized (this.f171j) {
            C0003c c0003cG = bVar.g();
            if (!Intrinsics.b(c0003cG.b(), bVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z10 || c0003cG.h()) {
                int i10 = this.f165d;
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f180s.h((Q) c0003cG.c().get(i11));
                }
            } else {
                int i12 = this.f165d;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (bVar.h()[i13] && !this.f180s.j((Q) c0003cG.c().get(i13))) {
                        bVar.a();
                        return;
                    }
                }
                int i14 = this.f165d;
                for (int i15 = 0; i15 < i14; i15++) {
                    Q q10 = (Q) c0003cG.c().get(i15);
                    Q q11 = (Q) c0003cG.a().get(i15);
                    if (this.f180s.j(q10)) {
                        this.f180s.c(q10, q11);
                    } else {
                        j.b(this.f180s, (Q) c0003cG.a().get(i15), false, 2, null);
                    }
                    long j10 = c0003cG.e()[i15];
                    Long lD = this.f180s.l(q11).d();
                    long jLongValue = lD != null ? lD.longValue() : 0L;
                    c0003cG.e()[i15] = jLongValue;
                    this.f172k = (this.f172k - j10) + jLongValue;
                }
            }
            c0003cG.i(null);
            if (c0003cG.h()) {
                Z(c0003cG);
                return;
            }
            this.f173l++;
            InterfaceC1107i interfaceC1107i = this.f174m;
            Intrinsics.c(interfaceC1107i);
            if (z10 || c0003cG.g()) {
                c0003cG.l(true);
                interfaceC1107i.Z0("CLEAN");
                interfaceC1107i.writeByte(32);
                interfaceC1107i.Z0(c0003cG.d());
                c0003cG.o(interfaceC1107i);
                interfaceC1107i.writeByte(10);
            } else {
                this.f169h.remove(c0003cG.d());
                interfaceC1107i.Z0("REMOVE");
                interfaceC1107i.writeByte(32);
                interfaceC1107i.Z0(c0003cG.d());
                interfaceC1107i.writeByte(10);
            }
            interfaceC1107i.flush();
            if (this.f172k > this.f163b || K()) {
                L();
            }
            Unit unit = Unit.f48228a;
        }
    }

    private final void x() throws IOException {
        close();
        j.c(this.f180s, this.f162a);
    }

    public final d F(String str) {
        d dVarN;
        synchronized (this.f171j) {
            t();
            e0(str);
            G();
            C0003c c0003c = (C0003c) this.f169h.get(str);
            if (c0003c != null && (dVarN = c0003c.n()) != null) {
                this.f173l++;
                InterfaceC1107i interfaceC1107i = this.f174m;
                Intrinsics.c(interfaceC1107i);
                interfaceC1107i.Z0("READ");
                interfaceC1107i.writeByte(32);
                interfaceC1107i.Z0(str);
                interfaceC1107i.writeByte(10);
                interfaceC1107i.flush();
                if (K()) {
                    L();
                }
                return dVarN;
            }
            return null;
        }
    }

    public final void G() {
        synchronized (this.f171j) {
            try {
                if (this.f176o) {
                    return;
                }
                this.f180s.h(this.f167f);
                if (this.f180s.j(this.f168g)) {
                    if (this.f180s.j(this.f166e)) {
                        this.f180s.h(this.f168g);
                    } else {
                        this.f180s.c(this.f168g, this.f166e);
                    }
                }
                if (this.f180s.j(this.f166e)) {
                    try {
                        U();
                        S();
                        this.f176o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            x();
                            this.f177p = false;
                            h0();
                            this.f176o = true;
                            Unit unit = Unit.f48228a;
                        } catch (Throwable th) {
                            this.f177p = false;
                            throw th;
                        }
                    }
                }
                h0();
                this.f176o = true;
                Unit unit2 = Unit.f48228a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f171j) {
            try {
                if (this.f176o && !this.f177p) {
                    for (C0003c c0003c : (C0003c[]) this.f169h.values().toArray(new C0003c[0])) {
                        b bVarB = c0003c.b();
                        if (bVarB != null) {
                            bVarB.e();
                        }
                    }
                    c0();
                    P.d(this.f170i, null, 1, null);
                    InterfaceC1107i interfaceC1107i = this.f174m;
                    Intrinsics.c(interfaceC1107i);
                    interfaceC1107i.close();
                    this.f174m = null;
                    this.f177p = true;
                    Unit unit = Unit.f48228a;
                    return;
                }
                this.f177p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b z(String str) {
        synchronized (this.f171j) {
            t();
            e0(str);
            G();
            C0003c c0003c = (C0003c) this.f169h.get(str);
            if ((c0003c != null ? c0003c.b() : null) != null) {
                return null;
            }
            if (c0003c != null && c0003c.f() != 0) {
                return null;
            }
            if (!this.f178q && !this.f179r) {
                InterfaceC1107i interfaceC1107i = this.f174m;
                Intrinsics.c(interfaceC1107i);
                interfaceC1107i.Z0("DIRTY");
                interfaceC1107i.writeByte(32);
                interfaceC1107i.Z0(str);
                interfaceC1107i.writeByte(10);
                interfaceC1107i.flush();
                if (this.f175n) {
                    return null;
                }
                if (c0003c == null) {
                    c0003c = new C0003c(str);
                    this.f169h.put(str, c0003c);
                }
                b bVar = new b(c0003c);
                c0003c.i(bVar);
                return bVar;
            }
            L();
            return null;
        }
    }
}
