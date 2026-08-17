package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1.b f23756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f23757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f23758c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f23759d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f23760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f23761b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f23760a = new SparseArray(i10);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f23760a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final p b() {
            return this.f23761b;
        }

        void c(p pVar, int i10, int i11) {
            a aVarA = a(pVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f23760a.put(pVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(pVar, i10 + 1, i11);
            } else {
                aVarA.f23761b = pVar;
            }
        }
    }

    private n(Typeface typeface, D1.b bVar) {
        this.f23759d = typeface;
        this.f23756a = bVar;
        this.f23757b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(D1.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f23757b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            p128h1.n.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            p128h1.n.b();
        }
    }

    public char[] c() {
        return this.f23757b;
    }

    public D1.b d() {
        return this.f23756a;
    }

    int e() {
        return this.f23756a.l();
    }

    a f() {
        return this.f23758c;
    }

    Typeface g() {
        return this.f23759d;
    }

    void h(p pVar) {
        p199l1.g.h(pVar, "emoji metadata cannot be null");
        p199l1.g.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f23758c.c(pVar, 0, pVar.c() - 1);
    }
}
