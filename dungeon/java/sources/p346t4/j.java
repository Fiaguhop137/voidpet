package p346t4;

import L4.h;
import L4.k;
import L4.l;
import M4.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p199l1.e;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f54468a = new h(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f54469b = M4.a.d(10, new a());

    class a implements M4.a.d {
        a() {
        }

        @Override // M4.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements M4.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f54471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f54472b = c.a();

        b(MessageDigest messageDigest) {
            this.f54471a = messageDigest;
        }

        @Override // M4.a.f
        public c h() {
            return this.f54472b;
        }
    }

    private String a(f fVar) {
        b bVar = (b) k.d(this.f54469b.acquire());
        try {
            fVar.b(bVar.f54471a);
            return l.x(bVar.f54471a.digest());
        } finally {
            this.f54469b.a(bVar);
        }
    }

    public String b(f fVar) {
        String strA;
        synchronized (this.f54468a) {
            strA = (String) this.f54468a.g(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f54468a) {
            this.f54468a.k(fVar, strA);
        }
        return strA;
    }
}
