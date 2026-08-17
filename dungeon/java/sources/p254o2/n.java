package p254o2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f50404a = new a();

    class a implements n {
        a() {
        }

        @Override // p254o2.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // p254o2.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // p254o2.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
