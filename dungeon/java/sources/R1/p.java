package R1;

import U1.AbstractC1459a;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f10205a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f10206a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10207b;

        public b a(int i10) {
            AbstractC1459a.g(!this.f10207b);
            this.f10206a.append(i10, true);
            return this;
        }

        public b b(p pVar) {
            for (int i10 = 0; i10 < pVar.c(); i10++) {
                a(pVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public p e() {
            AbstractC1459a.g(!this.f10207b);
            this.f10207b = true;
            return new p(this.f10206a, null);
        }
    }

    private p(SparseBooleanArray sparseBooleanArray) {
        this.f10205a = sparseBooleanArray;
    }

    /* synthetic */ p(SparseBooleanArray sparseBooleanArray, a aVar) {
        this(sparseBooleanArray);
    }

    public boolean a(int i10) {
        return this.f10205a.get(i10);
    }

    public int b(int i10) {
        AbstractC1459a.c(i10, 0, c());
        return this.f10205a.keyAt(i10);
    }

    public int c() {
        return this.f10205a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f10205a.equals(((p) obj).f10205a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10205a.hashCode();
    }
}
