package p054d;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1991n;
import androidx.lifecycle.InterfaceC1994q;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C3951m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f39481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p199l1.b f39482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3951m f39483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f39484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f39485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f39486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39488h;

    static final class a extends o implements Function1 {
        a() {
            super(1);
        }

        public final void a(C3216b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3216b) obj);
            return Unit.f48228a;
        }
    }

    static final class b extends o implements Function1 {
        b() {
            super(1);
        }

        public final void a(C3216b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.l(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3216b) obj);
            return Unit.f48228a;
        }
    }

    static final class c extends o implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m247invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m247invoke() {
            w.this.k();
        }
    }

    static final class d extends o implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m248invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m248invoke() {
            w.this.j();
        }
    }

    static final class e extends o implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m249invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m249invoke() {
            w.this.k();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f39494a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @NotNull
        public final OnBackInvokedCallback b(@NotNull Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new x(onBackInvoked);
        }

        public final void d(@NotNull Object dispatcher, int i10, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f39495a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f39496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f39497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f39498c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f39499d;

            a(Function1 function1, Function1 function2, Function0 function0, Function0 function3) {
                this.f39496a = function1;
                this.f39497b = function2;
                this.f39498c = function0;
                this.f39499d = function3;
            }

            public void onBackCancelled() {
                this.f39499d.invoke();
            }

            public void onBackInvoked() {
                this.f39498c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f39497b.invoke(new C3216b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f39496a.invoke(new C3216b(backEvent));
            }
        }

        private g() {
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super C3216b, Unit> onBackStarted, @NotNull Function1<? super C3216b, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements InterfaceC1991n, p054d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1987j f39500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f39501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p054d.c f39502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f39503d;

        public h(w wVar, AbstractC1987j lifecycle, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f39503d = wVar;
            this.f39500a = lifecycle;
            this.f39501b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // p054d.c
        public void cancel() {
            this.f39500a.d(this);
            this.f39501b.i(this);
            p054d.c cVar = this.f39502c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f39502c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1991n
        public void f(InterfaceC1994q source, AbstractC1987j.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1987j.a.ON_START) {
                this.f39502c = this.f39503d.i(this.f39501b);
                return;
            }
            if (event != AbstractC1987j.a.ON_STOP) {
                if (event == AbstractC1987j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                p054d.c cVar = this.f39502c;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    private final class i implements p054d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f39504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f39505b;

        public i(w wVar, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f39505b = wVar;
            this.f39504a = onBackPressedCallback;
        }

        @Override // p054d.c
        public void cancel() {
            this.f39505b.f39483c.remove(this.f39504a);
            if (Intrinsics.b(this.f39505b.f39484d, this.f39504a)) {
                this.f39504a.c();
                this.f39505b.f39484d = null;
            }
            this.f39504a.i(this);
            Function0 function0B = this.f39504a.b();
            if (function0B != null) {
                function0B.invoke();
            }
            this.f39504a.k(null);
        }
    }

    /* synthetic */ class j extends AbstractC3975l implements Function0 {
        j(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m250invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m250invoke() {
            ((w) this.receiver).p();
        }
    }

    /* synthetic */ class k extends AbstractC3975l implements Function0 {
        k(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m251invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m251invoke() {
            ((w) this.receiver).p();
        }
    }

    public w(Runnable runnable) {
        this(runnable, null);
    }

    public w(Runnable runnable, p199l1.b bVar) {
        this.f39481a = runnable;
        this.f39482b = bVar;
        this.f39483c = new C3951m();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f39485e = i10 >= 34 ? g.f39495a.a(new a(), new b(), new c(), new d()) : f.f39494a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Object objPrevious;
        v vVar = this.f39484d;
        if (vVar == null) {
            C3951m c3951m = this.f39483c;
            ListIterator<E> listIterator = c3951m.listIterator(c3951m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        this.f39484d = null;
        if (vVar != null) {
            vVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C3216b c3216b) {
        Object objPrevious;
        v vVar = this.f39484d;
        if (vVar == null) {
            C3951m c3951m = this.f39483c;
            ListIterator<E> listIterator = c3951m.listIterator(c3951m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        if (vVar != null) {
            vVar.e(c3216b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C3216b c3216b) {
        Object objPrevious;
        C3951m c3951m = this.f39483c;
        ListIterator<E> listIterator = c3951m.listIterator(c3951m.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((v) objPrevious).g());
        v vVar = (v) objPrevious;
        if (this.f39484d != null) {
            j();
        }
        this.f39484d = vVar;
        if (vVar != null) {
            vVar.f(c3216b);
        }
    }

    private final void o(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f39486f;
        OnBackInvokedCallback onBackInvokedCallback = this.f39485e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f39487g) {
            f.f39494a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f39487g = true;
        } else {
            if (z10 || !this.f39487g) {
                return;
            }
            f.f39494a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f39487g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        boolean z10 = this.f39488h;
        C3951m c3951m = this.f39483c;
        boolean z11 = false;
        if (c3951m == null || !c3951m.isEmpty()) {
            Iterator<E> it = c3951m.iterator();
            while (it.hasNext()) {
                if (((v) it.next()).g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f39488h = z11;
        if (z11 != z10) {
            p199l1.b bVar = this.f39482b;
            if (bVar != null) {
                bVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z11);
            }
        }
    }

    public final void h(InterfaceC1994q owner, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1987j abstractC1987jY = owner.y();
        if (abstractC1987jY.b() == AbstractC1987j.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, abstractC1987jY, onBackPressedCallback));
        p();
        onBackPressedCallback.k(new j(this));
    }

    public final p054d.c i(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f39483c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        p();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void k() {
        Object objPrevious;
        v vVar = this.f39484d;
        if (vVar == null) {
            C3951m c3951m = this.f39483c;
            ListIterator<E> listIterator = c3951m.listIterator(c3951m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).g());
            vVar = (v) objPrevious;
        }
        this.f39484d = null;
        if (vVar != null) {
            vVar.d();
            return;
        }
        Runnable runnable = this.f39481a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f39486f = invoker;
        o(this.f39488h);
    }
}
