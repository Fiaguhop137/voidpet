package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f1059a = new a();

    public static final class a implements b {
        a() {
        }

        @Override // C.b
        public float a(long j10, O0.d dVar) {
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(int i10) {
        return new e(i10);
    }

    public static final b b(float f10) {
        return new d(f10, null);
    }
}
