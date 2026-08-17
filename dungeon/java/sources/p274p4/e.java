package p274p4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50777a;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f50777a = i10;
    }
}
