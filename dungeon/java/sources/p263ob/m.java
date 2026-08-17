package p263ob;

import Ad.AbstractC0793c;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f50542a;

    public m(String category, File filesDirectory) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        this.f50542a = new l(category, filesDirectory);
    }

    @Override // p263ob.a
    public void a(c type, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        l.e(this.f50542a, message, null, 2, null);
        if (th != null) {
            l.e(this.f50542a, f.a(th) + "\n" + AbstractC0793c.c(th), null, 2, null);
        }
    }
}
