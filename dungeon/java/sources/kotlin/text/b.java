package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f48488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f48491d;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48492a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IntRange f48495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f48496e;

        a() {
            int iM = kotlin.ranges.e.m(b.this.f48489b, 0, b.this.f48488a.length());
            this.f48493b = iM;
            this.f48494c = iM;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void a() {
            Pair pair;
            if (this.f48494c < 0) {
                this.f48492a = 0;
                this.f48495d = null;
                return;
            }
            if (b.this.f48490c > 0) {
                int i10 = this.f48496e + 1;
                this.f48496e = i10;
                if (i10 >= b.this.f48490c) {
                    this.f48495d = new IntRange(this.f48493b, StringsKt__StringsKt.b0(b.this.f48488a));
                    this.f48494c = -1;
                } else if (this.f48494c > b.this.f48488a.length() && (pair = (Pair) b.this.f48491d.invoke(b.this.f48488a, Integer.valueOf(this.f48494c))) != null) {
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    this.f48495d = kotlin.ranges.e.t(this.f48493b, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f48493b = i11;
                    this.f48494c = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f48495d = new IntRange(this.f48493b, StringsKt__StringsKt.b0(b.this.f48488a));
                    this.f48494c = -1;
                }
            } else if (this.f48494c > b.this.f48488a.length()) {
                this.f48495d = new IntRange(this.f48493b, StringsKt__StringsKt.b0(b.this.f48488a));
                this.f48494c = -1;
            } else {
                int iIntValue3 = ((Number) pair.getFirst()).intValue();
                int iIntValue4 = ((Number) pair.getSecond()).intValue();
                this.f48495d = kotlin.ranges.e.t(this.f48493b, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f48493b = i12;
                this.f48494c = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f48492a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f48492a == -1) {
                a();
            }
            if (this.f48492a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f48495d;
            Intrinsics.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f48495d = null;
            this.f48492a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48492a == -1) {
                a();
            }
            return this.f48492a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f48488a = input;
        this.f48489b = i10;
        this.f48490c = i11;
        this.f48491d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
