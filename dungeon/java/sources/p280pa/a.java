package p280pa;

import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50878a;

    public a(String str, int i10) {
        super(r.g(str, "Provided message must not be empty."));
        this.f50878a = i10;
    }

    public a(String str, int i10, Throwable th) {
        super(r.g(str, "Provided message must not be empty."), th);
        this.f50878a = i10;
    }
}
