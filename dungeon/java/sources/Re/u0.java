package Re;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ve.r f11169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1412q f11170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f11171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque f11174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f11175k;

    public interface a {

        /* JADX INFO: renamed from: Re.u0$a$a, reason: collision with other inner class name */
        public static final class C0164a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f11176a;

            @Override // Re.u0.a
            public void a(Function0 block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.f11176a) {
                    return;
                }
                this.f11176a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f11176a;
            }
        }

        void a(Function0 function0);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11181e = Gd.a.a(e());
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f11182a = new b();

            private b() {
                super(null);
            }

            @Override // Re.u0.c
            public Ve.j a(u0 state, Ve.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.j().j0(type);
            }
        }

        /* JADX INFO: renamed from: Re.u0$c$c, reason: collision with other inner class name */
        public static final class C0165c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0165c f11183a = new C0165c();

            private C0165c() {
                super(null);
            }

            @Override // Re.u0.c
            public /* bridge */ /* synthetic */ Ve.j a(u0 u0Var, Ve.i iVar) {
                return (Ve.j) b(u0Var, iVar);
            }

            public Void b(u0 state, Ve.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f11184a = new d();

            private d() {
                super(null);
            }

            @Override // Re.u0.c
            public Ve.j a(u0 state, Ve.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.j().A(type);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Ve.j a(u0 u0Var, Ve.i iVar);
    }

    public u0(boolean z10, boolean z11, boolean z12, boolean z13, Ve.r typeSystemContext, AbstractC1412q kotlinTypePreparator, r kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f11165a = z10;
        this.f11166b = z11;
        this.f11167c = z12;
        this.f11168d = z13;
        this.f11169e = typeSystemContext;
        this.f11170f = kotlinTypePreparator;
        this.f11171g = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(u0 u0Var, Ve.i iVar, Ve.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(Ve.i subType, Ve.i superType, boolean z10) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f11174j;
        Intrinsics.c(arrayDeque);
        arrayDeque.clear();
        Set set = this.f11175k;
        Intrinsics.c(set);
        set.clear();
        this.f11173i = false;
    }

    public boolean f(Ve.i subType, Ve.i superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    public b g(Ve.j subType, Ve.d superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque h() {
        return this.f11174j;
    }

    public final Set i() {
        return this.f11175k;
    }

    public final Ve.r j() {
        return this.f11169e;
    }

    public final void k() {
        this.f11173i = true;
        if (this.f11174j == null) {
            this.f11174j = new ArrayDeque(4);
        }
        if (this.f11175k == null) {
            this.f11175k = p034bf.k.f26638c.a();
        }
    }

    public final boolean l(Ve.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f11168d && this.f11169e.F(type);
    }

    public final boolean m() {
        return this.f11167c;
    }

    public final boolean n() {
        return this.f11165a;
    }

    public final boolean o() {
        return this.f11166b;
    }

    public final Ve.i p(Ve.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f11170f.a(type);
    }

    public final Ve.i q(Ve.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f11171g.a(type);
    }

    public boolean r(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a.C0164a c0164a = new a.C0164a();
        block.invoke(c0164a);
        return c0164a.b();
    }
}
