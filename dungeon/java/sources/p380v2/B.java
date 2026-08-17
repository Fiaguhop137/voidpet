package p380v2;

import J2.e;
import J2.k;
import R1.x;
import U1.S;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f55931c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55932a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55933b = -1;

    private boolean b(String str) {
        Matcher matcher = f55931c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) S.i(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) S.i(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f55932a = i10;
            this.f55933b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f55932a == -1 || this.f55933b == -1) ? false : true;
    }

    public boolean c(x xVar) {
        for (int i10 = 0; i10 < xVar.e(); i10++) {
            x.a aVarD = xVar.d(i10);
            if (aVarD instanceof e) {
                e eVar = (e) aVarD;
                if ("iTunSMPB".equals(eVar.f5703c) && b(eVar.f5704d)) {
                    return true;
                }
            } else if (aVarD instanceof k) {
                k kVar = (k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f5716b) && "iTunSMPB".equals(kVar.f5717c) && b(kVar.f5718d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
