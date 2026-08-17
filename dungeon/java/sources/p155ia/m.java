package p155ia;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import p119ga.f;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f43835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f43836b = new a(null);

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f43837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f43838b;

            private a() {
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            void a(char[] cArr) {
                this.f43837a = cArr;
                this.f43838b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f43837a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f43837a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f43837a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f43838b == null) {
                    this.f43838b = new String(this.f43837a);
                }
                return this.f43838b;
            }
        }

        b(Appendable appendable) {
            this.f43835a = appendable;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f43835a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f43835a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f43835a.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f43835a.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f43836b.a(cArr);
            this.f43835a.append(this.f43836b, i10, i11 + i10);
        }
    }

    public static void a(f fVar, c cVar) {
        p172ja.m.f47138V.d(cVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }
}
