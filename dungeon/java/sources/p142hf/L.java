package p142hf;

import Ed.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements InterfaceC3565d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3565d f42904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f42905b;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f42906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f42907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42908c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42910e;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42908c = obj;
            this.f42910e |= Integer.MIN_VALUE;
            return L.this.a(this);
        }
    }

    public L(InterfaceC3565d interfaceC3565d, Function2 function2) {
        this.f42904a = interfaceC3565d;
        this.f42905b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((p142hf.L) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [jf.r] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Ed.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hf.L.a
            if (r0 == 0) goto L13
            r0 = r7
            hf.L$a r0 = (hf.L.a) r0
            int r1 = r0.f42910e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42910e = r1
            goto L18
        L13:
            hf.L$a r0 = new hf.L$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f42908c
            java.lang.Object r1 = Fd.b.e()
            int r2 = r0.f42910e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ad.r.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f42907b
            jf.r r2 = (p177jf.r) r2
            java.lang.Object r4 = r0.f42906a
            hf.L r4 = (p142hf.L) r4
            Ad.r.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            Ad.r.b(r7)
            jf.r r2 = new jf.r
            hf.d r7 = r6.f42904a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f42905b     // Catch: java.lang.Throwable -> L40
            r0.f42906a = r6     // Catch: java.lang.Throwable -> L40
            r0.f42907b = r2     // Catch: java.lang.Throwable -> L40
            r0.f42910e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            hf.d r7 = r4.f42904a
            boolean r2 = r7 instanceof p142hf.L
            if (r2 == 0) goto L7c
            hf.L r7 = (p142hf.L) r7
            r2 = 0
            r0.f42906a = r2
            r0.f42907b = r2
            r0.f42910e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f48228a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f48228a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hf.L.a(Ed.b):java.lang.Object");
    }

    @Override // p142hf.InterfaceC3565d
    public Object emit(Object obj, b bVar) {
        return this.f42904a.emit(obj, bVar);
    }
}
