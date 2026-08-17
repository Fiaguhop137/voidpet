package p295q7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p111g2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f51603a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f51604b;

    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: q7.b$b, reason: collision with other inner class name */
    private static final class C0618b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f51605a;

        public C0618b(long j10) {
            this.f51605a = j10;
        }

        @Override // q7.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // q7.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // q7.b.a
        public void c() {
            p295q7.a.i(this.f51605a);
        }
    }

    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f51606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f51607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f51608c;

        public c(long j10, String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.f51606a = j10;
            this.f51607b = sectionName;
            this.f51608c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f51608c.add(str + ": " + str2);
        }

        @Override // q7.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // q7.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // q7.b.a
        public void c() {
            String str;
            long j10 = this.f51606a;
            String str2 = this.f51607b;
            if (!b.f51604b || this.f51608c.isEmpty()) {
                str = "";
            } else {
                str = " (" + h.a(", ", this.f51608c) + ")";
            }
            p295q7.a.c(j10, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0618b(j10);
    }
}
