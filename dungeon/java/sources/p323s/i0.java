package p323s;

import Ed.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.j;

/* JADX INFO: loaded from: classes.dex */
final class i0 implements Collection, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f52718a;

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f52719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f52720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f52725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f52726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f52727j;

        a(b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            a aVar = i0.this.new a(bVar);
            aVar.f52727j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, b bVar) {
            return ((a) create(jVar, bVar)).invokeSuspend(Unit.f48228a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x0097 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = Fd.b.e()
                int r2 = r0.f52726i
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f52724g
                int r6 = r0.f52723f
                long r7 = r0.f52725h
                int r9 = r0.f52722e
                int r10 = r0.f52721d
                java.lang.Object r11 = r0.f52720c
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f52719b
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f52727j
                kotlin.sequences.j r13 = (kotlin.sequences.j) r13
                Ad.r.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                Ad.r.b(r21)
                java.lang.Object r2 = r0.f52727j
                kotlin.sequences.j r2 = (kotlin.sequences.j) r2
                s.i0 r6 = p323s.i0.this
                s.Z r6 = p323s.i0.a(r6)
                java.lang.Object[] r7 = r6.f52662c
                long[] r6 = r6.f52660a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f52727j = r13
                r0.f52719b = r12
                r0.f52720c = r11
                r0.f52721d = r10
                r0.f52722e = r9
                r0.f52725h = r7
                r0.f52723f = r6
                r0.f52724g = r2
                r0.f52726i = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                kotlin.Unit r1 = kotlin.Unit.f48228a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: s.i0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i0(Z parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f52718a = parent;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f52718a.f52664e;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f52718a.d(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f52718a.d(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f52718a.h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.k.a(new a(null));
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3970g.a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3970g.b(this, array);
    }
}
