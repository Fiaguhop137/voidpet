package p359u;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f54937a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f54938b = new float[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C4220t f54939c = new C4220t(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final class a implements InterfaceC4219s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A[] f54940a;

        a(AbstractC4218q abstractC4218q, float f10, float f11) {
            int iB = abstractC4218q.b();
            A[] aArr = new A[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                aArr[i10] = new A(f10, f11, abstractC4218q.a(i10));
            }
            this.f54940a = aArr;
        }

        @Override // p359u.InterfaceC4219s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public A get(int i10) {
            return this.f54940a[i10];
        }
    }

    public static final class b implements InterfaceC4219s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f54941a;

        b(float f10, float f11) {
            this.f54941a = new A(f10, f11, 0.0f, 4, null);
        }

        @Override // p359u.InterfaceC4219s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public A get(int i10) {
            return this.f54941a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4219s b(AbstractC4218q abstractC4218q, float f10, float f11) {
        return abstractC4218q != null ? new a(abstractC4218q, f10, f11) : new b(f10, f11);
    }
}
