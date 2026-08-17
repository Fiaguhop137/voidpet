package Re;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends Ye.e implements Iterable, Nd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11157b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r0 f11158c = new r0(CollectionsKt.l());

    public static final class a extends Ye.z {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Ye.z
        public int c(ConcurrentHashMap concurrentHashMap, String key, Function1 compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final r0 j(List attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? k() : new r0(attributes, null);
        }

        public final r0 k() {
            return r0.f11158c;
        }
    }

    private r0(p0 p0Var) {
        this(CollectionsKt.e(p0Var));
    }

    private r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            g(p0Var.b(), p0Var);
        }
    }

    public /* synthetic */ r0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // Ye.AbstractC1666a
    protected Ye.z c() {
        return f11157b;
    }

    public final r0 k(r0 other) {
        p0 p0VarA;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f11157b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) a().get(iIntValue);
            p0 p0Var2 = (p0) other.a().get(iIntValue);
            if (p0Var == null) {
                p0VarA = p0Var2 != null ? p0Var2.a(p0Var) : null;
            } else {
                p0VarA = p0Var.a(p0Var2);
            }
            p034bf.a.a(arrayList, p0VarA);
        }
        return f11157b.j(arrayList);
    }

    public final boolean n(p0 attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return a().get(f11157b.f(attribute.b())) != null;
    }

    public final r0 p(r0 other) {
        p0 p0VarC;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f11157b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) a().get(iIntValue);
            p0 p0Var2 = (p0) other.a().get(iIntValue);
            if (p0Var == null) {
                p0VarC = p0Var2 != null ? p0Var2.c(p0Var) : null;
            } else {
                p0VarC = p0Var.c(p0Var2);
            }
            p034bf.a.a(arrayList, p0VarC);
        }
        return f11157b.j(arrayList);
    }

    public final r0 q(p0 attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (n(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new r0(attribute);
        }
        return f11157b.j(CollectionsKt.D0(CollectionsKt.U0(this), attribute));
    }

    public final r0 s(p0 attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            Ye.c cVarA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVarA) {
                if (!Intrinsics.b((p0) obj, attribute)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != a().a()) {
                return f11157b.j(arrayList);
            }
        }
        return this;
    }
}
