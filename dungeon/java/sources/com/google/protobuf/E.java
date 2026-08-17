package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E extends F {

    static class a implements Map.Entry {
        public abstract E a();
    }

    static class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator f37748a;

        public b(Iterator it) {
            this.f37748a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f37748a.next();
            entry.getValue();
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37748a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f37748a.remove();
        }
    }
}
