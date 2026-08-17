package p195kf;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3929g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient CoroutineContext f48142a;

    public C3929g(CoroutineContext coroutineContext) {
        this.f48142a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f48142a.toString();
    }
}
