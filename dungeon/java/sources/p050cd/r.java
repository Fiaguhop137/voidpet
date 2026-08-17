package p050cd;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    protected static String a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Key can not be null or empty");
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((i10 == 0 && cCharAt != '*' && !e(cCharAt)) || (!e(cCharAt) && !d(cCharAt) && cCharAt != '_' && cCharAt != '-' && cCharAt != '.' && cCharAt != '*')) {
                throw new IllegalArgumentException(String.format("Invalid character in key at position %d: '%c' (0x%04x)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt)));
            }
        }
        return str;
    }

    protected static Map b(Map map) {
        Objects.requireNonNull(map, "value must not be null");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
        return map;
    }

    protected static boolean c(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    protected static boolean d(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    protected static boolean e(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }
}
