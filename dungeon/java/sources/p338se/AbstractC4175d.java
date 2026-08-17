package p338se;

import Ne.EnumC1230d;
import Ne.InterfaceC1231e;
import Ne.N;
import Qe.g;
import Qe.n;
import Re.S;
import Xd.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p015ae.h0;
import p374ue.o;
import p410we.b;
import p446ye.h;
import p464ze.f;

/* JADX INFO: renamed from: se.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4175d extends AbstractC4176e implements InterfaceC1231e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f53565c;

    /* JADX INFO: renamed from: se.d$a */
    public static final class a implements x.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f53567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f53568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f53569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f53570e;

        /* JADX INFO: renamed from: se.d$a$a, reason: collision with other inner class name */
        public final class C0655a extends b implements x.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f53571d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0655a(a aVar, A signature) {
                super(aVar, signature);
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f53571d = aVar;
            }

            @Override // se.x.e
            public x.a c(int i10, p464ze.b classId, h0 source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                A aE = A.f53535b.e(d(), i10);
                List arrayList = (List) this.f53571d.f53567b.get(aE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f53571d.f53567b.put(aE, arrayList);
                }
                return AbstractC4175d.this.y(classId, source, arrayList);
            }
        }

        /* JADX INFO: renamed from: se.d$a$b */
        public class b implements x.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final A f53572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayList f53573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f53574c;

            public b(a aVar, A signature) {
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f53574c = aVar;
                this.f53572a = signature;
                this.f53573b = new ArrayList();
            }

            @Override // se.x.c
            public void a() {
                if (this.f53573b.isEmpty()) {
                    return;
                }
                this.f53574c.f53567b.put(this.f53572a, this.f53573b);
            }

            @Override // se.x.c
            public x.a b(p464ze.b classId, h0 source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                return AbstractC4175d.this.y(classId, source, this.f53573b);
            }

            protected final A d() {
                return this.f53572a;
            }
        }

        a(HashMap map, x xVar, HashMap map2, HashMap map3) {
            this.f53567b = map;
            this.f53568c = xVar;
            this.f53569d = map2;
            this.f53570e = map3;
        }

        @Override // se.x.d
        public x.e a(f name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            A.a aVar = A.f53535b;
            String strG = name.g();
            Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
            return new C0655a(this, aVar.d(strG, desc));
        }

        @Override // se.x.d
        public x.c b(f name, String desc, Object obj) {
            Object objI;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            A.a aVar = A.f53535b;
            String strG = name.g();
            Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
            A a10 = aVar.a(strG, desc);
            if (obj != null && (objI = AbstractC4175d.this.I(desc, obj)) != null) {
                this.f53570e.put(a10, objI);
            }
            return new b(this, a10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4175d(n storageManager, v kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f53565c = storageManager.i(new C4172a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(C4178g loadConstantFromProperty, A it) {
        Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final C4178g H(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.b(new a(map, xVar, map3, map2), r(xVar));
        return new C4178g(map, map2, map3);
    }

    private final Object J(N n10, o oVar, EnumC1230d enumC1230d, S s10, Function2 function2) {
        Object objInvoke;
        x xVarP = p(n10, AbstractC4176e.f53575b.a(n10, true, true, b.f56857B.d(oVar.Y()), h.f(oVar), u(), v()));
        if (xVarP == null) {
            return null;
        }
        A aS = s(oVar, n10.b(), n10.d(), enumC1230d, xVarP.c().d().d(n.f53617b.a()));
        if (aS == null || (objInvoke = function2.invoke(this.f53565c.invoke(xVarP), aS)) == null) {
            return null;
        }
        return s.d(s10) ? M(objInvoke) : objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(C4178g loadConstantFromProperty, A it) {
        Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4178g L(AbstractC4175d abstractC4175d, x kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        return abstractC4175d.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p338se.AbstractC4176e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C4178g q(x binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return (C4178g) this.f53565c.invoke(binaryClass);
    }

    protected final boolean F(p464ze.b annotationClassId, Map arguments) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!Intrinsics.b(annotationClassId, Wd.a.f15073a.a())) {
            return false;
        }
        Object obj = arguments.get(f.p("value"));
        Fe.s sVar = obj instanceof Fe.s ? (Fe.s) obj : null;
        if (sVar == null) {
            return false;
        }
        Object objB = sVar.b();
        Fe.s.b.C0064b c0064b = objB instanceof Fe.s.b.C0064b ? (Fe.s.b.C0064b) objB : null;
        if (c0064b == null) {
            return false;
        }
        return w(c0064b.b());
    }

    protected abstract Object I(String str, Object obj);

    protected abstract Object M(Object obj);

    @Override // Ne.InterfaceC1231e
    public Object c(N container, o proto, S expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return J(container, proto, EnumC1230d.PROPERTY_GETTER, expectedType, C4173b.f53563a);
    }

    @Override // Ne.InterfaceC1231e
    public Object l(N container, o proto, S expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return J(container, proto, EnumC1230d.PROPERTY, expectedType, C4174c.f53564a);
    }
}
