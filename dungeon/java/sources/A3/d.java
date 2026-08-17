package A3;

import If.C1106h;
import If.Y;
import If.b0;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y f199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f201c;

    public d(Y y10, Function1 function1) {
        this.f199a = y10;
        this.f200b = function1;
    }

    @Override // If.Y
    public b0 C() {
        return this.f199a.C();
    }

    @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f199a.close();
        } catch (IOException e10) {
            this.f201c = true;
            this.f200b.invoke(e10);
        }
    }

    @Override // If.Y, java.io.Flushable
    public void flush() {
        try {
            this.f199a.flush();
        } catch (IOException e10) {
            this.f201c = true;
            this.f200b.invoke(e10);
        }
    }

    @Override // If.Y
    public void w1(C1106h c1106h, long j10) throws EOFException {
        if (this.f201c) {
            c1106h.skip(j10);
            return;
        }
        try {
            this.f199a.w1(c1106h, j10);
        } catch (IOException e10) {
            this.f201c = true;
            this.f200b.invoke(e10);
        }
    }
}
