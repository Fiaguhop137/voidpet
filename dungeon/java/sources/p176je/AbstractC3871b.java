package p176je;

import Xd.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p320re.C4087l;
import p320re.EnumC4084i;
import p464ze.c;

/* JADX INFO: renamed from: je.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3871b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f47331c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f47332d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f47333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f47334b;

    /* JADX INFO: renamed from: je.b$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC3872c enumC3872c : EnumC3872c.values()) {
            String strG = enumC3872c.g();
            if (linkedHashMap.get(strG) == null) {
                linkedHashMap.put(strG, enumC3872c);
            }
        }
        f47332d = linkedHashMap;
    }

    public AbstractC3871b(D javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f47333a = javaTypeEnhancementState;
        this.f47334b = new ConcurrentHashMap();
    }

    private final Set b(Set set) {
        return set.contains(EnumC3872c.TYPE_USE) ? W.j(W.i(AbstractC3952n.W0(EnumC3872c.values()), EnumC3872c.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final w e(Object obj) {
        C4087l c4087lI;
        w wVarU = u(obj);
        if (wVarU != null) {
            return wVarU;
        }
        Pair pairW = w(obj);
        if (pairW == null) {
            return null;
        }
        Object first = pairW.getFirst();
        Set set = (Set) pairW.getSecond();
        O oT = t(obj);
        if (oT == null) {
            oT = s(first);
        }
        if (oT.h() || (c4087lI = i(first, C3870a.f47330a)) == null) {
            return null;
        }
        return new w(C4087l.b(c4087lI, null, oT.i(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return false;
    }

    private final C4087l i(Object obj, Function1 function1) {
        C4087l c4087lQ;
        C4087l c4087lQ2 = q(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (c4087lQ2 != null) {
            return c4087lQ2;
        }
        Object objV = v(obj);
        if (objV == null) {
            return null;
        }
        O oS = s(obj);
        if (oS.h() || (c4087lQ = q(objV, ((Boolean) function1.invoke(objV)).booleanValue())) == null) {
            return null;
        }
        return C4087l.b(c4087lQ, null, oS.i(), 1, null);
    }

    private final Object j(Object obj, c cVar) {
        for (Object obj2 : m(obj)) {
            if (Intrinsics.b(k(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean n(Object obj, c cVar) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = p320re.EnumC4086k.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p320re.C4087l q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            ze.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            je.D r2 = r5.f47333a
            kotlin.jvm.functions.Function1 r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            je.O r2 = (p176je.O) r2
            boolean r3 = r2.h()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = p176je.J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            re.k r6 = p320re.EnumC4086k.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = p176je.J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            re.k r6 = p320re.EnumC4086k.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = p176je.J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            re.k r6 = p320re.EnumC4086k.FORCE_FLEXIBILITY
            goto L8d
        L43:
            ze.c r3 = p176je.J.c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.b(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.k0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            re.k r6 = p320re.EnumC4086k.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            re.k r6 = p320re.EnumC4086k.NULLABLE
            goto L8d
        L8b:
            re.k r6 = p320re.EnumC4086k.NOT_NULL
        L8d:
            re.l r0 = new re.l
            boolean r1 = r2.i()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p176je.AbstractC3871b.q(java.lang.Object, boolean):re.l");
    }

    private final O r(Object obj) {
        c cVarK = k(obj);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(obj) : (O) this.f47333a.c().invoke(cVarK);
    }

    private final O s(Object obj) {
        O oT = t(obj);
        return oT != null ? oT : this.f47333a.d().c();
    }

    private final O t(Object obj) {
        Iterable iterableC;
        String str;
        O o10 = (O) this.f47333a.d().e().get(k(obj));
        if (o10 != null) {
            return o10;
        }
        Object objJ = j(obj, J.p());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) CollectionsKt.k0(iterableC)) == null) {
            return null;
        }
        O oD = this.f47333a.d().d();
        if (oD != null) {
            return oD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return O.WARN;
                }
            } else if (str.equals("STRICT")) {
                return O.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return O.IGNORE;
        }
        return null;
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f47333a.b() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        O oR = r(obj);
        if (oR == O.IGNORE) {
            oR = null;
        }
        if (oR == null) {
            return null;
        }
        return w.b(wVar, C4087l.b(wVar.d(), null, oR.i(), 1, null), null, false, 6, null);
    }

    private final Pair w(Object obj) {
        Object objJ;
        Object next;
        if (this.f47333a.d().f() || (objJ = j(obj, J.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (v(next) == null);
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            EnumC3872c enumC3872c = (EnumC3872c) f47332d.get((String) it2.next());
            if (enumC3872c != null) {
                linkedHashSet.add(enumC3872c);
            }
        }
        return new Pair(next, b(linkedHashSet));
    }

    protected abstract Iterable c(Object obj, boolean z10);

    public final E d(E e10, Iterable annotations) {
        EnumMap enumMapB;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.f47333a.b()) {
            ArrayList<w> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                w wVarE = e(it.next());
                if (wVarE != null) {
                    arrayList.add(wVarE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC3872c.class);
                for (w wVar : arrayList) {
                    for (EnumC3872c enumC3872c : wVar.e()) {
                        if (enumMap.containsKey(enumC3872c) && o()) {
                            w wVar2 = (w) enumMap.get(enumC3872c);
                            if (wVar2 != null) {
                                C4087l c4087lD = wVar2.d();
                                C4087l c4087lD2 = wVar.d();
                                if (!Intrinsics.b(c4087lD2, c4087lD) && (!c4087lD2.d() || c4087lD.d())) {
                                    wVar2 = (c4087lD2.d() || !c4087lD.d()) ? null : wVar;
                                }
                                enumMap.put(enumC3872c, wVar2);
                            }
                        } else {
                            enumMap.put(enumC3872c, wVar);
                        }
                    }
                }
                EnumMap enumMap2 = (e10 == null || (enumMapB = e10.b()) == null) ? new EnumMap(EnumC3872c.class) : new EnumMap(enumMapB);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC3872c enumC3872c2 = (EnumC3872c) entry.getKey();
                    w wVar3 = (w) entry.getValue();
                    if (wVar3 != null) {
                        enumMap2.put(enumC3872c2, wVar3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new E(enumMap2);
                }
            }
        }
        return e10;
    }

    public final EnumC4084i g(Iterable annotations) {
        EnumC4084i enumC4084i;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC4084i enumC4084i2 = null;
        while (it.hasNext()) {
            c cVarK = k(it.next());
            if (CollectionsKt.b0(J.o(), cVarK)) {
                enumC4084i = EnumC4084i.READ_ONLY;
            } else if (CollectionsKt.b0(J.l(), cVarK)) {
                enumC4084i = EnumC4084i.MUTABLE;
            } else {
                continue;
            }
            if (enumC4084i2 != null && enumC4084i2 != enumC4084i) {
                return null;
            }
            enumC4084i2 = enumC4084i;
        }
        return enumC4084i2;
    }

    public final C4087l h(Iterable annotations, Function1 forceWarning) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C4087l c4087l = null;
        while (it.hasNext()) {
            C4087l c4087lI = i(it.next(), forceWarning);
            if (c4087l != null) {
                if (c4087lI != null && !Intrinsics.b(c4087lI, c4087l) && (!c4087lI.d() || c4087l.d())) {
                    if (c4087lI.d() || !c4087l.d()) {
                        return null;
                    }
                }
            }
            c4087l = c4087lI;
        }
        return c4087l;
    }

    protected abstract c k(Object obj);

    protected abstract Object l(Object obj);

    protected abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Object objJ = j(annotation, o.a.f16362H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object annotation) {
        Object objV;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f47333a.d().f()) {
            return null;
        }
        if (CollectionsKt.b0(J.a(), k(annotation)) || n(annotation, J.f())) {
            return annotation;
        }
        if (!n(annotation, J.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f47334b;
        Object objL = l(annotation);
        Object obj = concurrentHashMap.get(objL);
        if (obj != null) {
            return obj;
        }
        Iterator it = m(annotation).iterator();
        do {
            if (!it.hasNext()) {
                objV = null;
                break;
            }
            objV = v(it.next());
        } while (objV == null);
        if (objV == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objV);
        return objPutIfAbsent == null ? objV : objPutIfAbsent;
    }
}
