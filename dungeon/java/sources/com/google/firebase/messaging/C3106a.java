package com.google.firebase.messaging;

/* JADX INFO: renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3106a implements Q9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q9.a f37540a = new C3106a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0410a implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0410a f37541a = new C0410a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f37542b = P9.c.a("projectNumber").b(S9.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final P9.c f37543c = P9.c.a("messageId").b(S9.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final P9.c f37544d = P9.c.a("instanceId").b(S9.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final P9.c f37545e = P9.c.a("messageType").b(S9.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final P9.c f37546f = P9.c.a("sdkPlatform").b(S9.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final P9.c f37547g = P9.c.a("packageName").b(S9.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final P9.c f37548h = P9.c.a("collapseKey").b(S9.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final P9.c f37549i = P9.c.a("priority").b(S9.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final P9.c f37550j = P9.c.a("ttl").b(S9.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final P9.c f37551k = P9.c.a("topic").b(S9.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final P9.c f37552l = P9.c.a("bulkId").b(S9.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final P9.c f37553m = P9.c.a("event").b(S9.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final P9.c f37554n = P9.c.a("analyticsLabel").b(S9.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final P9.c f37555o = P9.c.a("campaignId").b(S9.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final P9.c f37556p = P9.c.a("composerLabel").b(S9.a.b().c(15).a()).a();

        private C0410a() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p047ca.a aVar, P9.e eVar) {
            eVar.a(f37542b, aVar.l());
            eVar.e(f37543c, aVar.h());
            eVar.e(f37544d, aVar.g());
            eVar.e(f37545e, aVar.i());
            eVar.e(f37546f, aVar.m());
            eVar.e(f37547g, aVar.j());
            eVar.e(f37548h, aVar.d());
            eVar.b(f37549i, aVar.k());
            eVar.b(f37550j, aVar.o());
            eVar.e(f37551k, aVar.n());
            eVar.a(f37552l, aVar.b());
            eVar.e(f37553m, aVar.f());
            eVar.e(f37554n, aVar.a());
            eVar.a(f37555o, aVar.c());
            eVar.e(f37556p, aVar.e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f37557a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f37558b = P9.c.a("messagingClientEvent").b(S9.a.b().c(1).a()).a();

        private b() {
        }

        @Override // P9.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p047ca.b bVar, P9.e eVar) {
            eVar.e(f37558b, bVar.a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements P9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f37559a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P9.c f37560b = P9.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // P9.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (P9.e) obj2);
        }

        public void b(L l10, P9.e eVar) {
            throw null;
        }
    }

    private C3106a() {
    }

    @Override // Q9.a
    public void a(Q9.b bVar) {
        bVar.a(L.class, c.f37559a);
        bVar.a(p047ca.b.class, b.f37557a);
        bVar.a(p047ca.a.class, C0410a.f37541a);
    }
}
