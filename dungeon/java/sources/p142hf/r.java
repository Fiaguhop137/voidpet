package p142hf;

import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class r {

    public static final class a implements InterfaceC3564c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3564c f43025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f43026b;

        /* JADX INFO: renamed from: hf.r$a$a, reason: collision with other inner class name */
        public static final class C0509a implements InterfaceC3565d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3565d f43027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f43028b;

            /* JADX INFO: renamed from: hf.r$a$a$a, reason: collision with other inner class name */
            public static final class C0510a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f43029a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f43030b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f43032d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f43033e;

                public C0510a(b bVar) {
                    super(bVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43029a = obj;
                    this.f43030b |= Integer.MIN_VALUE;
                    return C0509a.this.emit(null, this);
                }
            }

            public C0509a(InterfaceC3565d interfaceC3565d, Function2 function2) {
                this.f43027a = interfaceC3565d;
                this.f43028b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            @Override // p142hf.InterfaceC3565d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, Ed.b r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hf.r.a.C0509a.C0510a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hf.r$a$a$a r0 = (hf.r.a.C0509a.C0510a) r0
                    int r1 = r0.f43030b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43030b = r1
                    goto L18
                L13:
                    hf.r$a$a$a r0 = new hf.r$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f43029a
                    java.lang.Object r1 = Fd.b.e()
                    int r2 = r0.f43030b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    Ad.r.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f43033e
                    hf.d r6 = (p142hf.InterfaceC3565d) r6
                    java.lang.Object r2 = r0.f43032d
                    Ad.r.b(r7)
                    goto L5c
                L3e:
                    Ad.r.b(r7)
                    hf.d r7 = r5.f43027a
                    kotlin.jvm.functions.Function2 r2 = r5.f43028b
                    r0.f43032d = r6
                    r0.f43033e = r7
                    r0.f43030b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC3976m.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC3976m.a(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f43032d = r7
                    r0.f43033e = r7
                    r0.f43030b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f48228a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hf.r.a.C0509a.emit(java.lang.Object, Ed.b):java.lang.Object");
            }
        }

        public a(InterfaceC3564c interfaceC3564c, Function2 function2) {
            this.f43025a = interfaceC3564c;
            this.f43026b = function2;
        }

        @Override // p142hf.InterfaceC3564c
        public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
            Object objCollect = this.f43025a.collect(new C0509a(interfaceC3565d, this.f43026b), bVar);
            return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
        }
    }

    public static final InterfaceC3564c a(InterfaceC3564c interfaceC3564c, Function2 function2) {
        return new a(interfaceC3564c, function2);
    }
}
