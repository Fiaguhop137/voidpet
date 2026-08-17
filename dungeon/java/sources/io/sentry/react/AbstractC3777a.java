package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import io.sentry.C3697e;
import io.sentry.EnumC3721i3;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.react.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3777a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    public static C3697e a(ReadableMap readableMap) {
        byte b10;
        C3697e c3697e = new C3697e();
        if (readableMap.hasKey("message")) {
            c3697e.I(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            c3697e.K(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            c3697e.F(readableMap.getString("category"));
        }
        if (readableMap.hasKey("origin")) {
            c3697e.J(readableMap.getString("origin"));
        } else {
            c3697e.J("react-native");
        }
        if (readableMap.hasKey("level")) {
            switch (readableMap.getString("level")) {
                case "info":
                    b10 = 4;
                    break;
                case "debug":
                    b10 = 2;
                    break;
                case "error":
                    b10 = 3;
                    break;
                case "fatal":
                    b10 = 0;
                    break;
                case "warning":
                    b10 = 1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                c3697e.H(EnumC3721i3.FATAL);
            } else if (b10 == 1) {
                c3697e.H(EnumC3721i3.WARNING);
            } else if (b10 == 2) {
                c3697e.H(EnumC3721i3.DEBUG);
            } else if (b10 != 3) {
                c3697e.H(EnumC3721i3.INFO);
            } else {
                c3697e.H(EnumC3721i3.ERROR);
            }
        }
        if (readableMap.hasKey("data")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("data").toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    c3697e.G(entry.getKey(), entry.getValue());
                }
            }
        }
        return c3697e;
    }

    public static String b(ReadableMap readableMap) {
        String string = readableMap.hasKey("category") ? readableMap.getString("category") : null;
        if (string != null && "navigation".equals(string)) {
            ReadableMap map = readableMap.hasKey("data") ? readableMap.getMap("data") : null;
            if (map == null) {
                return null;
            }
            try {
                if (map.hasKey("to")) {
                    return map.getString("to");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
