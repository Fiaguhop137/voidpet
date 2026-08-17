package p323s;

import Ed.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.j;

/* JADX INFO: renamed from: s.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4107g implements Set, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f52699a;

    /* JADX INFO: renamed from: s.g$a */
    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f52700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f52701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52705g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f52706h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f52707i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f52708j;

        a(b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            a aVar = C4107g.this.new a(bVar);
            aVar.f52708j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, b bVar) {
            return ((a) create(jVar, bVar)).invokeSuspend(Unit.f48228a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0059  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:20:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a5 -> B:21:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00b9). Please report as a decompilation issue!!! */
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
                int r2 = r0.f52707i
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L32
                if (r2 != r5) goto L2a
                int r2 = r0.f52705g
                int r6 = r0.f52704f
                long r7 = r0.f52706h
                int r9 = r0.f52703e
                int r10 = r0.f52702d
                java.lang.Object r11 = r0.f52701c
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f52700b
                s.g r12 = (p323s.C4107g) r12
                java.lang.Object r13 = r0.f52708j
                kotlin.sequences.j r13 = (kotlin.sequences.j) r13
                Ad.r.b(r21)
                goto La8
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L32:
                Ad.r.b(r21)
                java.lang.Object r2 = r0.f52708j
                kotlin.sequences.j r2 = (kotlin.sequences.j) r2
                s.g r6 = p323s.C4107g.this
                s.Z r6 = p323s.C4107g.a(r6)
                s.g r7 = p323s.C4107g.this
                long[] r6 = r6.f52660a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbf
                r9 = 0
            L49:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lb8
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6a:
                if (r2 >= r6) goto Lb0
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La8
                int r14 = r9 << 3
                int r14 = r14 + r2
                s.A r15 = new s.A
                s.Z r3 = p323s.C4107g.a(r12)
                java.lang.Object[] r3 = r3.f52661b
                r3 = r3[r14]
                r17 = r4
                s.Z r4 = p323s.C4107g.a(r12)
                java.lang.Object[] r4 = r4.f52662c
                r4 = r4[r14]
                r15.<init>(r3, r4)
                r0.f52708j = r13
                r0.f52700b = r12
                r0.f52701c = r11
                r0.f52702d = r10
                r0.f52703e = r9
                r0.f52706h = r7
                r0.f52704f = r6
                r0.f52705g = r2
                r0.f52707i = r5
                java.lang.Object r3 = r13.b(r15, r0)
                if (r3 != r1) goto Laa
                return r1
            La8:
                r17 = r4
            Laa:
                long r7 = r7 >> r17
                int r2 = r2 + r5
                r4 = r17
                goto L6a
            Lb0:
                r3 = r4
                if (r6 != r3) goto Lbf
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
                goto Lb9
            Lb8:
                r3 = r4
            Lb9:
                if (r9 == r8) goto Lbf
                int r9 = r9 + 1
                r4 = r3
                goto L49
            Lbf:
                kotlin.Unit r1 = kotlin.Unit.f48228a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p323s.C4107g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4107g(Z parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f52699a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.b(this.f52699a.e(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<Map.Entry> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection) {
            if (!Intrinsics.b(this.f52699a.e(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f52699a.f52664e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f52699a.h();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.k.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC3970g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3970g.b(this, array);
    }
}
