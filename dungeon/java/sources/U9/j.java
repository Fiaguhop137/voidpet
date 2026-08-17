package U9;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13412a;

        a(int i10) {
            this.f13412a = i10;
        }

        public int g() {
            return this.f13412a;
        }
    }

    a b(String str);
}
