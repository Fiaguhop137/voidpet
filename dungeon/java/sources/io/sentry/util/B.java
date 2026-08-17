package io.sentry.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f46557a = new b(null);

    private static class b extends ThreadLocal {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z initialValue() {
            return new z();
        }
    }

    public static z a() {
        return (z) f46557a.get();
    }
}
