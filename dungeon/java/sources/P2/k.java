package P2;

import R1.y;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class k {
    public static String a(R1.r rVar) {
        String str = rVar.f10277o;
        if (y.t(str)) {
            return "video/mp4";
        }
        if (y.o(str)) {
            return "audio/mp4";
        }
        if (!y.q(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, "image/heic")) {
            return "image/heif";
        }
        return Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4";
    }

    public static String b(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((w) it.next()).f8795a.f8766g.f10277o;
            if (y.t(str2)) {
                return "video/mp4";
            }
            if (y.o(str2)) {
                z10 = true;
            } else if (y.q(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
