package W1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
