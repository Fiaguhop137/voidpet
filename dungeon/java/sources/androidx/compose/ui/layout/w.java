package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float b(p.a aVar, boolean z10, v[] vVarArr, float f10) {
        float f11 = Float.NaN;
        for (v vVar : vVarArr) {
            float fT = aVar.t(vVar, Float.NaN);
            if (Float.isNaN(f11)) {
                f11 = fT;
            } else if (z10 == (fT > f11)) {
                f11 = fT;
            }
        }
        return Float.isNaN(f11) ? f10 : f11;
    }
}
