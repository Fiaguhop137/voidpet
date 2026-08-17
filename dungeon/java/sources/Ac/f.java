package Ac;

import Bc.q;
import Cc.s;
import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f273b = Ad.j.b(new b(context));
        this.f274c = Ad.j.b(new c(context, this));
        this.f275d = Ad.j.b(new d());
        this.f276e = Ad.j.b(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q l(Context context, f fVar) {
        return new q(context, fVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s m() {
        return new s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bc.d r(Context context) {
        return new Bc.d(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cc.e s(f fVar) {
        return new Cc.e(fVar.a());
    }

    @Override // Ac.k
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q c() {
        return (q) this.f274c.getValue();
    }

    @Override // Ac.k
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s a() {
        return (s) this.f275d.getValue();
    }

    @Override // Ac.k
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Bc.d e() {
        return (Bc.d) this.f273b.getValue();
    }

    @Override // Ac.k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Cc.e b() {
        return (Cc.e) this.f276e.getValue();
    }
}
