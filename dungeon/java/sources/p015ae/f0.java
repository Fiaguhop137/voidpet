package p015ae;

import He.e;
import Qe.i;
import Qe.m;
import Qe.n;
import Re.v0;
import Se.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1791e f19729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f19730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f19731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f19732d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f19728f = {F.j(new w(f0.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f19727e = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(InterfaceC1791e classDescriptor, n storageManager, g kotlinTypeRefinerForOwnerModule, Function1 scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new f0(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    private f0(InterfaceC1791e interfaceC1791e, n nVar, Function1 function1, g gVar) {
        this.f19729a = interfaceC1791e;
        this.f19730b = function1;
        this.f19731c = gVar;
        this.f19732d = nVar.c(new d0(this));
    }

    public /* synthetic */ f0(InterfaceC1791e interfaceC1791e, n nVar, Function1 function1, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1791e, nVar, function1, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ke.k d(f0 f0Var, g gVar) {
        return (Ke.k) f0Var.f19730b.invoke(gVar);
    }

    private final Ke.k e() {
        return (Ke.k) m.a(this.f19732d, this, f19728f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ke.k f(f0 f0Var) {
        return (Ke.k) f0Var.f19730b.invoke(f0Var.f19731c);
    }

    public final Ke.k c(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(e.s(this.f19729a))) {
            return e();
        }
        v0 v0VarL = this.f19729a.l();
        Intrinsics.checkNotNullExpressionValue(v0VarL, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(v0VarL) ? e() : kotlinTypeRefiner.c(this.f19729a, new e0(this, kotlinTypeRefiner));
    }
}
