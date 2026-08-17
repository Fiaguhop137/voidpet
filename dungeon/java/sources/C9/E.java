package C9;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    private static class a extends AbstractC0860c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient B9.t f1486g;

        a(Map map, B9.t tVar) {
            super(map);
            this.f1486g = (B9.t) B9.n.j(tVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // C9.AbstractC0861d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public List r() {
            return (List) this.f1486g.get();
        }

        @Override // C9.AbstractC0863f
        Map d() {
            return t();
        }

        @Override // C9.AbstractC0863f
        Set f() {
            return u();
        }
    }

    static abstract class b extends AbstractCollection {
        b() {
        }

        abstract C a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(C c10, Object obj) {
        if (obj == c10) {
            return true;
        }
        if (obj instanceof C) {
            return c10.asMap().equals(((C) obj).asMap());
        }
        return false;
    }

    public static y b(Map map, B9.t tVar) {
        return new a(map, tVar);
    }
}
