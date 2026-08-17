package J0;

import I.d2;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f5675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f5676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5677c;

    public t(d2 d2Var, t tVar) {
        this.f5675a = d2Var;
        this.f5676b = tVar;
        this.f5677c = d2Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f5677c;
        Intrinsics.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f5675a.getValue() != this.f5677c) {
            return true;
        }
        t tVar = this.f5676b;
        return tVar != null && tVar.b();
    }
}
