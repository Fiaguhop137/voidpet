package Fb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p274p4.h;
import p382v4.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements n {
    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(String model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new n.a(new K4.c(model), new a(model));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return StringsKt.O(model, "data:", false, 2, null);
    }
}
