package Ag;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f481b;

    protected u(int i10, byte[] bArr) {
        this.f480a = i10;
        this.f481b = bArr;
    }

    public int a() {
        return this.f480a;
    }

    public byte[] b() {
        return A.c(this.f481b);
    }
}
