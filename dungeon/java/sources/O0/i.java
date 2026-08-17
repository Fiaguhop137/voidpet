package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final long a(float f10, float f11) {
        return k.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
