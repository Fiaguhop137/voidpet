package K0;

import Ad.n;
import C0.R0;
import C0.T0;
import android.text.style.TtsSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final TtsSpan a(R0 r10) {
        if (r10 instanceof T0) {
            return b((T0) r10);
        }
        throw new n();
    }

    public static final TtsSpan b(T0 t10) {
        return new TtsSpan.VerbatimBuilder(t10.a()).build();
    }
}
