package p170j8;

import android.os.Bundle;

/* JADX INFO: renamed from: j8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3859y implements h8.a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3859y f47055b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47056a;

    /* JADX INFO: renamed from: j8.y$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47057a;

        /* synthetic */ a(B b10) {
        }

        public C3859y a() {
            return new C3859y(this.f47057a, null);
        }

        public a b(String str) {
            this.f47057a = str;
            return this;
        }
    }

    /* synthetic */ C3859y(String str, C c10) {
        this.f47056a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f47056a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3859y) {
            return AbstractC3851p.a(this.f47056a, ((C3859y) obj).f47056a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f47056a);
    }
}
