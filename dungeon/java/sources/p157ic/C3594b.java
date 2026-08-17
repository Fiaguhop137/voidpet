package p157ic;

import Ad.j;
import Rb.d;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.b;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: renamed from: ic.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3594b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f43896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f43897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f43898c;

    public C3594b(o kType, a0 a0Var) {
        Intrinsics.checkNotNullParameter(kType, "kType");
        this.f43896a = kType;
        this.f43897b = a0Var;
        this.f43898c = j.b(new C3593a(this));
    }

    public /* synthetic */ C3594b(o oVar, a0 a0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i10 & 2) != 0 ? null : a0Var);
    }

    public static /* synthetic */ Object c(C3594b c3594b, Object obj, d dVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c3594b.b(obj, dVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(C3594b c3594b) {
        b bVarA;
        a0 a0Var = c3594b.f43897b;
        return (a0Var == null || (bVarA = a0Var.a(c3594b.f43896a)) == null) ? d0.f43902a.a(c3594b.f43896a) : bVarA;
    }

    private final b e() {
        return (b) this.f43898c.getValue();
    }

    public final Object b(Object obj, d dVar, boolean z10) {
        return (z10 || !e().b() || (obj instanceof Dynamic)) ? e().a(obj, dVar, z10) : obj;
    }

    public final ExpectedType f() {
        return e().c();
    }

    public final o g() {
        return this.f43896a;
    }
}
