package V;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p088ef.B0;
import p088ef.E0;
import p088ef.O;
import p088ef.P;
import p324s0.AbstractC4133d0;
import p324s0.AbstractC4146k;
import p324s0.InterfaceC4144j;
import p324s0.k0;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13755a = a.f13756b;

    public static final class a implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ a f13756b = new a();

        private a() {
        }

        @Override // V.k
        public boolean all(Function1 function1) {
            return true;
        }

        @Override // V.k
        public Object foldIn(Object obj, Function2 function2) {
            return obj;
        }

        @Override // V.k
        public k then(k kVar) {
            return kVar;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends k {
        @Override // V.k
        default boolean all(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        default boolean any(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // V.k
        default Object foldIn(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }

        default Object foldOut(Object obj, Function2 function2) {
            return function2.invoke(this, obj);
        }
    }

    public static abstract class c implements InterfaceC4144j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private O f13758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f13759c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f13761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f13762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k0 f13763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AbstractC4133d0 f13764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f13765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f13766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f13767k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f13768l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Function0 f13769m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f13770n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f13757a = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13760d = -1;

        public final c A1() {
            return this.f13761e;
        }

        public boolean B1() {
            return true;
        }

        public final boolean C1() {
            return this.f13766j;
        }

        public final boolean D1() {
            return this.f13770n;
        }

        public void E1() {
            if (this.f13770n) {
                p270p0.a.b("node attached multiple times");
            }
            if (!(this.f13764h != null)) {
                p270p0.a.b("attach invoked on a node without a coordinator");
            }
            this.f13770n = true;
            this.f13767k = true;
        }

        public void F1() {
            if (!this.f13770n) {
                p270p0.a.b("Cannot detach a node that is not attached");
            }
            if (this.f13767k) {
                p270p0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f13768l) {
                p270p0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f13770n = false;
            O o10 = this.f13758b;
            if (o10 != null) {
                P.c(o10, new l());
                this.f13758b = null;
            }
        }

        public void G1() {
        }

        public void H1() {
        }

        public void I1() {
        }

        public void J1() {
            if (!this.f13770n) {
                p270p0.a.b("reset() called on an unattached node");
            }
            I1();
        }

        public void K1() {
            if (!this.f13770n) {
                p270p0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f13767k) {
                p270p0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f13767k = false;
            G1();
            this.f13768l = true;
        }

        public void L1() {
            if (!this.f13770n) {
                p270p0.a.b("node detached multiple times");
            }
            if (!(this.f13764h != null)) {
                p270p0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f13768l) {
                p270p0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f13768l = false;
            Function0 function0 = this.f13769m;
            if (function0 != null) {
                function0.invoke();
            }
            H1();
        }

        public final void M1(int i10) {
            this.f13760d = i10;
        }

        public void N1(c cVar) {
            this.f13757a = cVar;
        }

        public final void O1(c cVar) {
            this.f13762f = cVar;
        }

        public final void P1(Function0 function0) {
            this.f13769m = function0;
        }

        public final void Q1(boolean z10) {
            this.f13765i = z10;
        }

        public final void R1(int i10) {
            this.f13759c = i10;
        }

        public final void S1(k0 k0Var) {
            this.f13763g = k0Var;
        }

        public final void T1(c cVar) {
            this.f13761e = cVar;
        }

        public final void U1(boolean z10) {
            this.f13766j = z10;
        }

        public void V1(AbstractC4133d0 abstractC4133d0) {
            this.f13764h = abstractC4133d0;
        }

        @Override // p324s0.InterfaceC4144j
        public final c k0() {
            return this.f13757a;
        }

        public final int t1() {
            return this.f13760d;
        }

        public final c u1() {
            return this.f13762f;
        }

        public final AbstractC4133d0 v1() {
            return this.f13764h;
        }

        public final O w1() {
            O o10 = this.f13758b;
            if (o10 != null) {
                return o10;
            }
            O oA = P.a(AbstractC4146k.m(this).getCoroutineContext().P(E0.a((B0) AbstractC4146k.m(this).getCoroutineContext().e(B0.f40749z1))));
            this.f13758b = oA;
            return oA;
        }

        public final boolean x1() {
            return this.f13765i;
        }

        public final int y1() {
            return this.f13759c;
        }

        public final k0 z1() {
            return this.f13763g;
        }
    }

    boolean all(Function1 function1);

    Object foldIn(Object obj, Function2 function2);

    default k then(k kVar) {
        return kVar == f13755a ? this : new f(this, kVar);
    }
}
