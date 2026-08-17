package p050cd;

import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class m extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27446b;

    public m(String str, String str2, int i10) {
        this(str, str2, i10, null);
    }

    public m(String str, String str2, int i10, Throwable th) {
        super(str, th);
        this.f27445a = i10;
        this.f27446b = str2;
    }

    public m(String str, CharBuffer charBuffer) {
        this(str, a(charBuffer), charBuffer.position(), null);
    }

    public m(String str, CharBuffer charBuffer, Throwable th) {
        this(str, a(charBuffer), charBuffer.position(), th);
    }

    private static String a(CharBuffer charBuffer) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charBuffer.position() + charBuffer.remaining(); i10++) {
            sb2.append(charBuffer.get(i10));
        }
        return sb2.toString();
    }
}
