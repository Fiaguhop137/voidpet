package Rd;

import java.util.NoSuchElementException;
import kotlin.collections.K;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11015d;

    public c(int i10, int i11, int i12) {
        this.f11012a = i12;
        this.f11013b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f11014c = z10;
        this.f11015d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11014c;
    }

    @Override // kotlin.collections.K
    public int nextInt() {
        int i10 = this.f11015d;
        if (i10 != this.f11013b) {
            this.f11015d = this.f11012a + i10;
            return i10;
        }
        if (!this.f11014c) {
            throw new NoSuchElementException();
        }
        this.f11014c = false;
        return i10;
    }
}
