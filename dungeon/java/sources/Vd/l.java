package Vd;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14304a = new l();

    private l() {
    }

    @Override // Vd.h
    public List a() {
        return CollectionsKt.l();
    }

    @Override // Vd.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    @Override // Vd.h
    public boolean c() {
        return h.a.b(this);
    }

    @Override // Vd.h
    public Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public Void d() {
        return null;
    }

    @Override // Vd.h
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
