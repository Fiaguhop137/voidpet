package p088ef;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient B0 f40753a;

    public C0(String str, Throwable th, B0 b10) {
        super(str);
        this.f40753a = b10;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c10 = (C0) obj;
        return Intrinsics.b(c10.getMessage(), getMessage()) && Intrinsics.b(c10.f40753a, this.f40753a) && Intrinsics.b(c10.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f40753a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f40753a;
    }
}
