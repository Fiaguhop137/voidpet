package C6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements AutoCloseable {
    public c(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        p295q7.a.c(0L, sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        p295q7.a.i(0L);
    }
}
