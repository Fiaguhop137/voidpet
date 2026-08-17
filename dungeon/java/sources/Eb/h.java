package Eb;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p382v4.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    private final Object f(Uri uri, int i10, Object obj, Function1 function1) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.l0(pathSegments, i10);
        return str == null ? obj : function1.invoke(str);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a a(f model, int i10, int i11, p274p4.h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new n.a(new K4.c(model), new a((String) f(model.b(), 0, null, new g()), model.c(), model.a(), 1.0f));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean b(f model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
