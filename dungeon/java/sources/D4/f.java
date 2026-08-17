package D4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f2143a = new ArrayList();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f2144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f2145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f2146c;

        a(Class cls, Class cls2, e eVar) {
            this.f2144a = cls;
            this.f2145b = cls2;
            this.f2146c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f2144a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2145b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f2143a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f2146c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f2143a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f2145b)) {
                arrayList.add(aVar.f2145b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f2143a.add(new a(cls, cls2, eVar));
    }
}
