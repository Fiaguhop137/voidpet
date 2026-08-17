package Lb;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p274p4.h;
import p382v4.n;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements n {
    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(e model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        List<String> pathSegments = model.a().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return new n.a(new K4.c(model), new d(StringsKt.I(CollectionsKt.s0(pathSegments, "/", null, null, 0, null, null, 62, null), "\\", "/", false, 4, null)));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(e model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
