package Rd;

import java.util.NoSuchElementException;
import kotlin.collections.L;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11019d;

    public d(long j10, long j11, long j12) {
        this.f11016a = j12;
        this.f11017b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f11018c = z10;
        this.f11019d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11018c;
    }

    @Override // kotlin.collections.L
    public long nextLong() {
        long j10 = this.f11019d;
        if (j10 != this.f11017b) {
            this.f11019d = this.f11016a + j10;
            return j10;
        }
        if (!this.f11018c) {
            throw new NoSuchElementException();
        }
        this.f11018c = false;
        return j10;
    }
}
