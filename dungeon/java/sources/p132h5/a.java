package p132h5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42583a = new a();

    private a() {
    }

    @Override // p132h5.b
    public void a(p114g5.a tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // p132h5.b
    public void b(p114g5.a tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
    }

    @Override // p132h5.b
    public boolean c(p114g5.a tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return false;
    }
}
