package p408wc;

import android.os.Bundle;
import com.google.firebase.messaging.T;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    private static Bundle a(T.b bVar) {
        if (bVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("body", bVar.a());
        bundle.putStringArray("bodyLocalizationArgs", bVar.b());
        bundle.putString("bodyLocalizationKey", bVar.c());
        bundle.putString("channelId", bVar.d());
        bundle.putString("clickAction", bVar.e());
        bundle.putString("color", bVar.f());
        bundle.putBoolean("usesDefaultLightSettings", bVar.g());
        bundle.putBoolean("usesDefaultSound", bVar.h());
        bundle.putBoolean("usesDefaultVibrateSettings", bVar.i());
        if (bVar.j() != null) {
            bundle.putLong("eventTime", bVar.j().longValue());
        } else {
            bundle.putString("eventTime", null);
        }
        bundle.putString("icon", bVar.k());
        if (bVar.l() != null) {
            bundle.putString("imageUrl", bVar.l().toString());
        } else {
            bundle.putString("imageUrl", null);
        }
        bundle.putIntArray("lightSettings", bVar.m());
        if (bVar.n() != null) {
            bundle.putString("link", bVar.n().toString());
        } else {
            bundle.putString("link", null);
        }
        bundle.putBoolean("localOnly", bVar.o());
        if (bVar.q() != null) {
            bundle.putInt("notificationCount", bVar.q().intValue());
        } else {
            bundle.putString("notificationCount", null);
        }
        if (bVar.r() != null) {
            bundle.putInt("notificationPriority", bVar.r().intValue());
        } else {
            bundle.putString("notificationPriority", null);
        }
        bundle.putString("sound", bVar.s());
        bundle.putBoolean("sticky", bVar.t());
        bundle.putString("tag", bVar.u());
        bundle.putString("ticker", bVar.v());
        bundle.putString("title", bVar.w());
        bundle.putStringArray("titleLocalizationArgs", bVar.x());
        bundle.putString("titleLocalizationKey", bVar.y());
        if (bVar.z() != null) {
            bundle.putLongArray("vibrateTimings", bVar.z());
        }
        if (bVar.A() != null) {
            bundle.putInt("visibility", bVar.A().intValue());
            return bundle;
        }
        bundle.putString("visibility", null);
        return bundle;
    }

    public static Bundle b(T t10) {
        Bundle bundle = new Bundle();
        bundle.putString("collapseKey", t10.a4());
        bundle.putBundle("data", c(t10.b4()));
        bundle.putString("from", t10.c4());
        bundle.putString("messageId", t10.d4());
        bundle.putString("messageType", t10.f4());
        bundle.putBundle("notification", a(t10.g4()));
        bundle.putInt("originalPriority", t10.h4());
        bundle.putInt("priority", t10.i4());
        bundle.putLong("sentTime", t10.j4());
        bundle.putString("to", t10.k4());
        bundle.putInt("ttl", t10.l4());
        return bundle;
    }

    private static Bundle c(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("dataString", (String) map.getOrDefault("body", null));
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }
}
