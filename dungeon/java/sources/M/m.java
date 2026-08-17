package M;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f6667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6668e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f6666c = i12;
        Object[] objArr2 = new Object[i12];
        this.f6667d = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f6668e = r10;
        objArr2[0] = objArr;
        i(i10 - r10, 1);
    }

    private final Object h() {
        int iC = c() & 31;
        Object obj = this.f6667d[this.f6666c - 1];
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iC];
    }

    private final void i(int i10, int i11) {
        int i12 = (this.f6666c - i11) * 5;
        while (i11 < this.f6666c) {
            Object[] objArr = this.f6667d;
            Object obj = objArr[i11 - 1];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[n.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void k(int i10) {
        int i11 = 0;
        while (n.a(c(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            i(c(), ((this.f6666c - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(Object[] objArr, int i10, int i11, int i12) {
        f(i10);
        g(i11);
        this.f6666c = i12;
        if (this.f6667d.length < i12) {
            this.f6667d = new Object[i12];
        }
        this.f6667d[0] = objArr;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f6668e = r10;
        i(i10 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objH = h();
        f(c() + 1);
        if (c() == d()) {
            this.f6668e = true;
            return objH;
        }
        k(0);
        return objH;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        f(c() - 1);
        if (this.f6668e) {
            this.f6668e = false;
            return h();
        }
        k(31);
        return h();
    }
}
