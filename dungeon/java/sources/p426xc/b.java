package p426xc;

import Ad.j;
import Rb.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import p013ac.h;
import p013ac.k;
import p013ac.m;
import p013ac.t;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lxc/b;", "Lcc/c;", "<init>", "()V", "Lcc/e;", "j", "()Lcc/e;", "LPb/a;", "d", "Lkotlin/Lazy;", "w", "()LPb/a;", "taskManager", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends p049cc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy taskManager = j.b(new p426xc.a(this));

    public static final class a implements Function2 {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            b.v(b.this);
            N.i();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: xc.b$b, reason: collision with other inner class name */
    public static final class C0744b implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0744b f57571a = new C0744b();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(String.class);
        }
    }

    public static final class c implements Function1 {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            b.v(b.this);
            N.i();
            throw null;
        }
    }

    public static final class d implements Function2 {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            b.v(b.this);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    public static final class e implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f57574a = new e();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(String.class);
        }
    }

    public static final class f implements Function1 {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            b.v(b.this);
            throw null;
        }
    }

    public static /* synthetic */ Pb.a u(b bVar) throws p372uc.a {
        x(bVar);
        return null;
    }

    public static final /* synthetic */ Pb.a v(b bVar) {
        bVar.w();
        return null;
    }

    private final Pb.a w() {
        android.support.v4.media.session.b.a(this.taskManager.getValue());
        return null;
    }

    private static final Pb.a x(b bVar) throws p372uc.a {
        Object objB;
        try {
            objB = bVar.f().v().b(Pb.a.class);
        } catch (Exception unused) {
            objB = null;
        }
        android.support.v4.media.session.b.a(objB);
        throw new p372uc.a(F.b(Pb.a.class));
    }

    @Override // p049cc.c
    @NotNull
    public p049cc.e j() {
        p013ac.e oVar;
        p013ac.e fVar;
        p013ac.e oVar2;
        p013ac.e fVar2;
        p381v3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            p049cc.d dVar = new p049cc.d(this);
            dVar.u("ExpoBackgroundNotificationTasksModule");
            boolean zB = Intrinsics.b(String.class, u.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                fVar = new p013ac.f("registerTaskAsync", new C3594b[0], new a());
            } else {
                a0 a0VarO = dVar.o();
                C3594b c3594b = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(String.class), Boolean.FALSE));
                if (c3594b == null) {
                    c3594b = new C3594b(new P(F.b(String.class), false, C0744b.f57571a), a0VarO);
                }
                C3594b[] c3594bArr = {c3594b};
                c cVar = new c();
                if (Intrinsics.b(Unit.class, cls4)) {
                    oVar = new m("registerTaskAsync", c3594bArr, cVar);
                } else if (Intrinsics.b(Unit.class, cls3)) {
                    oVar = new h("registerTaskAsync", c3594bArr, cVar);
                } else if (Intrinsics.b(Unit.class, cls2)) {
                    oVar = new p013ac.j("registerTaskAsync", c3594bArr, cVar);
                } else if (Intrinsics.b(Unit.class, cls)) {
                    oVar = new k("registerTaskAsync", c3594bArr, cVar);
                } else {
                    oVar = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("registerTaskAsync", c3594bArr, cVar) : new t("registerTaskAsync", c3594bArr, cVar);
                }
                fVar = oVar;
            }
            dVar.m().put("registerTaskAsync", fVar);
            if (Intrinsics.b(String.class, u.class)) {
                fVar2 = new p013ac.f("unregisterTaskAsync", new C3594b[0], new d());
            } else {
                a0 a0VarO2 = dVar.o();
                C3594b c3594b2 = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(String.class), Boolean.FALSE));
                if (c3594b2 == null) {
                    c3594b2 = new C3594b(new P(F.b(String.class), false, e.f57574a), a0VarO2);
                }
                C3594b[] c3594bArr2 = {c3594b2};
                f fVar3 = new f();
                if (Intrinsics.b(Unit.class, cls4)) {
                    oVar2 = new m("unregisterTaskAsync", c3594bArr2, fVar3);
                } else if (Intrinsics.b(Unit.class, cls3)) {
                    oVar2 = new h("unregisterTaskAsync", c3594bArr2, fVar3);
                } else if (Intrinsics.b(Unit.class, cls2)) {
                    oVar2 = new p013ac.j("unregisterTaskAsync", c3594bArr2, fVar3);
                } else if (Intrinsics.b(Unit.class, cls)) {
                    oVar2 = new k("unregisterTaskAsync", c3594bArr2, fVar3);
                } else {
                    oVar2 = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("unregisterTaskAsync", c3594bArr2, fVar3) : new t("unregisterTaskAsync", c3594bArr2, fVar3);
                }
                fVar2 = oVar2;
            }
            dVar.m().put("unregisterTaskAsync", fVar2);
            return dVar.w();
        } finally {
            p381v3.a.f();
        }
    }
}
