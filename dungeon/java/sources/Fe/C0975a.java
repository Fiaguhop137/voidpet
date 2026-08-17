package Fe;

import Re.S;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;

/* JADX INFO: renamed from: Fe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0975a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975a(p033be.c value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // Fe.g
    public S a(H module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return ((p033be.c) b()).getType();
    }
}
