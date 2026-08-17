package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterable, Closeable {

    public interface a {
        void a(Object obj, OutputStream outputStream);

        Object b(byte[] bArr);
    }

    public static c e(d dVar, a aVar) {
        return new b(dVar, aVar);
    }

    public static c g() {
        return new io.sentry.cache.tape.a();
    }

    public abstract void a(Object obj);

    public List c() {
        return h(size());
    }

    public void clear() {
        i(size());
    }

    public List h(int i10) {
        int iMin = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void i(int i10);

    public abstract int size();
}
