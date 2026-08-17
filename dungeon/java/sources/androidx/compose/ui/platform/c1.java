package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public interface c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21996a = a.f21997a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21997a = new a();

        private a() {
        }

        public final c1 a() {
            return b.f21998b;
        }
    }

    public static final class b implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21998b = new b();

        static final class a extends kotlin.jvm.internal.o implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC1843a f21999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0264b f22000b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p307r1.b f22001c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC1843a abstractC1843a, ViewOnAttachStateChangeListenerC0264b viewOnAttachStateChangeListenerC0264b, p307r1.b bVar) {
                super(0);
                this.f21999a = abstractC1843a;
                this.f22000b = viewOnAttachStateChangeListenerC0264b;
                this.f22001c = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m17invoke();
                return Unit.f48228a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m17invoke() {
                this.f21999a.removeOnAttachStateChangeListener(this.f22000b);
                p307r1.a.e(this.f21999a, this.f22001c);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.c1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0264b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC1843a f22002a;

            ViewOnAttachStateChangeListenerC0264b(AbstractC1843a abstractC1843a) {
                this.f22002a = abstractC1843a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (p307r1.a.d(this.f22002a)) {
                    return;
                }
                this.f22002a.e();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.c1
        public Function0 a(AbstractC1843a abstractC1843a) {
            ViewOnAttachStateChangeListenerC0264b viewOnAttachStateChangeListenerC0264b = new ViewOnAttachStateChangeListenerC0264b(abstractC1843a);
            abstractC1843a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0264b);
            d1 d1Var = new d1(abstractC1843a);
            p307r1.a.a(abstractC1843a, d1Var);
            return new a(abstractC1843a, viewOnAttachStateChangeListenerC0264b, d1Var);
        }
    }

    Function0 a(AbstractC1843a abstractC1843a);
}
