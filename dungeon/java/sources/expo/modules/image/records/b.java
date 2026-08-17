package expo.modules.image.records;

import Db.k;
import H4.f;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a {
        public static double a(b bVar) {
            return ((double) (bVar.getWidth() * bVar.getHeight())) * bVar.getScale() * bVar.getScale();
        }

        public static boolean b(b bVar) {
            return true;
        }
    }

    k createGlideModelProvider(Context context);

    f createGlideOptions(Context context);

    int getHeight();

    double getPixelCount();

    double getScale();

    int getWidth();

    boolean usesPlaceholderContentFit();
}
