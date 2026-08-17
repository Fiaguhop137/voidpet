package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1980c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C1980c f24330c = new C1980c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24331a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24332b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f24333a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f24334b;

        a(Map map) {
            this.f24334b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1987j.a aVar = (AbstractC1987j.a) entry.getValue();
                List arrayList = (List) this.f24333a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f24333a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC1994q, aVar, obj);
                }
            }
        }

        void a(InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar, Object obj) {
            b((List) this.f24333a.get(aVar), interfaceC1994q, aVar, obj);
            b((List) this.f24333a.get(AbstractC1987j.a.ON_ANY), interfaceC1994q, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f24335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f24336b;

        b(int i10, Method method) {
            this.f24335a = i10;
            this.f24336b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1994q interfaceC1994q, AbstractC1987j.a aVar, Object obj) {
            try {
                int i10 = this.f24335a;
                if (i10 == 0) {
                    this.f24336b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f24336b.invoke(obj, interfaceC1994q);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f24336b.invoke(obj, interfaceC1994q, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24335a == bVar.f24335a && this.f24336b.getName().equals(bVar.f24336b.getName());
        }

        public int hashCode() {
            return (this.f24335a * 31) + this.f24336b.getName().hashCode();
        }
    }

    C1980c() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f24334b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f24334b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC1987j.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            A a10 = (A) method.getAnnotation(A.class);
            if (a10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1994q.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC1987j.a aVarValue = a10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1987j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1987j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f24331a.put(cls, aVar);
        this.f24332b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, AbstractC1987j.a aVar, Class cls) {
        AbstractC1987j.a aVar2 = (AbstractC1987j.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f24336b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f24331a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f24332b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((A) method.getAnnotation(A.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f24332b.put(cls, Boolean.FALSE);
        return false;
    }
}
