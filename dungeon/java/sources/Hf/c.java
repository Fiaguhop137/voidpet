package Hf;

import If.C1106h;
import If.C1118u;
import If.a0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1106h f4304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f4305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1118u f4306d;

    public c(boolean z10) {
        this.f4303a = z10;
        C1106h c1106h = new C1106h();
        this.f4304b = c1106h;
        Inflater inflater = new Inflater(true);
        this.f4305c = inflater;
        this.f4306d = new C1118u((a0) c1106h, inflater);
    }

    public final void a(C1106h buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f4304b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f4303a) {
            this.f4305c.reset();
        }
        this.f4304b.U0(buffer);
        this.f4304b.writeInt(65535);
        long bytesRead = this.f4305c.getBytesRead() + this.f4304b.size();
        do {
            this.f4306d.a(buffer, Long.MAX_VALUE);
        } while (this.f4305c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4306d.close();
    }
}
