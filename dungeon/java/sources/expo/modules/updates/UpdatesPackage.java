package expo.modules.updates;

import Ad.r;
import android.content.Context;
import com.facebook.react.AbstractActivityC2237q;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3289i;
import p088ef.AbstractC3293k;
import p088ef.C3282e0;
import p088ef.O;
import p088ef.P;
import p227mb.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lexpo/modules/updates/UpdatesPackage;", "Lmb/g;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lmb/j;", "a", "(Landroid/content/Context;)Ljava/util/List;", "activityContext", "Lmb/h;", "d", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdatesPackage implements p227mb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41332b = UpdatesPackage.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f41333c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f41334d = false;

    /* JADX INFO: renamed from: expo.modules.updates.UpdatesPackage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return UpdatesPackage.f41334d;
        }

        public final boolean b() {
            return UpdatesPackage.f41333c;
        }
    }

    public static final class b implements p227mb.h {

        static final class a extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41335a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f41337c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Runnable f41338d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, Runnable runnable, Ed.b bVar) {
                super(2, bVar);
                this.f41337c = context;
                this.f41338d = runnable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                return b.this.new a(this.f41337c, this.f41338d, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Ed.b bVar) {
                return ((a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (r5.h(r1, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = Fd.b.e()
                    int r1 = r4.f41335a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    Ad.r.b(r5)
                    goto L41
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    Ad.r.b(r5)
                    goto L31
                L1e:
                    Ad.r.b(r5)
                    expo.modules.updates.UpdatesPackage$b r5 = expo.modules.updates.UpdatesPackage.b.this
                    android.content.Context r1 = r4.f41337c
                    kotlin.jvm.internal.Intrinsics.c(r1)
                    r4.f41335a = r3
                    java.lang.Object r5 = expo.modules.updates.UpdatesPackage.b.f(r5, r1, r4)
                    if (r5 != r0) goto L31
                    goto L40
                L31:
                    expo.modules.updates.UpdatesPackage$b r5 = expo.modules.updates.UpdatesPackage.b.this
                    java.lang.Runnable r1 = r4.f41338d
                    kotlin.jvm.internal.Intrinsics.c(r1)
                    r4.f41335a = r2
                    java.lang.Object r5 = expo.modules.updates.UpdatesPackage.b.e(r5, r1, r4)
                    if (r5 != r0) goto L41
                L40:
                    return r0
                L41:
                    kotlin.Unit r5 = kotlin.Unit.f48228a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.UpdatesPackage.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.UpdatesPackage$b$b, reason: collision with other inner class name */
        static final class C0463b extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f41340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0463b(Runnable runnable, Ed.b bVar) {
                super(2, bVar);
                this.f41340b = runnable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                return new C0463b(this.f41340b, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Ed.b bVar) {
                return ((C0463b) create(o10, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Fd.b.e();
                if (this.f41339a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f41340b.run();
                return Unit.f48228a;
            }
        }

        static final class c extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41341a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f41342b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Context context, Ed.b bVar) {
                super(2, bVar);
                this.f41342b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                return new c(this.f41342b, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Ed.b bVar) {
                return ((c) create(o10, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Fd.b.e();
                if (this.f41341a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (!UpdatesPackage.INSTANCE.a()) {
                    f.b(this.f41342b);
                    f.a().a();
                }
                return Unit.f48228a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(b bVar, Context context, Runnable runnable) {
            AbstractC3293k.d(P.a(C3282e0.b()), null, null, bVar.new a(context, runnable, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object h(Runnable runnable, Ed.b bVar) {
            Object objG = AbstractC3289i.g(C3282e0.c(), new C0463b(runnable, null), bVar);
            return objG == Fd.b.e() ? objG : Unit.f48228a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object i(Context context, Ed.b bVar) {
            Object objG = AbstractC3289i.g(C3282e0.b(), new c(context, null), bVar);
            return objG == Fd.b.e() ? objG : Unit.f48228a;
        }

        @Override // p227mb.h
        public mb.h.a c(AbstractActivityC2237q activity, com.facebook.react.O reactNativeHost) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
            Companion companion = UpdatesPackage.INSTANCE;
            if (companion.a()) {
                return null;
            }
            Context applicationContext = activity.getApplicationContext();
            if (!reactNativeHost.f() || companion.b()) {
                return new p086ed.g(this, applicationContext);
            }
            return null;
        }
    }

    public static final class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41343a;

        c(Context context) {
            this.f41343a = context;
        }

        @Override // p227mb.j
        public String a(boolean z10) {
            if (f.a().e()) {
                return f.a().b();
            }
            return null;
        }

        @Override // p227mb.j
        public String b(boolean z10) {
            if (f.a().e()) {
                return f.a().a();
            }
            return null;
        }

        @Override // p227mb.j
        public void c(p456z6.e devSupportManager) {
            Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
            f.a().c(devSupportManager);
        }

        @Override // p227mb.j
        public void e(boolean z10, Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            f.a().n(exception);
        }

        @Override // p227mb.j
        public void f(boolean z10, ReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            f.a().k(reactContext);
        }

        @Override // p227mb.j
        public void h(boolean z10) {
            f.b(this.f41343a);
        }
    }

    @Override // p227mb.g
    public List a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.e(new c(context));
    }

    @Override // p227mb.g
    public List d(Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return CollectionsKt.e(new b());
    }
}
