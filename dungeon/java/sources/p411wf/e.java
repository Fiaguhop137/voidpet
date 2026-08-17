package p411wf;

import If.AbstractC1115q;
import If.C1106h;
import If.Y;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class e extends AbstractC1115q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f56993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f56993b = onException;
    }

    @Override // If.AbstractC1115q, If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f56994c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f56994c = true;
            this.f56993b.invoke(e10);
        }
    }

    @Override // If.AbstractC1115q, If.Y, java.io.Flushable
    public void flush() {
        if (this.f56994c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f56994c = true;
            this.f56993b.invoke(e10);
        }
    }

    @Override // If.AbstractC1115q, If.Y
    public void w1(C1106h source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f56994c) {
            source.skip(j10);
            return;
        }
        try {
            super.w1(source, j10);
        } catch (IOException e10) {
            this.f56994c = true;
            this.f56993b.invoke(e10);
        }
    }
}
