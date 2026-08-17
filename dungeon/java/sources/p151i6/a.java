package p151i6;

import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b.c {
    @Override // i6.b.c
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (c()) {
            Trace.beginSection(name);
        }
    }

    @Override // i6.b.c
    public void b() {
        if (c()) {
            Trace.endSection();
        }
    }

    @Override // i6.b.c
    public boolean c() {
        return false;
    }
}
