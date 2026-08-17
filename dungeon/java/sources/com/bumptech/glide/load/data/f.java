package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a f28657b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28658a = new HashMap();

    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f28659a;

        b(Object obj) {
            this.f28659a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f28659a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            L4.k.d(obj);
            aVar = (e.a) this.f28658a.get(obj.getClass());
            if (aVar == null) {
                for (e.a aVar2 : this.f28658a.values()) {
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f28657b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f28658a.put(aVar.a(), aVar);
    }
}
