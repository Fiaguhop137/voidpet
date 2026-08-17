package Wb;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Nb.a, p227mb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14984a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14984a = context;
    }

    @Override // Nb.a
    public File a() {
        File cacheDir = this.f14984a.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return cacheDir;
    }

    @Override // p227mb.d
    public List h() {
        return CollectionsKt.e(Nb.a.class);
    }
}
