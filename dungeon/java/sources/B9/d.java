package B9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements o {

    static abstract class a extends d {
        a() {
        }

        @Override // B9.o
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f604a;

        b(char c10) {
            this.f604a = c10;
        }

        @Override // B9.d
        public boolean e(char c10) {
            return c10 == this.f604a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f604a) + "')";
        }
    }

    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f605a;

        c(String str) {
            this.f605a = (String) n.j(str);
        }

        public final String toString() {
            return this.f605a;
        }
    }

    /* JADX INFO: renamed from: B9.d$d, reason: collision with other inner class name */
    private static final class C0012d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f606b = new C0012d();

        private C0012d() {
            super("CharMatcher.none()");
        }

        @Override // B9.d
        public int c(CharSequence charSequence, int i10) {
            n.l(i10, charSequence.length());
            return -1;
        }

        @Override // B9.d
        public boolean e(char c10) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0012d.f606b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.l(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
