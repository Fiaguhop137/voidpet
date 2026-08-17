package p408wc;

import Ac.g;
import Fc.d;
import Ic.e;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p191kb.b;

/* JADX INFO: loaded from: classes2.dex */
public class a extends e.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f56823b;

    public a(Context context) {
        this.f56823b = new e(context);
    }

    protected boolean A(b bVar) {
        return !bVar.getBoolean("vibrate", true);
    }

    protected boolean p(b bVar) {
        return bVar.getBoolean("autoDismiss", true);
    }

    protected Number q(b bVar) {
        if (bVar.g("badge")) {
            return Integer.valueOf(bVar.getInt("badge"));
        }
        return null;
    }

    protected JSONObject r(b bVar) {
        try {
            Map map = bVar.getMap("data");
            if (map != null) {
                return new JSONObject(map);
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    protected String s(b bVar) {
        return bVar.getString("categoryIdentifier", null);
    }

    protected Number t(b bVar) {
        try {
            if (bVar.g("color")) {
                return Integer.valueOf(Color.parseColor(bVar.getString("color")));
            }
            return null;
        } catch (IllegalArgumentException unused) {
            Log.e("expo-notifications", "Could not have parsed color passed in notification.");
            return null;
        }
    }

    protected d u(b bVar) {
        return d.g(bVar.getString("priority"));
    }

    protected Uri v(b bVar) {
        return this.f56823b.b(bVar.getString("sound"));
    }

    protected boolean w(b bVar) {
        return bVar.getBoolean("sticky", false);
    }

    protected long[] x(b bVar) {
        try {
            List listB = bVar.b("vibrate");
            if (listB == null) {
                return null;
            }
            long[] jArr = new long[listB.size()];
            for (int i10 = 0; i10 < listB.size(); i10++) {
                if (!(listB.get(i10) instanceof Number)) {
                    throw new g(i10, listB.get(i10));
                }
                jArr[i10] = ((Number) listB.get(i10)).longValue();
            }
            return jArr;
        } catch (g e10) {
            Log.w("expo-notifications", "Failed to set custom vibration pattern from the notification: " + e10.getMessage());
            return null;
        }
    }

    public e.b y(b bVar) {
        l(bVar.getString("title")).j(bVar.getString("subtitle")).k(bVar.getString("body")).d(r(bVar)).g(u(bVar)).c(q(bVar)).f(t(bVar)).b(p(bVar)).e(s(bVar)).i(w(bVar));
        if (z(bVar)) {
            n();
        } else {
            h(v(bVar));
        }
        if (A(bVar)) {
            o();
            return this;
        }
        m(x(bVar));
        return this;
    }

    protected boolean z(b bVar) {
        if (bVar.a("sound") instanceof Boolean) {
            return bVar.getBoolean("sound");
        }
        return v(bVar) == null;
    }
}
