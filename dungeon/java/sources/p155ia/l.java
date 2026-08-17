package p155ia;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p119ga.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43833a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f43834b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super(null);
                this.f43834b = method;
            }

            @Override // ia.l.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f43834b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: ia.l$b$b, reason: collision with other inner class name */
        class C0517b extends b {
            C0517b() {
                super(null);
            }

            @Override // ia.l.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (e.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0517b();
            }
            f43833a = aVar;
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f43833a.a(accessibleObject, obj);
    }

    public static n b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return n.ALLOW;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
