package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    static final class a extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21385a = new a();

        a() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21386a = new b();

        b() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    default i a() {
        return i.f21400b.b();
    }

    default i b() {
        return i.f21400b.b();
    }

    default i c() {
        return i.f21400b.b();
    }

    default i d() {
        return i.f21400b.b();
    }

    default i e() {
        return i.f21400b.b();
    }

    default i f() {
        return i.f21400b.b();
    }

    void g(boolean z10);

    default void h(Function1 function1) {
    }

    boolean i();

    default i j() {
        return i.f21400b.b();
    }

    default Function1 k() {
        return a.f21385a;
    }

    default i l() {
        return i.f21400b.b();
    }

    default Function1 m() {
        return b.f21386a;
    }

    default void n(Function1 function1) {
    }
}
