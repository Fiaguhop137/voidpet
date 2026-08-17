package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f44328b;

    public F(String str) {
        Pattern patternCompile;
        this.f44327a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            AbstractC3710g2.r().g().getLogger().c(EnumC3721i3.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f44328b = patternCompile;
    }

    public String a() {
        return this.f44327a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f44328b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f44327a, ((F) obj).f44327a);
    }

    public int hashCode() {
        return Objects.hash(this.f44327a);
    }
}
