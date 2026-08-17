package Of;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Writer implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f8564a;

    public a() {
        this.f8564a = new StringBuilder();
    }

    public a(int i10) {
        this.f8564a = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f8564a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f8564a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f8564a.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f8564a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f8564a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f8564a.append(cArr, i10, i11);
        }
    }
}
