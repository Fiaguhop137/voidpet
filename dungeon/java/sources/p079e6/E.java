package p079e6;

import V4.k;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f40481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40485g;

    public E(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public E(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        k.i(i10 >= 0 && i11 >= i10);
        this.f40480b = i10;
        this.f40479a = i11;
        this.f40481c = sparseIntArray;
        this.f40482d = i12;
        this.f40483e = i13;
        this.f40485g = i14;
    }
}
