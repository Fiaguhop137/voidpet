package p408wc;

import Hc.a;
import Hc.d;
import Ic.g;
import Ic.h;
import Ic.l;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONObject;
import p372uc.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static Bundle a(a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("title", aVar.getTitle());
        bundle.putString("subtitle", aVar.W3());
        bundle.putString("body", aVar.getText());
        if (aVar.Q1() != null) {
            bundle.putString("color", String.format("#%08X", Integer.valueOf(aVar.Q1().intValue())));
        }
        if (aVar.E3() != null) {
            bundle.putInt("badge", aVar.E3().intValue());
        } else {
            bundle.putString("badge", null);
        }
        if (aVar.P2()) {
            bundle.putString("sound", "default");
        } else if (aVar.c3() != null) {
            bundle.putString("sound", "custom");
        } else {
            bundle.putString("sound", null);
        }
        if (aVar.P() != null) {
            bundle.putString("priority", aVar.P().i());
        }
        if (aVar.k1() != null) {
            bundle.putLongArray("vibrationPattern", aVar.k1());
        }
        bundle.putBoolean("autoDismiss", aVar.y0());
        if (aVar.o3() != null) {
            bundle.putString("categoryIdentifier", aVar.o3());
        }
        bundle.putBoolean("sticky", aVar.N3());
        return bundle;
    }

    public static Bundle b(Ic.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBundle("request", c(aVar.f()));
        bundle.putLong("date", aVar.j().getTime());
        return bundle;
    }

    public static Bundle c(g gVar) {
        JSONObject body;
        Bundle bundle = new Bundle();
        bundle.putString("identifier", gVar.j());
        d dVarK = gVar.k();
        bundle.putBundle("trigger", dVarK == null ? null : dVarK.e2());
        Bundle bundleA = a(gVar.f());
        if (bundleA.getBundle("data") == null) {
            if (dVarK instanceof Jc.a) {
                Map mapB4 = ((Jc.a) dVarK).f().b4();
                String str = (String) mapB4.get("body");
                if (e.f(str)) {
                    bundleA.putString("dataString", str);
                } else {
                    bundleA.putBundle("data", e(mapB4));
                }
            } else if (((dVarK instanceof Hc.e) || (dVarK instanceof Nc.a) || dVarK == null) && (body = gVar.f().getBody()) != null) {
                bundleA.putString("dataString", body.toString());
            }
        }
        bundle.putBundle("content", bundleA);
        return bundle;
    }

    public static Bundle d(h hVar) {
        Bundle bundle = new Bundle();
        bundle.putString("actionIdentifier", hVar.j());
        bundle.putBundle("notification", b(hVar.k()));
        if (hVar instanceof l) {
            bundle.putString("userText", ((l) hVar).l());
        }
        return bundle;
    }

    public static Bundle e(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static Bundle f(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("title", bundle.getString("title"));
        String string = bundle.getString("body");
        if (e.f(string)) {
            bundle2.putString("dataString", string);
            bundle2.putString("body", bundle.getString("message"));
        } else {
            bundle2.putBundle("data", e.c(bundle));
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("type", "push");
        bundle3.putString("channelId", bundle.getString("channelId"));
        Bundle bundle4 = new Bundle();
        bundle4.putString("identifier", bundle.getString("google.message_id"));
        bundle4.putBundle("trigger", bundle3);
        bundle4.putBundle("content", bundle2);
        Bundle bundle5 = new Bundle();
        bundle5.putLong("date", bundle.getLong("google.sent_time"));
        bundle5.putBundle("request", bundle4);
        Bundle bundle6 = new Bundle();
        bundle6.putString("actionIdentifier", "expo.modules.notifications.actions.DEFAULT");
        bundle6.putBundle("notification", bundle5);
        return bundle6;
    }
}
