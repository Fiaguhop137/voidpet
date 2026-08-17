package Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a(b bVar) {
        float x10 = bVar.a().getX();
        float y10 = bVar.a().getY();
        return p019b0.e.e((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L));
    }
}
