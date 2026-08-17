package p379v1;

import Ad.AbstractC0793c;
import Ad.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4234h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55707a = new a(null);

    /* JADX INFO: renamed from: v1.h$a */
    public static final class a {

        /* JADX INFO: renamed from: v1.h$a$a, reason: collision with other inner class name */
        static final class C0702a extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f55708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f55709b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f55710c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0702a(List list, Ed.b bVar) {
                super(2, bVar);
                this.f55710c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                C0702a c0702a = new C0702a(this.f55710c, bVar);
                c0702a.f55709b = obj;
                return c0702a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, Ed.b bVar) {
                return ((C0702a) create(sVar, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = Fd.b.e();
                int i10 = this.f55708a;
                if (i10 == 0) {
                    r.b(obj);
                    s sVar = (s) this.f55709b;
                    a aVar = AbstractC4234h.f55707a;
                    List list = this.f55710c;
                    this.f55708a = 1;
                    if (aVar.c(list, sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return Unit.f48228a;
            }
        }

        /* JADX INFO: renamed from: v1.h$a$b */
        static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f55711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f55712b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f55713c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f55715e;

            b(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f55713c = obj;
                this.f55715e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: v1.h$a$c */
        static final class c extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f55716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f55717b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f55718c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f55719d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f55720e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f55721f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f55722g;

            /* JADX INFO: renamed from: v1.h$a$c$a, reason: collision with other inner class name */
            static final class C0703a extends m implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f55723a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC4233g f55724b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0703a(InterfaceC4233g interfaceC4233g, Ed.b bVar) {
                    super(1, bVar);
                    this.f55724b = interfaceC4233g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Ed.b create(Ed.b bVar) {
                    return new C0703a(this.f55724b, bVar);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Ed.b bVar) {
                    return ((C0703a) create(bVar)).invokeSuspend(Unit.f48228a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = Fd.b.e();
                    int i10 = this.f55723a;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC4233g interfaceC4233g = this.f55724b;
                        this.f55723a = 1;
                        if (interfaceC4233g.b(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return Unit.f48228a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, Ed.b bVar) {
                super(2, bVar);
                this.f55721f = list;
                this.f55722g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                c cVar = new c(this.f55721f, this.f55722g, bVar);
                cVar.f55720e = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, Ed.b bVar) {
                return ((c) create(obj, bVar)).invokeSuspend(Unit.f48228a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004a  */
            /* JADX WARN: Code duplicated, block: B:16:0x0061  */
            /* JADX WARN: Code duplicated, block: B:19:0x006e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0088  */
            /* JADX WARN: Code duplicated, block: B:23:0x008a  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = Fd.b.e()
                    int r1 = r9.f55719d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f55716a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f55720e
                    java.util.List r4 = (java.util.List) r4
                    Ad.r.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f55718c
                    java.lang.Object r4 = r9.f55717b
                    v1.g r4 = (p379v1.InterfaceC4233g) r4
                    java.lang.Object r5 = r9.f55716a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f55720e
                    java.util.List r6 = (java.util.List) r6
                    Ad.r.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    Ad.r.b(r10)
                    java.lang.Object r10 = r9.f55720e
                    java.util.List r1 = r9.f55721f
                    java.util.List r4 = r9.f55722g
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    v1.g r5 = (p379v1.InterfaceC4233g) r5
                    r9.f55720e = r4
                    r9.f55716a = r1
                    r9.f55717b = r5
                    r9.f55718c = r10
                    r9.f55719d = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    v1.h$a$c$a r10 = new v1.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f55720e = r4
                    r9.f55716a = r5
                    r9.f55717b = r7
                    r9.f55718c = r7
                    r9.f55719d = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p379v1.AbstractC4234h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final Object c(List list, s sVar, Ed.b bVar) throws Throwable {
            b bVar2;
            List list2;
            E e10;
            Iterator it;
            Throwable th;
            Function1 function1;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f55715e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f55715e = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f55713c;
            Object objE = Fd.b.e();
            int i11 = bVar2.f55715e;
            if (i11 == 0) {
                r.b(obj);
                ArrayList arrayList = new ArrayList();
                Function2 cVar = new c(list, arrayList, null);
                bVar2.f55711a = arrayList;
                bVar2.f55715e = 1;
                if (sVar.a(cVar, bVar2) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 == 1) {
                list2 = (List) bVar2.f55711a;
                r.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar2.f55712b;
                e10 = (E) bVar2.f55711a;
                try {
                    r.b(obj);
                } catch (Throwable th2) {
                    Object obj2 = e10.f48338a;
                    if (obj2 == null) {
                        e10.f48338a = th2;
                    } else {
                        Intrinsics.c(obj2);
                        AbstractC0793c.a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar2.f55711a = e10;
                bVar2.f55712b = it;
                bVar2.f55715e = 2;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f48338a;
            if (th == null) {
                return Unit.f48228a;
            }
            throw th;
            e10 = new E();
            it = list2.iterator();
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                bVar2.f55711a = e10;
                bVar2.f55712b = it;
                bVar2.f55715e = 2;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f48338a;
            if (th == null) {
                return Unit.f48228a;
            }
            throw th;
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0702a(migrations, null);
        }
    }
}
