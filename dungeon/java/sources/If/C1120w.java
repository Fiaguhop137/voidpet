package If;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1120w extends AbstractC1111m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f5565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120w(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f5565e = randomAccessFile;
    }

    @Override // If.AbstractC1111m
    protected synchronized void f() {
        this.f5565e.close();
    }

    @Override // If.AbstractC1111m
    protected synchronized int g(long j10, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5565e.seek(j10);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f5565e.read(array, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // If.AbstractC1111m
    protected synchronized long h() {
        return this.f5565e.length();
    }
}
