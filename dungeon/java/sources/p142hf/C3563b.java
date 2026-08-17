package p142hf;

import Ad.r;
import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import p177jf.p;

/* JADX INFO: renamed from: hf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3563b implements InterfaceC3564c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3564c f42921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f42922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f42923c;

    /* JADX INFO: renamed from: hf.b$a */
    static final class a implements InterfaceC3565d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f42925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3565d f42926c;

        /* JADX INFO: renamed from: hf.b$a$a, reason: collision with other inner class name */
        static final class C0505a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f42927a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f42929c;

            C0505a(b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42927a = obj;
                this.f42929c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(E e10, InterfaceC3565d interfaceC3565d) {
            this.f42925b = e10;
            this.f42926c = interfaceC3565d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p142hf.InterfaceC3565d
        public final Object emit(Object obj, b bVar) {
            C0505a c0505a;
            if (bVar instanceof C0505a) {
                c0505a = (C0505a) bVar;
                int i10 = c0505a.f42929c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0505a.f42929c = i10 - Integer.MIN_VALUE;
                } else {
                    c0505a = new C0505a(bVar);
                }
            } else {
                c0505a = new C0505a(bVar);
            }
            Object obj2 = c0505a.f42927a;
            Object objE = Fd.b.e();
            int i11 = c0505a.f42929c;
            if (i11 == 0) {
                r.b(obj2);
                Object objInvoke = C3563b.this.f42922b.invoke(obj);
                Object obj3 = this.f42925b.f48338a;
                if (obj3 != p.f47424a && ((Boolean) C3563b.this.f42923c.invoke(obj3, objInvoke)).booleanValue()) {
                    return Unit.f48228a;
                }
                this.f42925b.f48338a = objInvoke;
                InterfaceC3565d interfaceC3565d = this.f42926c;
                c0505a.f42929c = 1;
                if (interfaceC3565d.emit(obj, c0505a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return Unit.f48228a;
        }
    }

    public C3563b(InterfaceC3564c interfaceC3564c, Function1 function1, Function2 function2) {
        this.f42921a = interfaceC3564c;
        this.f42922b = function1;
        this.f42923c = function2;
    }

    @Override // p142hf.InterfaceC3564c
    public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
        E e10 = new E();
        e10.f48338a = p.f47424a;
        Object objCollect = this.f42921a.collect(new a(e10, interfaceC3565d), bVar);
        return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
    }
}
