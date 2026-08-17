package O7;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.a f8407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7.a f8408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8409d;

    c(Context context, X7.a aVar, X7.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8406a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f8407b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f8408c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8409d = str;
    }

    @Override // O7.h
    public Context b() {
        return this.f8406a;
    }

    @Override // O7.h
    public String c() {
        return this.f8409d;
    }

    @Override // O7.h
    public X7.a d() {
        return this.f8408c;
    }

    @Override // O7.h
    public X7.a e() {
        return this.f8407b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f8406a.equals(hVar.b()) && this.f8407b.equals(hVar.e()) && this.f8408c.equals(hVar.d()) && this.f8409d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f8406a.hashCode() ^ 1000003) * 1000003) ^ this.f8407b.hashCode()) * 1000003) ^ this.f8408c.hashCode()) * 1000003) ^ this.f8409d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f8406a + ", wallClock=" + this.f8407b + ", monotonicClock=" + this.f8408c + ", backendName=" + this.f8409d + "}";
    }
}
