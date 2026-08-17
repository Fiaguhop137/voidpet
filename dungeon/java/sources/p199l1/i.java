package p199l1;

import android.util.SparseBooleanArray;
import kotlin.collections.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class a extends K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f48592b;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f48592b = sparseBooleanArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48591a < this.f48592b.size();
        }

        @Override // kotlin.collections.K
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f48592b;
            int i10 = this.f48591a;
            this.f48591a = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    public static final K a(SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }
}
