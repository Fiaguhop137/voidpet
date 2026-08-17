package p339sf;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4189h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f53869b;

    public C4189h(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f53868a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f53869b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f53869b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f53869b.get("realm");
    }

    public final String c() {
        return this.f53868a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4189h)) {
            return false;
        }
        C4189h c4189h = (C4189h) obj;
        return Intrinsics.b(c4189h.f53868a, this.f53868a) && Intrinsics.b(c4189h.f53869b, this.f53869b);
    }

    public int hashCode() {
        return ((899 + this.f53868a.hashCode()) * 31) + this.f53869b.hashCode();
    }

    public String toString() {
        return this.f53868a + " authParams=" + this.f53869b;
    }
}
