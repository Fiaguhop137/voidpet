package M0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10, Function0 function0) {
        return Float.isNaN(f10) ? ((Number) function0.invoke()).floatValue() : f10;
    }
}
