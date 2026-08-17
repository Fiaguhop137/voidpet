package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f37826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f37827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37828c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0.b f37829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f37830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0.b f37831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f37832d;

        public a(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
            this.f37829a = bVar;
            this.f37830b = obj;
            this.f37831c = bVar2;
            this.f37832d = obj2;
        }
    }

    private L(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
        this.f37826a = new a(bVar, obj, bVar2, obj2);
        this.f37827b = obj;
        this.f37828c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C3155v.d(aVar.f37829a, 1, obj) + C3155v.d(aVar.f37831c, 2, obj2);
    }

    public static L d(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
        return new L(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC3145k abstractC3145k, a aVar, Object obj, Object obj2) {
        C3155v.E(abstractC3145k, aVar.f37829a, 1, obj);
        C3155v.E(abstractC3145k, aVar.f37831c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC3145k.S(i10) + AbstractC3145k.A(b(this.f37826a, obj, obj2));
    }

    a c() {
        return this.f37826a;
    }
}
