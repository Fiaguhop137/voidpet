package p075e2;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    private static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(InterfaceC3263m interfaceC3263m) {
        Map mapH = interfaceC3263m.h();
        if (mapH == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(mapH, "LicenseDurationRemaining")), Long.valueOf(a(mapH, "PlaybackDurationRemaining")));
    }
}
