package L7;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6392a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f6392a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f6392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f6392a.equals(((c) obj).f6392a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6392a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f6392a + "\"}";
    }
}
