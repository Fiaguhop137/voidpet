package M9;

import Ad.r;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.reflect.k;
import p088ef.AbstractC3291j;
import p088ef.O;
import p142hf.AbstractC3566e;
import p142hf.InterfaceC3564c;
import p379v1.C4230d;
import p379v1.InterfaceC4235i;
import p433y1.i;
import p451z1.f;
import p451z1.g;
import p451z1.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f7052f = {F.k(new y(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f7055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pd.c f7056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4235i f7057e;

    static final class a extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7060c;

        /* JADX INFO: renamed from: M9.c$a$a, reason: collision with other inner class name */
        static final class C0126a extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f7061a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f7062b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f7063c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0126a(Function1 function1, Ed.b bVar) {
                super(2, bVar);
                this.f7063c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                C0126a c0126a = new C0126a(this.f7063c, bVar);
                c0126a.f7062b = obj;
                return c0126a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p451z1.c cVar, Ed.b bVar) {
                return ((C0126a) create(cVar, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Fd.b.e();
                if (this.f7061a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f7063c.invoke((p451z1.c) this.f7062b);
                return Unit.f48228a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, Ed.b bVar) {
            super(2, bVar);
            this.f7060c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return c.this.new a(this.f7060c, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f7058a;
            try {
                if (i10 == 0) {
                    r.b(obj);
                    if (Intrinsics.b(c.this.f7055c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f7055c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC4235i interfaceC4235i = c.this.f7057e;
                    C0126a c0126a = new C0126a(this.f7060c, null);
                    this.f7058a = 1;
                    obj = j.a(interfaceC4235i, c0126a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                f fVar = (f) obj;
                c.this.f7055c.set(kotlin.coroutines.jvm.internal.b.a(false));
                return fVar;
            } catch (Throwable th) {
                c.this.f7055c.set(kotlin.coroutines.jvm.internal.b.a(false));
                throw th;
            }
        }
    }

    static final class b extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7064a;

        b(Ed.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return c.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map mapA;
            Object objE = Fd.b.e();
            int i10 = this.f7064a;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC3564c interfaceC3564cN = c.this.f7057e.n();
                this.f7064a = 1;
                obj = AbstractC3566e.o(interfaceC3564cN, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? N.i() : mapA;
        }
    }

    /* JADX INFO: renamed from: M9.c$c, reason: collision with other inner class name */
    static final class C0127c extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7066a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f7068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f7069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0127c(f.a aVar, Object obj, Ed.b bVar) {
            super(2, bVar);
            this.f7068c = aVar;
            this.f7069d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return c.this.new C0127c(this.f7068c, this.f7069d, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((C0127c) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = Fd.b.e();
            int i10 = this.f7066a;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC3564c interfaceC3564cN = c.this.f7057e.n();
                this.f7066a = 1;
                obj = AbstractC3566e.o(interfaceC3564cN, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objB = fVar.b(this.f7068c)) == null) ? this.f7069d : objB;
        }
    }

    static final class d extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7070a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f7072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f7073d;

        static final class a extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f7074a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f7075b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f7076c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f7077d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, Object obj, Ed.b bVar) {
                super(2, bVar);
                this.f7076c = aVar;
                this.f7077d = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                a aVar = new a(this.f7076c, this.f7077d, bVar);
                aVar.f7075b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p451z1.c cVar, Ed.b bVar) {
                return ((a) create(cVar, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Fd.b.e();
                if (this.f7074a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                ((p451z1.c) this.f7075b).i(this.f7076c, this.f7077d);
                return Unit.f48228a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a aVar, Object obj, Ed.b bVar) {
            super(2, bVar);
            this.f7072c = aVar;
            this.f7073d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return c.this.new d(this.f7072c, this.f7073d, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((d) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f7070a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            InterfaceC4235i interfaceC4235i = c.this.f7057e;
            a aVar = new a(this.f7072c, this.f7073d, null);
            this.f7070a = 1;
            Object objA = j.a(interfaceC4235i, aVar, this);
            return objA == objE ? objE : objA;
        }
    }

    public c(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7053a = context;
        this.f7054b = name;
        this.f7055c = new ThreadLocal();
        this.f7056d = p433y1.a.b(name, new p397w1.b(new M9.a(this)), new M9.b(this), null, 8, null);
        this.f7057e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar, C4230d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(F.b(c.class).p(), "CorruptionException in " + cVar.f7054b + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.e(i.b(it, cVar.f7054b, null, 4, null));
    }

    private final InterfaceC4235i i(Context context) {
        return (InterfaceC4235i) this.f7056d.a(context, f7052f[0]);
    }

    public final f g(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (f) AbstractC3291j.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) AbstractC3291j.b(null, new b(null), 1, null);
    }

    public final Object j(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        return AbstractC3291j.b(null, new C0127c(key, obj, null), 1, null);
    }

    public final f k(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (f) AbstractC3291j.b(null, new d(key, obj, null), 1, null);
    }
}
