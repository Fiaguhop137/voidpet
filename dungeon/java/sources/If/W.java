package If;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f5472a = new W();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f5473b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V f5474c = new V(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f5476e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f5475d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f5476e = atomicReferenceArr;
    }

    private W() {
    }

    private final AtomicReference a() {
        return f5476e[(int) (Thread.currentThread().getId() & (((long) f5475d) - 1))];
    }

    public static final void b(V segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f5470f != null || segment.f5471g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f5468d) {
            return;
        }
        AtomicReference atomicReferenceA = f5472a.a();
        V v10 = f5474c;
        V v11 = (V) atomicReferenceA.getAndSet(v10);
        if (v11 == v10) {
            return;
        }
        int i10 = v11 != null ? v11.f5467c : 0;
        if (i10 >= f5473b) {
            atomicReferenceA.set(v11);
            return;
        }
        segment.f5470f = v11;
        segment.f5466b = 0;
        segment.f5467c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final V c() {
        AtomicReference atomicReferenceA = f5472a.a();
        V v10 = f5474c;
        V v11 = (V) atomicReferenceA.getAndSet(v10);
        if (v11 == v10) {
            return new V();
        }
        if (v11 == null) {
            atomicReferenceA.set(null);
            return new V();
        }
        atomicReferenceA.set(v11.f5470f);
        v11.f5470f = null;
        v11.f5467c = 0;
        return v11;
    }
}
